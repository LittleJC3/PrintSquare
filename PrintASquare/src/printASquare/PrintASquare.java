/*
 * Print a square in ASCII ART. Sad ASCII Art
    **********
    *        *
    *        *
    *        *
    *        *
    **********
 
 */
package printASquare;

public class PrintASquare {

	public static void main(String[] args) {
		// Declare and init width and height. Width is 10, height is 20
		int width = 10, height = 20;
		// Declare and init a variable to hold one asterisk. *
		String star = "*";
		// Loop from 0 to width - 1, draw a star in each pass through the loop all on the same line!
		for (int  i = 0; i < width; i++) {
			System.out.print(star);
		}
		// Print a newline
		System.out.println();
		// ******************************************
		// Start the loop for the height of the box
		// Loop from 0 to less than height-2
		// ******************************************
		for (int k = 0; k < height - 2; k++) {
		// Print one star, no newline
		System.out.print(star);
		// loop: from 0 to width - 2, print a space, all on the same line
		for(int j = 0; j < width-2; j++) {
			System.out.print(" ");
		}
		// Print a star on the same line
		System.out.print(star);
		// Print a newline
		System.out.println();
		}
		// *******************************************
		// Terminate the loop from above
		// *******************************************
		// Finally, print the bottom edge of the square
		for (int  i = 0; i < width; i++) {
			System.out.print(star);
		}

		
	}

}
