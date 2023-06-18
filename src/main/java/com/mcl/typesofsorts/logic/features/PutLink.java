package com.mcl.typesofsorts.logic.features;

import java.awt.*;
import java.net.URI;

public class PutLink {
    private static final String link = "https://github.com/MacloProfile";

    public static void openGitHub() {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(link));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
