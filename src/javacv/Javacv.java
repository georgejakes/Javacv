/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javacv;

/**
 *
 * @author user
 */
import com.googlecode.javacpp.Loader;
import com.googlecode.javacv.*;
import com.googlecode.javacv.cpp.*;
import com.googlecode.javacv.cpp.opencv_core.CvPoint;
import com.googlecode.javacv.cpp.opencv_core.CvScalar;
import com.googlecode.javacv.cpp.opencv_core.CvSeq;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import com.googlecode.javacv.cpp.opencv_highgui.CvCapture;

import static com.googlecode.javacv.cpp.opencv_core.*;
import static com.googlecode.javacv.cpp.opencv_imgproc.*;
import static com.googlecode.javacv.cpp.opencv_calib3d.*;
import static com.googlecode.javacv.cpp.opencv_objdetect.*;
import static com.googlecode.javacv.cpp.opencv_highgui.*;
public class Javacv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CvCapture capture = cvCreateFileCapture("E:\\Movies\\English\\Mongol.2007\\Mongol.2007.DVDRIP-ZEKTORM.mp4");
        IplImage frame;
        cvNamedWindow("Video",CV_WINDOW_AUTOSIZE);
        for(;;)
        {
            frame = cvQueryFrame(capture);
            if(frame == null)
            {
                System.out.println("Error"); break;
            }
            cvShowImage("Video",frame);
            char c = (char) cvWaitKey(24);
            if(c==27)
                break;
            
        }
        
        cvReleaseCapture(capture);
        cvDestroyWindow("Video");
    }
    
}
