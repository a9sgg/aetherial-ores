# Aetherial Ores - Minecraft Fabric 1.21 Mod (Java 21)

A complete, production-ready Fabric 1.21 mod introducing celestial ores, mystical crystalline veins, high-tier metallurgy, and ethereal mining tools.

## 🛠️ Standards & Highlights (Minecraft 1.21 + Java 21)

1. **Modern Identifier Construction**:
   - Uses `Identifier.of("aetherialores", "item_name")` rather than deprecated `new Identifier(...)`.
2. **Fabric 1.21 Tool Material Evolution**:
   - Implements `ToolMaterial.getInverseTag()` returning a `TagKey<Block>` (replacing the legacy integer `getMiningLevel()`).
3. **Java 21 LTS Target**:
   - Built for Java 21 with bytecode release target `21` in `build.gradle`.
4. **Dynamic Item Groups**:
   - Uses `FabricItemGroup.builder()` with `RegistryKey<ItemGroup>` registered to `Registries.ITEM_GROUP`.
5. **Modern 1.21 Loot Tables**:
   - Implements `minecraft:alternatives` with Silk Touch enchantment predicates and `minecraft:apply_bonus` Fortune functions.

## 🚀 How to Build and Run

### Prerequisites
- **Java 21 Development Kit (JDK 21)** installed.
- IntelliJ IDEA or VS Code with Fabric / Minecraft plugins.

### Commands
```bash
# Build production mod jar in build/libs/
./gradlew build

# Launch client test instance
./gradlew runClient

# Launch dedicated server test instance
./gradlew runServer
```
