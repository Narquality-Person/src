package PixLab;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rArray : pixels)
    {
      for (Pixel pixelObj : rArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void negate()
  {
	  Pixel[][] pixel = this.getPixels2D();
	  
	  for (Pixel[] rArray : pixel)
	  {
			for (Pixel pObj : rArray)
			{
				pObj.setRed(255 - pObj.getRed());
				pObj.setGreen(255 - pObj.getGreen());
				pObj.setBlue(255 - pObj.getBlue());
			}
	  }
  }
  
  public void grayscale() {
		Pixel[][] pixels = this.getPixels2D();
		
		for (Pixel[] rArray : pixels)
		{
			for (Pixel pObj : rArray)
			{
				int average = (pObj.getRed() + pObj.getGreen() + pObj.getBlue()) / 3;
				
				pObj.setRed(average);
				pObj.setGreen(average);
				pObj.setBlue(average);
			}
		}
	}
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    
    int width = pixels[0].length;
    
    for (int r = 0; r < pixels.length; r++)
    {
      for (int c = 0; c < width / 2; c++)
      {
        leftPixel = pixels[r][c];
        rightPixel = pixels[r][width - 1 - c];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      
      int ht = pixels.length;
      
      for (int r = 0; r < ht; r++)
      {
          for (int c = 0; c < pixels[0].length; c++)
          {
              topPixel = pixels[r][c];
              bottomPixel = pixels[ht - 1 - r][c];
              bottomPixel.setColor(topPixel.getColor());
          }
      }
  }
  
  public void mirrorHorizontalBottomToTop()
  {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      
      int ht = pixels.length;
      
      for (int r = 0; r < ht; r++)
      {
          for (int c = 0; c < pixels[0].length; c++)
          {
              topPixel = pixels[r][c];
              bottomPixel = pixels[ht - 1 - r][c];
              topPixel.setColor(bottomPixel.getColor());
          }
      }
  }
  
  
  /** copy from the passed fromPic to the
    * specified startr and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startr the start r to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, int startr, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromr = 0, tor = startr; 
         fromr < fromPixels.length &&
         tor < toPixels.length; 
         fromr++, tor++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromr][fromCol];
        toPixel = toPixels[tor][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copy2(Picture fromPic, int startRow, int endRow, int startCol, int endCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < endRow;
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < endCol;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    } 
  }
  
  /** Method to blur a photo **/
  public static void testBlur(int x, int y)
  {
	  //Picture purpleFlower = new Picture("purple flower.png");
	  File image = new File("tumblr_static_photo.JPG");
	  BufferedImage flowBuff = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
	  
	  int width = 2;
	  int height = 2;
	  
	  int pixelCount = 0;
	  
	  for (int r = 0; r < width - 3; r++)
	  {
		  for (int c = 0; c < height - 3; c++)
		  {
			  int red = 0;
			  int blue = 0;
			  int green = 0;
			  
			  Color pixColor1 = new Color(flowBuff.getRGB(r, c));
			  
			  red = pixColor1.getRed();
			  blue = pixColor1.getBlue();
			  green = pixColor1.getGreen();
			  
			  Color pixColor2 = new Color(flowBuff.getRGB(r+1, c+1));
			  
			  red += pixColor2.getRed();
			  blue += pixColor2.getBlue();
			  green += pixColor2.getGreen();
			  
			  Color pixColor3 = new Color(flowBuff.getRGB(r, c+1));
			  
			  red += pixColor3.getRed();
			  blue += pixColor3.getBlue();
			  green += pixColor3.getGreen();
			  
			  Color pixColor4 = new Color(flowBuff.getRGB(r+1, c));
			  
			  red += pixColor4.getRed();
			  blue += pixColor4.getBlue();
			  green += pixColor4.getGreen();
			  
			  pixelCount = 4;
			  
			  Color avgColor = new Color(red/ pixelCount, blue/ pixelCount, green/ pixelCount);
			  
			  flowBuff.setRGB(r, c, avgColor.getRGB());
		  }
	  }
	  
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    //loop through rows
    for (int r = 27; r < 97; r++)
    {
      //loop through columns starting right before the mirror point
      for (int c = 13; c < mirrorPoint; c++)
      {
        count++;
        leftPixel = pixels[r][c];      
        rightPixel = pixels[r]                       
                         [mirrorPoint - c + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }
  
  /** Mirrors the arms of the snowman */
  public void mirrorArms()
  {
    int mirrorPoint = 193;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();

    //left arm
    for (int r = 158; r < mirrorPoint; r++)
    {
      //loop through columns starting right before the mirror point
      for (int c = 103; c < 170; c++)
      {
        topPixel = pixels[r][c];      
        bottomPixel = pixels[mirrorPoint - r + mirrorPoint][c];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
    
    int mirrorPoint2 = 198;
    Pixel topPixel2 = null;
    Pixel bottomPixel2 = null;
    
    //right arm
    for (int r = 171; r < mirrorPoint2; r++)
    {
      //loop through columns starting right before the mirror point
      for (int c = 239; c < 294; c++)
      {
        topPixel2 = pixels[r][c];      
        bottomPixel2 = pixels[mirrorPoint2 - r + mirrorPoint2][c];
        bottomPixel2.setColor(topPixel2.getColor());
      }
    }
  }
  
  public void mirrorGull()
  {
    int mirrorPoint = 345;
    Pixel rightPixel = null;
    Pixel leftPixel = null;
    Pixel[][] pixels = this.getPixels2D();   
    
    // Seagull
    for (int r = 235; r < 323; r++)
    {
      for (int c = 238; c < mirrorPoint; c++)
      {
        rightPixel = pixels[r][c];      
        leftPixel = pixels[r][mirrorPoint - c + mirrorPoint/3];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }
  

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    //this.copy(flower1,0,0);
    this.copy2(flower1, 0, 50, 0, 50);
    //this.copy(flower2,100,0);
    //this.copy(flower1,200,0);
    
    //Mirroring
    int mirrorPoint = 100;
    Pixel rPixel = null;
    Pixel lPixel = null;
    Pixel[][] pixs = this.getPixels2D();
    
    for (int r = 0; r < mirrorPoint; r++)
    {
    	for (int c = 0; c < mirrorPoint; c++)
    	{
    		rPixel = pixs[r][c];
    		lPixel = pixs[mirrorPoint - r + mirrorPoint][c];
    		lPixel.setColor(rPixel.getColor());
    	}
    }
    
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy2(flowerNoBlue, 250, 350, 80, 500);
    
    
    //this.copy(flowerNoBlue,300,0);
    //this.copy(flower1,400,0);
    //this.copy(flower2,500,0);
    //his.mirrorVertical();
    
    
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int r = 0; r < pixels.length; r++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[r][col];
        rightPixel = pixels[r][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this