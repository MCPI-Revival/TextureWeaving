# TextureWeaving
Simple Java Tool To Convert Minecraft: Pi Edition's Texture Atlases (``terrain.png``, etc) Into Separate Files (``block/stone.png``, etc) And Vice Versa

## Usage
```
TextureWeaving <stitch|cut> <input> <output>
```

### Example
```she
java -jar TextureWeaving-1.0-SNAPSHOT.jar cut ~/Documents/mcpi/data/images out
java -jar TextureWeaving-1.0-SNAPSHOT.jar stitch out ~/Documents/mcpi/data/images
```