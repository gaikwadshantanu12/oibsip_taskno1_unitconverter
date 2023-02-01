package com.shantanu.unitconverter.utility;

public class DataConverterUtility {
    /* converting data from bits to all */
    public double FromBitsToBits(double bits) {
        return bits;
    }

    public double FromBitsToBytes(double bits) {
        return bits * 0.125;
    }

    public double FromBitsToKB(double bits) {
        return bits * 0.0001220703;
    }

    public double FromBitsToMB(double bits) {
        return bits * 1.19209290e-7;
    }

    public double FromBitsToGB(double bits) {
        return bits * 1.16415322e-10;
    }

    public double FromBitsToTB(double bits) {
        return bits * 1.13686838e-13;
    }

    /* converting from bytes to all */
    public double FromBytesToBits(double bytes) {
        return bytes * 8;
    }

    public double FromBytesToBytes(double bytes) {
        return bytes;
    }

    public double FromBytesToKB(double bytes) {
        return bytes * 0.0009765625;
    }

    public double FromBytesToMB(double bytes) {
        return bytes * 9.53674316e-7;
    }

    public double FromBytesToGB(double bytes) {
        return bytes * 9.31322575e-10;
    }

    public double FromBytesToTB(double bytes) {
        return bytes * 9.09494702e-13;
    }

    /* converting from kb to all */
    public double FromKBToBits(double kb) {
        return kb * 8192;
    }

    public double FromKBToBytes(double kb) {
        return kb * 1024;
    }

    public double FromKBToKB(double kb) {
        return kb;
    }

    public double FromKBToMB(double kb) {
        return kb * 0.0009765625;
    }

    public double FromKBToGB(double kb) {
        return kb * 9.53674316e-7;
    }

    public double FromKBToTB(double kb) {
        return kb * 9.31322575e-10;
    }

    /* converting from mb to all */
    public double FromMBToBits(double mb) {
        return mb * 8388608;
    }

    public double FromMBToBytes(double mb) {
        return mb * 1048576;
    }

    public double FromMBToKB(double mb) {
        return mb * 1024;
    }

    public double FromMBToMB(double mb) {
        return mb ;
    }
    public double FromMBToGB(double mb) {
        return mb * 0.0009765625;
    }

    public double FromMBToTB(double mb) {
        return mb * 9.53674316e-7;
    }

    /* converting from GB to all */
    public double FromGBToBits(double gb) {
        return gb * 8589934592.0;
    }

    public double FromGBToBytes(double gb) {
        return gb * 1073741824;
    }

    public double FromGBToKB(double gb) {
        return gb * 1048576;
    }

    public double FromGBToMB(double gb) {
        return gb * 1024;
    }

    public double FromGBToGB(double gb) {
        return gb;
    }

    public double FromGBToTB(double gb) {
        return gb * 0.0009765625;
    }

    /* converting from tb to all */
    public double FromTBToBits(double tb) {
        return tb * 8796093022208.0;
    }

    public double FromTBToBytes(double tb) {
        return tb * 1099511627776.0;
    }

    public double FromTBToKB(double tb) {
        return tb * 1073741824;
    }

    public double FromTBToMB(double tb) {
        return tb * 1048576;
    }

    public double FromTBToGB(double tb) {
        return tb * 1024;
    }

    public double FromTBToTB(double tb) {
        return tb;
    }
}
