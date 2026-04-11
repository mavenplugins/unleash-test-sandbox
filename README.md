# unleash-sandbox
[![Eclipse Public License](https://img.shields.io/github/license/mavenplugins/unleash-test-sandbox?label=License)](./LICENSE)
[![CI](https://github.com/mavenplugins/unleash-test-sandbox/actions/workflows/build_and_deploy.yml/badge.svg)](https://github.com/mavenplugins/unleash-test-sandbox/actions/workflows/build_and_deploy.yml)
[![E2E](https://github.com/mavenplugins/unleash-test-sandbox/actions/workflows/test_unleash_e2e.yml/badge.svg)](https://github.com/mavenplugins/unleash-test-sandbox/actions/workflows/test_unleash_e2e.yml)
[![Maven Central Snapshot](https://img.shields.io/maven-metadata/v?label=Maven%20Central%20Snapshot&metadataUrl=https%3A%2F%2Fcentral.sonatype.com%2Frepository%2Fmaven-snapshots%2Fio%2Fgithub%2Fmavenplugins%2Ftest%2Funleash-sandbox-parent%2Fmaven-metadata.xml)](https://central.sonatype.com/repository/maven-snapshots/io/github/mavenplugins/test/unleash-sandbox-parent/maven-metadata.xml)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.mavenplugins.test/unleash-sandbox-parent.svg?label=Maven%20Central&color=blue)](https://search.maven.org/artifact/io.github.mavenplugins.test/unleash-sandbox-parent)

A project supposed to test [unleash-maven-plugin](https://github.com/mavenplugins/unleash-maven-plugin) perform variants and workflows on.

## Test Command Examples
- `mvnDebug unleash:perform -Dworkflow=workflows/logScmProviderTagAndMsgPrefix.txt -Dunleash.scmMessagePrefix="JIRA-1 :: [unleash PRODUCT@{project.version}]\n\n"`

## Contributors
[![Code Contributors](https://contrib.rocks/image?repo=mavenplugins/unleash-test-sandbox)](https://github.com/mavenplugins/unleash-test-sandbox/graphs/contributors)
