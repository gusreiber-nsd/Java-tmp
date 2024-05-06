/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import java.awt.Dimension;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) {

        JFrame jf = new JFrame();
        jf.setSize(new Dimension(500,400));
        jf.setVisible(true);

        System.out.println("Hello Remote World!");
    }
}
