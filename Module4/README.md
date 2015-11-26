#Installing Maven

To install Maven, the preferred method of doing this is using a package manager.
Package managers are tools that help you install stuff quickly and conveniently by
automatically doing all the things you don't really care about like downloading and
configuring things.

##Windows
The best package manager for windows so far is [Chocolatey](https://chocolatey.org). Installing it is really easy. You need to open up the command line **as an administrator**  by searching for **cmd** in the start menu/screen, right clicking and selecting **run as administrator**. Next paste the first terminal command on the chocolatey homepage and hit enter. Once that is done restart the command line and you are done.

Now on to installing maven. In the command line, type

```sh
 choco install maven
```
and hit enter. Follow the on screen prompts and choco will take care of the rest.

## Creating a new project

```sh
mvn archetype:generate
```

## Important maven commands

Compile your code
```sh
mvn compile
```

Package your application into a `*.jar`
```sh
mvn package
```

Copy your compiled and packaged `*.jar` into your local maven repository
```sh
mvn install
```
