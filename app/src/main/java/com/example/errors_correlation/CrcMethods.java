package com.example.errors_correlation;

import java.util.zip.CRC32;

public class CrcMethods {
    public static int crc16(byte[] bytes) {
        int crc = 0xFFFF;

        for (int j = 0; j < bytes.length; j++) {
            crc = ((crc >>> 8) | (crc << 8)) & 0xffff;
            crc ^= (bytes[j] & 0xff);
            crc ^= ((crc & 0xff) >> 4);
            crc ^= (crc << 12) & 0xffff;
            crc ^= ((crc & 0xFF) << 5) & 0xffff;
        }
        crc &= 0xffff;
        return crc;

    }

}
