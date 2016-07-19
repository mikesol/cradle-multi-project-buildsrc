package org.mikesolomon.generators

public class MyCustomGenerator {


    public static void generateSourceFiles(final File outputDir) {

        File longOutputDir = new File(outputDir,"org/mikesolomon/gradlelibrarytest");
        if (!longOutputDir.isDirectory() && !longOutputDir.mkdirs()) {
            throw new IOException('Could not create directory: ' + longOutputDir)
        }

        File outputFile = new File(longOutputDir, "MyGeneratedClass.java");
        PrintWriter writer = new PrintWriter(outputFile.getCanonicalPath(), "UTF-8");
        writer.println("package org.mikesolomon.gradlelibrarytest;");
        writer.println("public class MyGeneratedClass {");
        writer.println("}");
        writer.close();
    }
}