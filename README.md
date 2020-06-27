<b>Adding an existing project to GitHub using the command line</b>
<br>
Create a new repository on GitHub. You can also add a gitignore file, a readme and a licence if you want <br>
 Open Git Bash   <br>
Change the current working directory to your local project.<br>
Initialize the local directory as a Git repository. <br>
git init   <br>
Add the files in your new local repository. This stages them for the first commit.  <br>
git add .   <br>
 Commit the files that you’ve staged in your local repository.  <br>
git commit -m "initial commit" <br>
 Copy the https url of your newly created repo <br>
In the Command prompt, add the URL for the remote repository where your local repository will be pushed.  <br>

git remote add origin remote repository URL <br>

git remote -v <br>
 Push the changes in your local repository to GitHub. <br>

git push -f origin master <br>
