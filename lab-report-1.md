# Lab Report 1
---
Here is a demonstration of the basic terminal commands `cd`, `ls`, and `cat`

## Using `cd`:
---
### Without arguments:
![Image](cd_no_commands.png)

The cd command changes directory into another folder or directory. If no arguments are given, the computer doesn't know which directory to change into, so it won't produce any output or change the directory

### With directory as argument:
![Image](cd_directory_arg.png)

The prompt now shows up with "lecture1" before the dollar sign because the cd command changed the directory into the directory that was given as the argument, which was the lecture1 folder. 

### With file as argument:
![Image](cd_file_arg.png)

The terminal produces this output because the cd command can only work with directories as arguments. A file is not a directory, so the computer cannot change the directory to a specific file. 

## Using `ls`: 
---
### Without arguments
![Image](ls_no_args.png)

The terminal outputs "lecture1" because the present working directory is `/home`. The ls command shows a list of all folders and files within the present working directory, so "lecture1" will be outputted because it is the only folder in the `/home` directory.

### With directory argument:
![Image](ls_directory_arg.png)

The terminal outputs the 4 txt files because that is the list of files present in the `lecture1/messages` directory.

### With file argument:
![Image](ls_file_arg.png)

The terminal just outputs the relative path to the file that was given as an argument to the ls command, because the file is the only element in that path.

## Using `cat`:
---
### Without arguments:

