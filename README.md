# TextureWeaving
Simple Java Tool To Convert Minecraft: Pi Edition's Texture Atlases (``terrain.png``, etc) Into Separate Files (``block/stone.png``, etc) And Vice Versa

## Usage
```
TextureWeaving <stitch|cut> <input> <output>
```

### Example
```she
java -jar TextureWeaving*.jar cut ~/Documents/mcpi/data/images out
java -jar TextureWeaving*.jar stitch out ~/Documents/mcpi/data/images
```

## Building

### System Requirements
- Java

```sh
git clone https://github.com/MCPI-Revival/TextureWeaving/
cd TextureWeaving
```

### Linux
```sh
./gradlew build
```

### Windows
```sh
gradlew.bat build
```
