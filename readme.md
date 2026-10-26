# APCSA Group 3 (AKA: The Dhruv Kamats): Mad Libs Project


## Team Contributions

- **Morgan and Dhruv** developed `Kamat_MadLibs.java`, which the runner uses to fill the two noun blanks. The 'askRecieve' method finds the first and last brackets and then extracts the input needed inside the brackets to ask the user for input to fill those in. They worked on it over a few days and iterated when the first version wasn't following the rubric. 

- **Tiger and Vandith** developed `Bao_MadLibs.java`, which the runner uses to fill the verb and adjective blanks. The 'askRecieve' method shows a prompt then asks for an input whereas 'replacePlaceHolder' takes each input to go one-by-one and fill in the story one input at a time. They also forked the repo and sent a pull request when the code was finished. Below is what Tiger wrote as a report:

On Monday, our group mainly organized ourselves. Vandhith and I were paired to work on a solution for handling verbs and adjectives while the others managed nouns and others.
I proposed and began to work on a function that would ask the user for an input and return said input. 
With Vandhith's help, I was able to make the function (called askReceive).

On Tuesday, we implemented the main class that put together the mad libs. We also noticed some issues with the askReceive function, which we fixed.

On Wednesday, Vandhith noticed a flaw in main, which we fixed. I then made the fork in the repository.
I also realized that I misspelled askReceive as askRecieve while typing this, so I asked the others to change it in the merged code.

- **Riddhish** I was the team lead, coordinated the team's work, and combined both portions through `runner.java` which uses methods form both files. I also realized we needed to display the original story template with blanks BEFORE the final madlib so I added that functionality too. 


## How We Used Git

We used Github for version control and to share our project files in the
[APCSAGroup3 repository](https://github.com/RiddSarav/APCSAGroup3), doing it this way helped us track changes and gave us one place to access everyone's code. Using seperate files helped us avoid merge conflicts which Mr. Baez told us about a lot and based on his desription of them we really wanted to avoid them so we pivoted from the original method of each duo develops one entire program then we see which one is better. 


## What went well
Dividing the work was a huge reason it worked out in a timely way. In the future I'd like to continue dividing but also have some sort of central system like the plugin Mr.Baez showed us that everyone can use and track the entirety of the project at a glance instead of just their part. 

## Example Images
<img width="1814" height="716" alt="image" src="https://github.com/user-attachments/assets/46699903-5af8-4c22-adfb-b660522725fc" />
<img width="1608" height="552" alt="image" src="https://github.com/user-attachments/assets/5f60f029-8e00-41d2-8559-c8625ef7e155" />
<img width="1598" height="612" alt="image" src="https://github.com/user-attachments/assets/a63cc47c-66cf-4e35-bc29-757c00dc1f55" />

## Test Cases

Test case 1:
I [verb] with the [adjective] [noun]. Each [noun] was amazing, and I [second verb] with them a lot.

Test case 2:
The [noun] [verb] across the [adjective] pond to get to the [adjective] frog but it was [verb]ing.

Test case 3:
I went to the zoo to see a [adjective] [noun]. There were people [verb] around the enclosure which made the [adjective] apes go bananas and it started to [verb].

