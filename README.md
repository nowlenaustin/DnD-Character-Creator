# DnD-Character-Creator
A program to help you create a character for Dungeons and Dragons. It outputs a PDF file with all the information of your character. __Currently only handles character name, character race, and player name. Rest of character features under developement.__

## Setting up the Eclipse project
Clone git repository to local computer using the following command:
> git clone https://github.com/nowlenaustin/DnD-Character-Creator.git

Open Eclipse. Import the project into Eclipse with the following steps:
> click "File" > click "Open Projects from File System" > click "Directory" > navigate to where your git repository is > click "Ok" > click "Finish"

Download iText 7 from the following link and unzip it (download the .zip file):
> https://github.com/itext/itext7/releases/tag/7.0.1

Or click this link for a direct download of the .zip file: 
> https://github.com/itext/itext7/releases/download/7.0.1/itext7-7.0.1.zip

Once iText 7 is unzipped got back to Eclipse and follow these steps:
> right click on the DnD-Character-Creator project > hover over "Build Path" > click "Add  External Archives" > navigate to the folder created when unzipping iText 7 > select everything > click "Open"

You can now run the DndCharacterCreator.java file to create your character or work on the project. 
Characters created using Eclipse will be output with the "Character Sheets" folder in the "Dnd-Character-Creator" folder (the current working folder) not in the "Exe Builds" folder.

## To Run the executable and Not download the files
Downlad the project as a .zip file and move the "Exe Builds" folder wherever you like. 
> NOTE: You need everything inside the folder for it to work properly. Do not move the "Dnd Character Creator.exe" file to outside the folder as it won't be able to access and create your pdf file for your character. You may however create a shortcut to the "Dnd Character Creator.exe" file. 

Characters created using the "Dnd Character Creator.exe" file will be output as a PDF in the "Character Sheets" folder within the "Exe Builds" folder.




# Programs and Libraries Used
* iText 7 - handling PDFs
* Launch4j - converting .jar file to .exe file
* Eclipse - Java IDE 