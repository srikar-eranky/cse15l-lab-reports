# Lab Report 3
---
## ReverseInPlace Bug
### Failure-Inducing Output
```
public void testReverseInPlace2(){
    int[] input2 = {1,2,3,4};
    ArrayExamples.buggyReverseInPlace(input2);
    assertArrayEquals(new int[]{4,3,2,1}, input2);
}
```
### Non Failure-Inducing Output
```
public void testReverseInPlace1() {
    int[] input1 = { 3 };
    ArrayExamples.buggyReverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
}
```
### Symptom
![Image](symptom.png)

### Code Before Fix
```
for(int i = 0; i < arr.length; i += 1) {
    arr[i] = arr[arr.length - i - 1];
}
```
### Code After Fix
```
for(int i = 0; i < arr.length / 2; i += 1) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
}
```
The fix saves the data that is being replaced by the for loop. Since the data gets saved, it can now be used to replace the previous elements when reversing. 

## The `less` command:
### `-E` option: 
Command:
`less -E base-pair.txt`
Output:
```
biomed/1471-2091-3-4.txt
biomed/1471-2105-2-8.txt
biomed/1471-2105-2-9.txt
biomed/1471-2105-3-18.txt
biomed/1471-2105-3-2.txt
biomed/1471-2105-3-24.txt
biomed/1471-2105-4-27.txt
biomed/1471-2121-1-2.txt
biomed/1471-2121-3-10.txt
biomed/1471-213X-1-4.txt
biomed/1471-2156-2-17.txt
biomed/1471-2156-2-3.txt
biomed/1471-2156-2-7.txt
biomed/1471-2156-3-16.txt
biomed/1471-2156-3-4.txt
biomed/1471-2164-2-1.txt
biomed/1471-2164-2-4.txt
biomed/1471-2164-2-7.txt
biomed/1471-2164-3-13.txt
biomed/1471-2164-3-31.txt
biomed/1471-2164-3-35.txt
biomed/1471-2164-3-6.txt
biomed/1471-2164-3-7.txt
...
```
The `less` command prints the contents of the file that fit to the size of the terminal, and you can scroll down to access the rest of the contents after it is truncated. It is useful because the output gets truncated, so you don't have to read outputs of large files.
Source: [Link](https://eng.libretexts.org/Bookshelves/Computer_Science/Operating_Systems/Linux_-_The_Penguin_Marches_On_(McClanahan)/05%3A_File_and_Directory_Management/3.06%3A_Working_with_Files_and_Directories/3.06.02%3A_Working_with_Files_and_Directories_-_less-more_Command)
Command:
`less -E 911report/`
Output:
`911report is not a directory`
The `less` command only works with files, and since `911report` is a directory, the command won't work.
Source: ChatGPT
