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


<b>…or create a new repository on the command line</b>
echo "# eureka-web-app" >> README.md<br> 
git init   <br>
git add README.md   <br>
git commit -m "first commit"  <br>
git remote add origin https://github.com/prk54989/eureka-web-app.git  <br>
git push -u origin master  <br>

<b>…or push an existing repository from the command line</b>
git remote add origin https://github.com/prk54989/eureka-web-app.git  <br>
git push -u origin master   <br>

<b>…or import code from another repository</b>
You can initialize this repository with code from a Subversion, Mercurial, or TFS project.


