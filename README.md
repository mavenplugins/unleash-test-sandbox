# unleash-sandbox
[![Eclipse Public License](https://img.shields.io/github/license/mavenplugins/unleash-test-sandbox?label=License)](./LICENSE)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.mavenplugins.test/unleash-sandbox-parent.svg?label=Maven%20Central)](https://search.maven.org/artifact/io.github.mavenplugins.test/unleash-sandbox-parent)
[![CI](https://github.com/mavenplugins/unleash-test-sandbox/actions/workflows/build_and_deploy.yml/badge.svg)](https://github.com/mavenplugins/unleash-test-sandbox/actions/workflows/build_and_deploy.yml)

A project supposed to test [unleash-maven-plugin](https://github.com/mavenplugins/unleash-maven-plugin) perform variants and workflows on.

## Test Command Examples
- `mvnDebug unleash:perform -Dworkflow=workflows/logScmProviderTagAndMsgPrefix.txt -Dunleash.scmMessagePrefix="JIRA-1 :: [unleash PRODUCT@{project.version}]\n\n"`

### Release without deployment
- `mvn unleash:perform -Dworkflow=workflows/performReleaseNoDeployRollbackAfterInstallArtifacts.txt -Dunleash.scmMessagePrefix="JIRA-1 :: [unleash PRODUCT@{project.version}]\n\n" -Dunleash.commitBeforeTagging=true -DenableLogTimestamps=true -Dunleash.releaseVersion=1.0.12 -Dunleash.developmentVersion=1.0.13-SNAPSHOT`

## Contributors
[![Code Contributors](https://contrib.rocks/image?repo=mavenplugins/unleash-test-sandbox)](https://github.com/mavenplugins/unleash-test-sandbox/graphs/contributors)
