// Generated by jextract

package com.nkolosnjaji.webp.gen;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct WebPBitstreamFeatures {
 *     int width;
 *     int height;
 *     int has_alpha;
 *     int has_animation;
 *     int format;
 *     uint32_t pad[5];
 * }
 * }
 */
public class WebPBitstreamFeatures {

    WebPBitstreamFeatures() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        LibWebP.C_INT.withName("width"),
        LibWebP.C_INT.withName("height"),
        LibWebP.C_INT.withName("has_alpha"),
        LibWebP.C_INT.withName("has_animation"),
        LibWebP.C_INT.withName("format"),
        MemoryLayout.sequenceLayout(5, LibWebP.C_INT).withName("pad")
    ).withName("WebPBitstreamFeatures");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static final OfInt width$layout() {
        return width$LAYOUT;
    }

    private static final long width$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static final long width$offset() {
        return width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static int width(MemorySegment struct) {
        return struct.get(width$LAYOUT, width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int width
     * }
     */
    public static void width(MemorySegment struct, int fieldValue) {
        struct.set(width$LAYOUT, width$OFFSET, fieldValue);
    }

    private static final OfInt height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static final OfInt height$layout() {
        return height$LAYOUT;
    }

    private static final long height$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static final long height$offset() {
        return height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static int height(MemorySegment struct) {
        return struct.get(height$LAYOUT, height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int height
     * }
     */
    public static void height(MemorySegment struct, int fieldValue) {
        struct.set(height$LAYOUT, height$OFFSET, fieldValue);
    }

    private static final OfInt has_alpha$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_alpha"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int has_alpha
     * }
     */
    public static final OfInt has_alpha$layout() {
        return has_alpha$LAYOUT;
    }

    private static final long has_alpha$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int has_alpha
     * }
     */
    public static final long has_alpha$offset() {
        return has_alpha$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int has_alpha
     * }
     */
    public static int has_alpha(MemorySegment struct) {
        return struct.get(has_alpha$LAYOUT, has_alpha$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int has_alpha
     * }
     */
    public static void has_alpha(MemorySegment struct, int fieldValue) {
        struct.set(has_alpha$LAYOUT, has_alpha$OFFSET, fieldValue);
    }

    private static final OfInt has_animation$LAYOUT = (OfInt)$LAYOUT.select(groupElement("has_animation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int has_animation
     * }
     */
    public static final OfInt has_animation$layout() {
        return has_animation$LAYOUT;
    }

    private static final long has_animation$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int has_animation
     * }
     */
    public static final long has_animation$offset() {
        return has_animation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int has_animation
     * }
     */
    public static int has_animation(MemorySegment struct) {
        return struct.get(has_animation$LAYOUT, has_animation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int has_animation
     * }
     */
    public static void has_animation(MemorySegment struct, int fieldValue) {
        struct.set(has_animation$LAYOUT, has_animation$OFFSET, fieldValue);
    }

    private static final OfInt format$LAYOUT = (OfInt)$LAYOUT.select(groupElement("format"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int format
     * }
     */
    public static final OfInt format$layout() {
        return format$LAYOUT;
    }

    private static final long format$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int format
     * }
     */
    public static final long format$offset() {
        return format$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int format
     * }
     */
    public static int format(MemorySegment struct) {
        return struct.get(format$LAYOUT, format$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int format
     * }
     */
    public static void format(MemorySegment struct, int fieldValue) {
        struct.set(format$LAYOUT, format$OFFSET, fieldValue);
    }

    private static final SequenceLayout pad$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("pad"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * uint32_t pad[5]
     * }
     */
    public static final SequenceLayout pad$layout() {
        return pad$LAYOUT;
    }

    private static final long pad$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * uint32_t pad[5]
     * }
     */
    public static final long pad$offset() {
        return pad$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * uint32_t pad[5]
     * }
     */
    public static MemorySegment pad(MemorySegment struct) {
        return struct.asSlice(pad$OFFSET, pad$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * uint32_t pad[5]
     * }
     */
    public static void pad(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pad$OFFSET, pad$LAYOUT.byteSize());
    }

    private static long[] pad$DIMS = { 5 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * uint32_t pad[5]
     * }
     */
    public static long[] pad$dimensions() {
        return pad$DIMS;
    }
    private static final VarHandle pad$ELEM_HANDLE = pad$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * uint32_t pad[5]
     * }
     */
    public static int pad(MemorySegment struct, long index0) {
        return (int)pad$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * uint32_t pad[5]
     * }
     */
    public static void pad(MemorySegment struct, long index0, int fieldValue) {
        pad$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

