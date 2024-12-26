#! /bin/bash

root_dir=$PWD
cd ./submodules/libwebp || exit 1

./autogen.sh
./configure \
--disable-static \
--disable-png \
--disable-jpeg \
--disable-tiff \
--disable-gif \
--disable-wic \
--disable-libwebpdecoder \
--disable-libwebpextras \
--disable-libwebpmux \
--disable-libwebpdemux \
--disable-sdl \
--prefix="$root_dir"/webp-imageio-lib/webp_compiled

make
make install