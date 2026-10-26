# APCSA Group 3 (AKA: The Dhruv Kamats): Mad Libs Project

Our project is an interactive Java Mad Libs program. The user enters two verbs,
an adjective, and two nouns, and the program combines those words into a
personalized story. We built separate parts of the program and connected them
through one runner.

## Team Contributions

- **Morgan and Dhruv** developed the noun portion of the program `MadLibs.java` over a few days and they iterated when one version failed. They also forked the repo and sent a pull request when the code was done. 
- **Tiger and Vandith** developed the adjective and verb portion in `Bao_MadLibs.java`. They also forked the repo and send a pull request when the code was finished. Below is what Tiger wrote as a report:

On Monday, our group mainly organized ourselves. Vandhith and I were paired to work on a solution for handling verbs and adjectives while the others managed nouns and others.
I proposed and began to work on a function that would ask the user for an input and return said input. 
With Vandhith's help, I was able to make the function (called askReceive).

On Tuesday, we implemented the main class that put together the mad libs. We also noticed some issues with the askReceive function, which we fixed.

On Wednesday, Vandhith noticed a flaw in main, which we fixed. I then made the fork in the repository.
I also realized that I misspelled askReceive as askRecieve while typing this, so I asked the others to change it in the merged code.

- **Riddhish** I was the team lead, coordinated the team's work, and combined both portions through `runner.java`. I also realized we needed to display the original story template with blanks BEFORE the final madlib so I added that functionality too. 

## How the Program Works

`runner.java` first calls `Bao_MadLibs.collectWords` to collect two verbs and an
adjective. It then passes those words to `MadLibs.createStory`, which asks for two
nouns and builds the completed story. The runner prints the orginal template and result. Both parts
use one scanner so it stays open until everything's been entered.

## How We Used Git

We used Github for version control and to share our project files in the
[APCSAGroup3 repository](https://github.com/RiddSarav/APCSAGroup3), doing it this way helped us track changes and gave us one place to access everyone's code. Using seperate files helped us avoid merge conflicts which Mr. Baez told us about a lot and based on his desription of them we really wanted to avoid them so we pivoted from the original method of each duo develops one entire program then we see which one is better. 


## What went well
Dividing the work was a huge reason it worked out in a timely way. In the future I'd like to continue dividing but also have some sort of central system like the plugin Mr.Baez showed us that everyone can use and track the entirety of the project at a glance instead of just their part. 

## Example Image
<img width="1814" height="716" alt="image" src="https://github.com/user-attachments/assets/46699903-5af8-4c22-adfb-b660522725fc" />

## Test Cases

Test case 1:
I [verb] with the [adjective] [noun]. Each [noun] was amazing, and I [second verb] with them a lot.

Test case 2:
 The [noun] [verb] across the [adjective] pond

Test case 3:
I went to the zoo to see a [noun]. There were people [verb] around the enclosure which made the [adjective] apes go bananas.

