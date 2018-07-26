package codingChallenge1;
/*Jasmine Allen, Louis Privette
 * July 26, 2018
 * Program: Create an ArrayList of rectangles or circles. Find the largest
 * 			one (by area) and print the dimensions or radius. Also find smallest.
 */
public class Rectangles {
        private int length;
        private int width;
        
        public Rectangles(int length, int width) {
            super();
            this.length = length;
            this.width = width;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
        public int getArea() {
            return length * width;
        }

        @Override
        public String toString() {
            return "Rectangles of [length=" + length + ", width=" + width + "]";
        }

        
}