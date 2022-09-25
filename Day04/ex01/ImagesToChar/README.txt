# Compilation:
    # this command compiles .java files into .class files, put them into target directory
 mkdir target   # javac for java 8 DOES NOT create the directory, however it is required by subject.
 javac -d ./target/ src/java/edu/school21/printer/app/Main.java src/java/edu/school21/printer/logic/Logic.java

# Jar file creation:
    # this command packs .class files, resources and a manifest file into a single images-to-chars-printer.jar file
 jar cvfm ./target/images-to-chars-printer.jar src/manifest.txt -C target edu/ -C src/ resources

    # OPTIONAL: this command will display contents of the manifest file
# unzip -q -c ./target/images-to-chars-printer.jar META-INF/MANIFEST.MF
 cp -r src/resources target/.

# Launch jar application:
 java -jar target/images-to-chars-printer.jar . o   #path to file is not needed since it's already packaged
