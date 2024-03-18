package org;

import java.awt.Dimension;
import java.awt.Point;
import java.io.Serializable;

public class AbsoluteConstraints implements Serializable {

    static final long serialVersionUID = 5261460716622152494L;
    public int x;
    public int y;
    public int width;
    public int height;

    public AbsoluteConstraints(Point point) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: getfield      #1                  // Field java/awt/Point.x:I
         * 5: aload_1
         * 6: getfield      #2                  // Field java/awt/Point.y:I
         * 9: invokespecial #3                  // Method "<init>":(II)V
         * 12: return
         *  */
        // </editor-fold>
    }

    public AbsoluteConstraints(int i, int i1) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #4                  // Method java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: iconst_m1
         * 6: putfield      #5                  // Field width:I
         * 9: aload_0
         * 10: iconst_m1
         * 11: putfield      #6                  // Field height:I
         * 14: aload_0
         * 15: iload_1
         * 16: putfield      #7                  // Field x:I
         * 19: aload_0
         * 20: iload_2
         * 21: putfield      #8                  // Field y:I
         * 24: return
         *  */
        // </editor-fold>
    }

    public AbsoluteConstraints(Point point, Dimension dmnsn) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #4                  // Method java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: iconst_m1
         * 6: putfield      #5                  // Field width:I
         * 9: aload_0
         * 10: iconst_m1
         * 11: putfield      #6                  // Field height:I
         * 14: aload_0
         * 15: aload_1
         * 16: getfield      #1                  // Field java/awt/Point.x:I
         * 19: putfield      #7                  // Field x:I
         * 22: aload_0
         * 23: aload_1
         * 24: getfield      #2                  // Field java/awt/Point.y:I
         * 27: putfield      #8                  // Field y:I
         * 30: aload_2
         * 31: ifnull        50
         * 34: aload_0
         * 35: aload_2
         * 36: getfield      #9                  // Field java/awt/Dimension.width:I
         * 39: putfield      #5                  // Field width:I
         * 42: aload_0
         * 43: aload_2
         * 44: getfield      #10                 // Field java/awt/Dimension.height:I
         * 47: putfield      #6                  // Field height:I
         * 50: return
         *  */
        // </editor-fold>
    }

    public AbsoluteConstraints(int i, int i1, int i2, int i3) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial #4                  // Method java/lang/Object."<init>":()V
         * 4: aload_0
         * 5: iconst_m1
         * 6: putfield      #5                  // Field width:I
         * 9: aload_0
         * 10: iconst_m1
         * 11: putfield      #6                  // Field height:I
         * 14: aload_0
         * 15: iload_1
         * 16: putfield      #7                  // Field x:I
         * 19: aload_0
         * 20: iload_2
         * 21: putfield      #8                  // Field y:I
         * 24: aload_0
         * 25: iload_3
         * 26: putfield      #5                  // Field width:I
         * 29: aload_0
         * 30: iload         4
         * 32: putfield      #6                  // Field height:I
         * 35: return
         *  */
        // </editor-fold>
    }

    public int getX() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #7                  // Field x:I
         * 4: ireturn
         *  */
        // </editor-fold>
        return x;
    }

    public int getY() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #8                  // Field y:I
         * 4: ireturn
         *  */
        // </editor-fold>
        return y;
    }

    public int getWidth() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #5                  // Field width:I
         * 4: ireturn
         *  */
        // </editor-fold>
        return width;
    }

    public int getHeight() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #6                  // Field height:I
         * 4: ireturn
         *  */
        // </editor-fold>
        return height;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [x=");
        sb.append(x);
        sb.append(", y=");
        sb.append(y);
        sb.append(", width=");
        sb.append(width);
        sb.append(", height=");
        sb.append(height);
        sb.append("]");
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #11                 // class java/lang/StringBuilder
         * 3: dup
         * 4: invokespecial #12                 // Method java/lang/StringBuilder."<init>":()V
         * 7: aload_0
         * 8: invokespecial #13                 // Method java/lang/Object.toString:()Ljava/lang/String;
         * 11: invokevirtual #14                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 14: ldc           #15                 // String  [x=
         * 16: invokevirtual #14                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 19: aload_0
         * 20: getfield      #7                  // Field x:I
         * 23: invokevirtual #16                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 26: ldc           #17                 // String , y=
         * 28: invokevirtual #14                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 31: aload_0
         * 32: getfield      #8                  // Field y:I
         * 35: invokevirtual #16                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 38: ldc           #18                 // String , width=
         * 40: invokevirtual #14                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 43: aload_0
         * 44: getfield      #5                  // Field width:I
         * 47: invokevirtual #16                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 50: ldc           #19                 // String , height=
         * 52: invokevirtual #14                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 55: aload_0
         * 56: getfield      #6                  // Field height:I
         * 59: invokevirtual #16                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
         * 62: ldc           #20                 // String ]
         * 64: invokevirtual #14                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 67: invokevirtual #21                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 70: areturn
         *  */
        // </editor-fold>
        return sb.toString();
    }
}
