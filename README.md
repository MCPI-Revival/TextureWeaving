# TextureWeaving
Simple Java Tool To Convert Minecraft: Pi Edition's Texture Atlases (``terrain.png``, etc) Into Separate Files (``block/stone.png``, etc) And Vice Versa

## Usage
```
TextureWeaving <stitch|cut> <input> <output>
```

### Example
```she
java -jar TextureWeaving-<Version>.jar cut ~/Documents/mcpi/data/images out
java -jar TextureWeaving-<Version>.jar stitch out ~/Documents/mcpi/data/images
```

## System Requirmeents
- Java Runtime Environment (Version 8 Or Higher)

## Building

### Build Requirements
- Java Development Kit (Version 8 Or Higher)
- Git

### Procedure
```sh
git clone --depth 1 https://github.com/MCPI-Revival/TextureWeaving.git
cd TextureWeaving
./gradlew build # Windows Users Must Run "gradlew.bat build" Instead
# The JAR File Will Be Output In "build/libs"
```

#### Linux
```sh
./gradlew build
```

#### Windows
```sh
gradlew.bat build
```
