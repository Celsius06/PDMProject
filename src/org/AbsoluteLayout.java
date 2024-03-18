    package org;

    import java.awt.Component;
    import java.awt.Container;
    import java.awt.Dimension;
    import java.awt.LayoutManager2;
    import java.io.Serializable;
import java.util.Enumeration;
import java.util.Hashtable;
    
    public class AbsoluteLayout implements LayoutManager2, Serializable {
    
        static final long serialVersionUID = -1919857869177070440L;
        protected Hashtable <Component, AbsoluteConstraints> constraints;
    
        public AbsoluteLayout() {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: invokespecial #1                  // Method java/lang/Object."<init>":()V
             * 4: aload_0
             * 5: new           #2                  // class java/util/Hashtable
             * 8: dup
             * 9: invokespecial #3                  // Method java/util/Hashtable."<init>":()V
             * 12: putfield      #4                  // Field constraints:Ljava/util/Hashtable;
             * 15: return
             *  */
            // </editor-fold>
        }
    
        @Override
        public void addLayoutComponent(String string, Component cmpnt) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           #5                  // class java/lang/IllegalArgumentException
             * 3: dup
             * 4: invokespecial #6                  // Method java/lang/IllegalArgumentException."<init>":()V
             * 7: athrow
             *  */
            // </editor-fold>
        }
    
        @Override
        public void removeLayoutComponent(Component cmpnt) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #4                  // Field constraints:Ljava/util/Hashtable;
             * 4: aload_1
             * 5: invokevirtual #7                  // Method java/util/Hashtable.remove:(Ljava/lang/Object;)Ljava/lang/Object;
             * 8: pop
             * 9: return
             *  */
            // </editor-fold>
        }
    
        @Override
        public Dimension preferredLayoutSize(Container cntnr) {
            int width = 0;
            int height = 0;
            Enumeration<Component> enumeration = constraints.keys();
                while (enumeration.hasMoreElements()) {
                    Component comp = enumeration.nextElement();
                    AbsoluteConstraints c = constraints.get(comp);
                    Dimension d = comp.getPreferredSize();
                    int compWidth = c.getWidth() != -1 ? c.getWidth() : d.width;
                    int compHeight = c.getHeight() != -1 ? c.getHeight() : d.height;
                    width = Math.max(width, c.x + compWidth);
                    height = Math.max(height, c.y + compHeight);
                }
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iconst_0
             * 1: istore_2
             * 2: iconst_0
             * 3: istore_3
             * 4: aload_0
             * 5: getfield      #4                  // Field constraints:Ljava/util/Hashtable;
             * 8: invokevirtual #8                  // Method java/util/Hashtable.keys:()Ljava/util/Enumeration;
             * 11: astore        4
             * 13: aload         4
             * 15: invokeinterface #9,  1            // InterfaceMethod java/util/Enumeration.hasMoreElements:()Z
             * 20: ifeq          141
             * 23: aload         4
             * 25: invokeinterface #10,  1           // InterfaceMethod java/util/Enumeration.nextElement:()Ljava/lang/Object;
             * 30: checkcast     #11                 // class java/awt/Component
             * 33: astore        5
             * 35: aload_0
             * 36: getfield      #4                  // Field constraints:Ljava/util/Hashtable;
             * 39: aload         5
             * 41: invokevirtual #12                 // Method java/util/Hashtable.get:(Ljava/lang/Object;)Ljava/lang/Object;
             * 44: checkcast     #13                 // class org/netbeans/lib/awtextra/AbsoluteConstraints
             * 47: astore        6
             * 49: aload         5
             * 51: invokevirtual #14                 // Method java/awt/Component.getPreferredSize:()Ljava/awt/Dimension;
             * 54: astore        7
             * 56: aload         6
             * 58: invokevirtual #15                 // Method org/netbeans/lib/awtextra/AbsoluteConstraints.getWidth:()I
             * 61: istore        8
             * 63: iload         8
             * 65: iconst_m1
             * 66: if_icmpne     76
             * 69: aload         7
             * 71: getfield      #16                 // Field java/awt/Dimension.width:I
             * 74: istore        8
             * 76: aload         6
             * 78: invokevirtual #17                 // Method org/netbeans/lib/awtextra/AbsoluteConstraints.getHeight:()I
             * 81: istore        9
             * 83: iload         9
             * 85: iconst_m1
             * 86: if_icmpne     96
             * 89: aload         7
             * 91: getfield      #18                 // Field java/awt/Dimension.height:I
             * 94: istore        9
             * 96: aload         6
             * 98: getfield      #19                 // Field org/netbeans/lib/awtextra/AbsoluteConstraints.x:I
             * 101: iload         8
             * 103: iadd
             * 104: iload_2
             * 105: if_icmple     117
             * 108: aload         6
             * 110: getfield      #19                 // Field org/netbeans/lib/awtextra/AbsoluteConstraints.x:I
             * 113: iload         8
             * 115: iadd
             * 116: istore_2
             * 117: aload         6
             * 119: getfield      #20                 // Field org/netbeans/lib/awtextra/AbsoluteConstraints.y:I
             * 122: iload         9
             * 124: iadd
             * 125: iload_3
             * 126: if_icmple     138
             * 129: aload         6
             * 131: getfield      #20                 // Field org/netbeans/lib/awtextra/AbsoluteConstraints.y:I
             * 134: iload         9
             * 136: iadd
             * 137: istore_3
             * 138: goto          13
             * 141: new           #21                 // class java/awt/Dimension
             * 144: dup
             * 145: iload_2
             * 146: iload_3
             * 147: invokespecial #22                 // Method java/awt/Dimension."<init>":(II)V
             * 150: areturn
             *  */
            // </editor-fold>
            return new Dimension(width, height);
        }
    
        @Override
        public Dimension minimumLayoutSize(Container cntnr) {
            int width = 0;
            int height = 0;
                Enumeration<Component> enumeration = constraints.keys();
                while (enumeration.hasMoreElements()) {
                    Component comp = enumeration.nextElement();
                    AbsoluteConstraints c = constraints.get(comp);
                    Dimension d = comp.getMinimumSize();
                    int compWidth = c.getWidth() != -1 ? c.getWidth() : d.width;
                    int compHeight = c.getHeight() != -1 ? c.getHeight() : d.height;
                    width = Math.max(width, c.x + compWidth);
                    height = Math.max(height, c.y + compHeight);
                }
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: iconst_0
             * 1: istore_2
             * 2: iconst_0
             * 3: istore_3
             * 4: aload_0
             * 5: getfield      #4                  // Field constraints:Ljava/util/Hashtable;
             * 8: invokevirtual #8                  // Method java/util/Hashtable.keys:()Ljava/util/Enumeration;
             * 11: astore        4
             * 13: aload         4
             * 15: invokeinterface #9,  1            // InterfaceMethod java/util/Enumeration.hasMoreElements:()Z
             * 20: ifeq          141
             * 23: aload         4
             * 25: invokeinterface #10,  1           // InterfaceMethod java/util/Enumeration.nextElement:()Ljava/lang/Object;
             * 30: checkcast     #11                 // class java/awt/Component
             * 33: astore        5
             * 35: aload_0
             * 36: getfield      #4                  // Field constraints:Ljava/util/Hashtable;
             * 39: aload         5
             * 41: invokevirtual #12                 // Method java/util/Hashtable.get:(Ljava/lang/Object;)Ljava/lang/Object;
             * 44: checkcast     #13                 // class org/netbeans/lib/awtextra/AbsoluteConstraints
             * 47: astore        6
             * 49: aload         5
             * 51: invokevirtual #23                 // Method java/awt/Component.getMinimumSize:()Ljava/awt/Dimension;
             * 54: astore        7
             * 56: aload         6
             * 58: invokevirtual #15                 // Method org/netbeans/lib/awtextra/AbsoluteConstraints.getWidth:()I
             * 61: istore        8
             * 63: iload         8
             * 65: iconst_m1
             * 66: if_icmpne     76
             * 69: aload         7
             * 71: getfield      #16                 // Field java/awt/Dimension.width:I
             * 74: istore        8
             * 76: aload         6
             * 78: invokevirtual #17                 // Method org/netbeans/lib/awtextra/AbsoluteConstraints.getHeight:()I
             * 81: istore        9
             * 83: iload         9
             * 85: iconst_m1
             * 86: if_icmpne     96
             * 89: aload         7
             * 91: getfield      #18                 // Field java/awt/Dimension.height:I
             * 94: istore        9
             * 96: aload         6
             * 98: getfield      #19                 // Field org/netbeans/lib/awtextra/AbsoluteConstraints.x:I
             * 101: iload         8
             * 103: iadd
             * 104: iload_2
             * 105: if_icmple     117
             * 108: aload         6
             * 110: getfield      #19                 // Field org/netbeans/lib/awtextra/AbsoluteConstraints.x:I
             * 113: iload         8
             * 115: iadd
             * 116: istore_2
             * 117: aload         6
             * 119: getfield      #20                 // Field org/netbeans/lib/awtextra/AbsoluteConstraints.y:I
             * 122: iload         9
             * 124: iadd
             * 125: iload_3
             * 126: if_icmple     138
             * 129: aload         6
             * 131: getfield      #20                 // Field org/netbeans/lib/awtextra/AbsoluteConstraints.y:I
             * 134: iload         9
             * 136: iadd
             * 137: istore_3
             * 138: goto          13
             * 141: new           #21                 // class java/awt/Dimension
             * 144: dup
             * 145: iload_2
             * 146: iload_3
             * 147: invokespecial #22                 // Method java/awt/Dimension."<init>":(II)V
             * 150: areturn
             *  */
            // </editor-fold>
            return new Dimension(width, height);
        }

        @Override
        public void layoutContainer(Container cntnr) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_0
             * 1: getfield      #4                  // Field constraints:Ljava/util/Hashtable;
             * 4: invokevirtual #8                  // Method java/util/Hashtable.keys:()Ljava/util/Enumeration;
             * 7: astore_2
             * 8: aload_2
             * 9: invokeinterface #9,  1            // InterfaceMethod java/util/Enumeration.hasMoreElements:()Z
             * 14: ifeq          107
             * 17: aload_2
             * 18: invokeinterface #10,  1           // InterfaceMethod java/util/Enumeration.nextElement:()Ljava/lang/Object;
             * 23: checkcast     #11                 // class java/awt/Component
             * 26: astore_3
             * 27: aload_0
             * 28: getfield      #4                  // Field constraints:Ljava/util/Hashtable;
             * 31: aload_3
             * 32: invokevirtual #12                 // Method java/util/Hashtable.get:(Ljava/lang/Object;)Ljava/lang/Object;
             * 35: checkcast     #13                 // class org/netbeans/lib/awtextra/AbsoluteConstraints
             * 38: astore        4
             * 40: aload_3
             * 41: invokevirtual #14                 // Method java/awt/Component.getPreferredSize:()Ljava/awt/Dimension;
             * 44: astore        5
             * 46: aload         4
             * 48: invokevirtual #15                 // Method org/netbeans/lib/awtextra/AbsoluteConstraints.getWidth:()I
             * 51: istore        6
             * 53: iload         6
             * 55: iconst_m1
             * 56: if_icmpne     66
             * 59: aload         5
             * 61: getfield      #16                 // Field java/awt/Dimension.width:I
             * 64: istore        6
             * 66: aload         4
             * 68: invokevirtual #17                 // Method org/netbeans/lib/awtextra/AbsoluteConstraints.getHeight:()I
             * 71: istore        7
             * 73: iload         7
             * 75: iconst_m1
             * 76: if_icmpne     86
             * 79: aload         5
             * 81: getfield      #18                 // Field java/awt/Dimension.height:I
             * 84: istore        7
             * 86: aload_3
             * 87: aload         4
             * 89: getfield      #19                 // Field org/netbeans/lib/awtextra/AbsoluteConstraints.x:I
             * 92: aload         4
             * 94: getfield      #20                 // Field org/netbeans/lib/awtextra/AbsoluteConstraints.y:I
             * 97: iload         6
             * 99: iload         7
             * 101: invokevirtual #24                 // Method java/awt/Component.setBounds:(IIII)V
             * 104: goto          8
             * 107: return
             *  */
            // </editor-fold>
        }
    
        @Override
        public void addLayoutComponent(Component cmpnt, Object o) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: aload_2
             * 1: instanceof    #13                 // class org/netbeans/lib/awtextra/AbsoluteConstraints
             * 4: ifne          15
             * 7: new           #5                  // class java/lang/IllegalArgumentException
             * 10: dup
             * 11: invokespecial #6                  // Method java/lang/IllegalArgumentException."<init>":()V
             * 14: athrow
             * 15: aload_0
             * 16: getfield      #4                  // Field constraints:Ljava/util/Hashtable;
             * 19: aload_1
             * 20: aload_2
             * 21: invokevirtual #25                 // Method java/util/Hashtable.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
             * 24: pop
             * 25: return
             *  */
            // </editor-fold>
        }
    
        @Override
        public Dimension maximumLayoutSize(Container cntnr) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: new           #21                 // class java/awt/Dimension
             * 3: dup
             * 4: ldc           #27                 // int 2147483647
             * 6: ldc           #27                 // int 2147483647
             * 8: invokespecial #22                 // Method java/awt/Dimension."<init>":(II)V
             * 11: areturn
             *  */
            // </editor-fold>
            return new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
    
        @Override
        public float getLayoutAlignmentX(Container cntnr) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: fconst_0
             * 1: freturn
             *  */
            // </editor-fold>
            return 0.0f; // Assuming 0.0f is the default alignment X
        }
    
        @Override
        public float getLayoutAlignmentY(Container cntnr) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: fconst_0
             * 1: freturn
             *  */
            // </editor-fold>
            return 0.0f; // Assuming 0.0f is the default alignment X
        }
    
        @Override
        public void invalidateLayout(Container cntnr) {
            // <editor-fold defaultstate="collapsed" desc="Compiled Code">
            /* 0: return
             *  */
            // </editor-fold>
        }
    }
    

