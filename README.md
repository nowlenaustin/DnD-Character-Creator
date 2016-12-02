# DnD-Character-Creator
A program to help you create a character for 5th Edition Dungeons and Dragons. It outputs a PDF file with all the information of your character. __Currently only supports the following: character name, character race, character class, character level, player name. The rest of the character features are under development.__

[GitHub website page](https://nowlenaustin.github.io/DnD-Character-Creator/) 

## To Download the Installer File
Click [here](https://github.com/nowlenaustin/DnD-Character-Creator/raw/master/Prototype.exe) to download the current prototype. Run the exe file and it will install itself.
> NOTE: You need everything inside the folder for it to work properly. Do not move the "Dnd Character Creator.exe" file to outside the folder as it won't be able to access and create your pdf file for your character. You may however create a shortcut to the "Dnd Character Creator.exe" file. 

Characters created using the "Dnd Character Creator.exe" file will be output as a PDF in the "Character Sheets" folder within the "Exe Builds" folder.

## Setting up the Eclipse project
Clone git repository to local computer using the following command:
> git clone -b [your branch name] https://github.com/nowlenaustin/DnD-Character-Creator.git

Open Eclipse. Import the project into Eclipse with the following steps:
> click "File" > click "Open Projects from File System" > click "Directory" > navigate to where your git repository is > click "Ok" > click "Finish"

> NOTE: Make sure to complete ALL the steps in the process before building the project. Building the project before linking the iText7 library may cause the project to not build correctly and produce errors indefinitely.

## Delete the ".classpath" file
> select the ".classpath" file > right click over it > select delete

Download iText 7 from the following link and unzip it (download the .zip file):
> https://github.com/itext/itext7/releases/tag/7.0.1

Or click this link for a direct download of the .zip file: 
> https://github.com/itext/itext7/releases/download/7.0.1/itext7-7.0.1.zip

Once iText 7 is unzipped go back to Eclipse and follow these steps:
> right click on the DnD-Character-Creator project > hover over "Build Path" > click "Add  External Archives" > navigate to the folder created when unzipping iText 7 > select everything > click "Open"

You can now run the DndCharacterCreator.java file to create your character or work on the project. 
Characters created using Eclipse will be output with the "Character Sheets" folder in the "Dnd-Character-Creator" folder (the current working folder) not in the "Exe Builds" folder.

# Contributors
* @nowlenaustin
* @dogboy357


# Programs and Libraries Used
### Programs
* Launch4j - converting .jar file to .exe file
* Eclipse - Java IDE
* NSIS - create installer file

### Libraries
* iText 7 - handling PDFs 