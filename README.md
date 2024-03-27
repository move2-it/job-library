# job-library
The library includes a data model for job openings.

## Use as a dependency
To use the library in your applications, you also need to define a section for the configuration of alternative repositories.

Example Maven pom.xml file
```xml
<project>
    <dependencies>
        <dependency>
            <groupId>it.move2</groupId>
            <artifactId>job-library</artifactId>
            <version>1.1-SNAPSHOT</version>
        </dependency>
    </dependencies>
    <repositories>
        <repository>
            <id>myMavenRepo.read</id>
            <url>https://mymavenrepo.com/repo/HacqEK82nwHrGEPNCxdt/</url>
        </repository>
    </repositories>
</project>
```

## Release new version

### Configure the environment
Before releasing a new version, you need to set a password for the remote repository. The password can be found under the name "myMavenRepo" in the "move2it" collection in the Bitwarden password manager.  

Add the following section to the file ~/.m2/settings.xml  
```xml
<settings>
    <servers>
        <server>
            <id>myMavenRepo.write</id>
            <username>myMavenRepo</username>
            <password>{...}</password>
        </server>
    </servers>
</settings>
```

Remember not to store the password in plain text in a file, but in an encrypted way. Check [Maven Password Encryption](https://maven.apache.org/guides/mini/guide-encryption.html) for more information.  

### Release
Prepare the library for release, bump up the version in the [pom.xml](./pom.xml) file and merge all changes to the main branch, then execute the command:

```bash
mvn clean install deploy
```

The new version of the library should now be available.