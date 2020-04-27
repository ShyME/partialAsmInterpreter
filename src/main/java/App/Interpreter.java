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
        while(scanner.hasNextLine()) {
            try {
                String input = scanner.nextLine();
                if(input.equals("\n") || input.equals(""))
                    continue;
                parser = new Parser(input);

                InstructionData instructionData = parser.buildData();

                Instruction instruction = InstructionCreator.create(instructionData);
                instruction.execute();
            } catch(ParseCancellationException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
