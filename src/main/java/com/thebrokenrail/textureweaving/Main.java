package com.thebrokenrail.textureweaving;

import com.thebrokenrail.textureweaving.texture.Texture;
import com.thebrokenrail.textureweaving.texture.builtin.BuiltinTextures;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    private static void help() {
        System.err.println("TextureWeaving USAGE:");
        System.err.println("    TextureWeaving <stitch|cut> <input> <output>");
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            help();
        } else {
            boolean stitch = false;
            switch (args[0]) {
                case "stitch": {
                    stitch = true;
                }
                case "cut": {
                    File input = new File(args[1]);
                    File output = new File(args[2]);

                    if (output.exists()) {
                        try {
                            Files.walkFileTree(output.toPath(), new SimpleFileVisitor<Path>() {
                                @Override
                                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                                    Files.delete(file);
                                    return FileVisitResult.CONTINUE;
                                }

                                @Override
                                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                                    Files.delete(dir);
                                    return FileVisitResult.CONTINUE;
                                }
                            });
                        } catch (IOException e) {
                            System.err.println("Unable To Clean Output Directory: " + e);
                            System.exit(1);
                        }
                    }
                    if (!output.mkdirs()) {
                        System.err.println("Unable To Create Output Directory");
                        System.exit(1);
                    }

                    if (!input.exists() || !input.isDirectory()) {
                        System.err.println("Input Does Not Exists Or Is Not A Directory");
                        System.exit(1);
                    }

                    for (int i = 0; i < BuiltinTextures.INSTANCE.size(); i++) {
                        Texture texture = BuiltinTextures.INSTANCE.get(i);
                        if (stitch) {
                            texture.stitch(input, output);
                        } else {
                            texture.cut(input, output);
                        }
                    }

                    System.out.println("Done");

                    break;
                }
                default: {
                    help();
                    break;
                }
            }
        }
    }
}
