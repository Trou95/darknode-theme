# Darknode Theme

A polished dark theme for WebStorm and other JetBrains IDEs, with two UI variants: Darknode Theme and Darknode Islands. Both use the same Darknode editor color scheme.


<img width="2502" height="1329" alt="darknode-screenshot" src="https://github.com/user-attachments/assets/49d01b78-9782-45ee-84e1-6fe111c11427" />



## Installation

1. Install **Darknode Theme** directly from the [JetBrains Marketplace](https://plugins.jetbrains.com/plugin/28129-darknode-theme), or download the plugin ZIP from this repository's [GitHub Releases](https://github.com/Trou95/darknode-theme/releases)
2. Open your JetBrains IDE (IntelliJ IDEA, WebStorm, etc.)
3. Go to **File** > **Settings** > **Plugins**
4. Click the gear icon ⚙️ and select **Install Plugin from Disk...**
5. Select the downloaded `darknode-theme-*.zip` file
6. Click **OK** and restart your IDE
7. Go to **File** > **Settings** > **Appearance & Behavior** > **Appearance**
8. Select **Darknode Theme** or **Darknode Islands** from the theme dropdown

Darknode Islands requires a JetBrains IDE version that includes the Islands UI (2025.2.3 or newer; Islands is the default UI in 2025.3). The classic Darknode Theme remains available for the standard UI.

## Building and publishing

Run `gradle buildPlugin` to create `build/distributions/darknode-theme-1.1.0.zip`. To publish an update to the JetBrains Marketplace, set `JETBRAINS_MARKETPLACE_TOKEN` to a Marketplace publishing token and run `gradle publishPlugin`. Creating a `v*` tag builds the ZIP and attaches it to the matching GitHub Release.
