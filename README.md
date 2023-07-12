## package-consumer

Project demonstrates how to use maven package from github apache maven registry

---
To resolve dependency locally create settings xml file

```~/.m2/settings.xml```

with content:

```
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">
  <servers>
    <server>
      <id>github</id>
      <username>USERNAME</username>
      <password>TOKEN</password>
    </server>
  </servers>
</settings>
```

for password (TOKEN) generate PAT (personal access token) with at least read package privilege

---
To resolve dependency in github workflow use setup java action.

Action automatically creates settings xml for github server and expects GITHUB_ACTOR and GITHUB_TOKEN for authentication.
GITHUB_ACTOR environment variable is provided automatically.
GITHUB_TOKEN you'll need to expose as environment variable:

```
    env:
      GITHUB_TOKEN: ${{secrets.GITHUB_TOKEN}}
```
