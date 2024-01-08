#!/bin/bash

sudo qemu-system-x86_64 -m 1024 -drive file=/dev/disk/by-label/Lfsfs,format=raw -boot d
