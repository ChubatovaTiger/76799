package patches.vcsRoots

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.ui.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a vcsRoot with id = 'Abc_HttpsGithubComChubatovaTigerChubatovaGradleTestsBackup'
in the project with id = 'Abc', and delete the patch script.
*/
create(RelativeId("Abc"), GitVcsRoot({
    id("Abc_HttpsGithubComChubatovaTigerChubatovaGradleTestsBackup")
    name = "https://github.com/ChubatovaTiger/ChubatovaGradleTestsBackup"
    url = "https://github.com/ChubatovaTiger/ChubatovaGradleTestsBackup"
    branch = "refs/heads/master"
    authMethod = password {
        userName = "ChubatovaTiger"
        password = "credentialsJSON:3a173cc6-a0af-429e-aa77-d67bfd54a87a"
    }
}))

