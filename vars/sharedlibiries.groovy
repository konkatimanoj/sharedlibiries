
def gitdownload(repo)
{
   git 'https://github.com/intelliqittrainings/$(repo).git'

}
def gitbuild()
{
  sh 'mvn package'
}
