package App;

import Asm.Instruction;
import Asm.InstructionCreator;
import Asm.InstructionData;
import CpuModel.ProcessingUnit;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.Scanner;

public class Interpreter {
    private ProcessingUnit processingUnit;
    private Parser parser;

    public Interpreter() {
        processingUnit = ProcessingUnit.getInstance();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            try {
                String input = scanner.nextLine();
                parser = new Parser(input);

                String tokenString = parser.getTokenStreamString();
                InstructionData instructionData = Parser.getInstructionData(tokenString);
                //System.out.println(instructionData);

                InstructionData evaluatedInstructionData = evaluateInstructionData(instructionData);
                //System.out.println(evaluatedInstructionData);

                Instruction instruction = InstructionCreator.create(evaluatedInstructionData);
                instruction.execute();
            } catch(ParseCancellationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private InstructionData evaluateInstructionData(InstructionData instructionData) {
        InstructionData evaluatedInstructionData = new InstructionData();
        evaluatedInstructionData.setType(instructionData.getType());
        evaluatedInstructionData.setParam1(processingUnit.evaluateRegisters(instructionData.getParam1()));
        evaluatedInstructionData.setParam2(instructionData.getParam2());
        return evaluatedInstructionData;
    }
}
