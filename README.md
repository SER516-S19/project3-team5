# project3-team5

To run: 
1. Install Gradle (https://gradle.org/install/).

For Mac or Linux systems:
2a. In terminal, navigate to project directory and then 'cd student' to navigate to student app.
    or 'cd professor' professor app
3a. run `./gradlew build && ./gradlew run` to start the respective application.

For Windows System:

2b. In command prompt, navigate to project directory and then 'cd student' to navigate to student app.
    or 'cd professor' professor app
3b. run 'gradlew build' and then 'gradlew run' to start the respective application.

If imported as gradle projects, you should be able to use your IDEs to build and run the projects as well.

Note For Developers:
-> The files AddQuestionPanel.form and ProfessorWelcomeUI.form are auto generated files that is supported and
generated by IntelliJ IDE's GUI Designer for the ease in developing Java GUIs.

Tutorials for IntelliJ's GUI Designer can be found here: https://www.jetbrains.com/help/idea/gui-designer-basics.html 

To edit the view source files using IntelliJ's GUI Designer:
1. import professor as a gradle project in intelliJ (File > import from existing source > double click professor/build.gradle)
2. select Help > Find Action from the toolbar
3. search for GUI Designer (it should have "settings" next to it) and open it.
4. select Generate GUI into: Java source code
5. apply
6. Create/Edit forms (Double click a .form file, or right click, select New > GUI Form )
7. run ProfessorUI (Through IntelliJ, not command line)

Running ProfessorUI through IntelliJ, in addition to running the program, will transpile the data from the .form file to whatever .java file it's bound to so that it can be built with gradle for distribution.
