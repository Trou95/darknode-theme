plugins {
    id("org.jetbrains.intellij.platform") version "2.19.0"
}

group = "darknode.theme"
version = "1.1.0"

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdeaCommunity("2025.2.6.2")
    }
}

intellijPlatform {
    pluginConfiguration {
        name = "Darknode Theme"
        version = project.version.toString()
        ideaVersion {
            sinceBuild = "252"
        }
    }

    publishing {
        token = providers.environmentVariable("JETBRAINS_MARKETPLACE_TOKEN")
    }
}

tasks {
    buildPlugin {
        archiveFileName.set("darknode-theme-${project.version}.zip")
    }
}
