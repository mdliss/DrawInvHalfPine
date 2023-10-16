// /////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           M6.19 Zylabs
// Course:          CS 200, Spring, 2023
//
// Author:          Max Liss-'s-Gravemade
// Email:           lisssgravema@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html;
//         counting for loop
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Scanner;

/**
 * Allows the user to draw an inverted half pine tree using a specified symbol, pine trunk width,
 * and pine branch width. Prompts the user for these values and then generates the corresponding
 * pine tree layers. Ensures that the pine branch width is greater than the pine trunk width.
 *
 * @author Max Liss-'s-Gravemade
 */
public class DrawInvHalfPine {

    /**
     * Takes user input for the symbol, pine trunk width, and pine branch width. Then draws an
     * inverted half pine tree with the specified parameters.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Initialize variables
        Scanner scnr = new Scanner(System.in);
        int pineTrunkWidth = 0;
        int pineBranchWidth = 0;
        String symbol;

        // Prompt user for symbol
        System.out.print("Enter the symbol: ");
        symbol = scnr.next();

        // Prompt user for pine trunk width
        System.out.print("Enter the pine trunk width: ");
        pineTrunkWidth = scnr.nextInt();

        // Ensure pine branch width is greater than pine trunk width
        while (pineBranchWidth <= pineTrunkWidth) {
            System.out.print("Enter the pine branch width: ");
            pineBranchWidth = scnr.nextInt();
        }

        final int height = (pineBranchWidth - pineTrunkWidth + 1);
        int width = height;

        // Draw trunk
        int i;
        int j;
        for (i = 0; i < height; i++) {
            System.out.println();
            for (j = 0; j < pineTrunkWidth; j++) {
                System.out.print(symbol);
            }
        }

        // Draw middle layer
        int h;
        for (i = 0; i < height; i++) {
            System.out.println();
            for (h = 0; h < pineBranchWidth; h++) {
                System.out.print(symbol);
            }
            pineBranchWidth = pineBranchWidth - 1;
        }

        // Draw top layer
        int m;
        int k;
        for (m = 0; m < height; m++) {
            System.out.println();
            for (k = 0; k < width; k++) {
                System.out.print(symbol);
            }
            width = width - 1;
        }
    }
}
