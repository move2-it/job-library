# job-library
The library includes a data model for job openings.

## Release new version

### Configure environment
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
