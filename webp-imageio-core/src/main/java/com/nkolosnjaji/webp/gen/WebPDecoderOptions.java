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
 * struct WebPDecoderOptions {
 *     int bypass_filtering;
 *     int no_fancy_upsampling;
 *     int use_cropping;
 *     int crop_left;
 *     int crop_top;
 *     int crop_width;
 *     int crop_height;
 *     int use_scaling;
 *     int scaled_width;
 *     int scaled_height;
 *     int use_threads;
 *     int dithering_strength;
 *     int flip;
 *     int alpha_dithering_strength;
 *     uint32_t pad[5];
 * }
 * }
 */
public class WebPDecoderOptions {

    WebPDecoderOptions() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        LibWebP.C_INT.withName("bypass_filtering"),
        LibWebP.C_INT.withName("no_fancy_upsampling"),
        LibWebP.C_INT.withName("use_cropping"),
        LibWebP.C_INT.withName("crop_left"),
        LibWebP.C_INT.withName("crop_top"),
        LibWebP.C_INT.withName("crop_width"),
        LibWebP.C_INT.withName("crop_height"),
        LibWebP.C_INT.withName("use_scaling"),
        LibWebP.C_INT.withName("scaled_width"),
        LibWebP.C_INT.withName("scaled_height"),
        LibWebP.C_INT.withName("use_threads"),
        LibWebP.C_INT.withName("dithering_strength"),
        LibWebP.C_INT.withName("flip"),
        LibWebP.C_INT.withName("alpha_dithering_strength"),
        MemoryLayout.sequenceLayout(5, LibWebP.C_INT).withName("pad")
    ).withName("WebPDecoderOptions");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt bypass_filtering$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bypass_filtering"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int bypass_filtering
     * }
     */
    public static final OfInt bypass_filtering$layout() {
        return bypass_filtering$LAYOUT;
    }

    private static final long bypass_filtering$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int bypass_filtering
     * }
     */
    public static final long bypass_filtering$offset() {
        return bypass_filtering$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int bypass_filtering
     * }
     */
    public static int bypass_filtering(MemorySegment struct) {
        return struct.get(bypass_filtering$LAYOUT, bypass_filtering$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int bypass_filtering
     * }
     */
    public static void bypass_filtering(MemorySegment struct, int fieldValue) {
        struct.set(bypass_filtering$LAYOUT, bypass_filtering$OFFSET, fieldValue);
    }

    private static final OfInt no_fancy_upsampling$LAYOUT = (OfInt)$LAYOUT.select(groupElement("no_fancy_upsampling"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int no_fancy_upsampling
     * }
     */
    public static final OfInt no_fancy_upsampling$layout() {
        return no_fancy_upsampling$LAYOUT;
    }

    private static final long no_fancy_upsampling$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int no_fancy_upsampling
     * }
     */
    public static final long no_fancy_upsampling$offset() {
        return no_fancy_upsampling$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int no_fancy_upsampling
     * }
     */
    public static int no_fancy_upsampling(MemorySegment struct) {
        return struct.get(no_fancy_upsampling$LAYOUT, no_fancy_upsampling$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int no_fancy_upsampling
     * }
     */
    public static void no_fancy_upsampling(MemorySegment struct, int fieldValue) {
        struct.set(no_fancy_upsampling$LAYOUT, no_fancy_upsampling$OFFSET, fieldValue);
    }

    private static final OfInt use_cropping$LAYOUT = (OfInt)$LAYOUT.select(groupElement("use_cropping"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int use_cropping
     * }
     */
    public static final OfInt use_cropping$layout() {
        return use_cropping$LAYOUT;
    }

    private static final long use_cropping$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int use_cropping
     * }
     */
    public static final long use_cropping$offset() {
        return use_cropping$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int use_cropping
     * }
     */
    public static int use_cropping(MemorySegment struct) {
        return struct.get(use_cropping$LAYOUT, use_cropping$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int use_cropping
     * }
     */
    public static void use_cropping(MemorySegment struct, int fieldValue) {
        struct.set(use_cropping$LAYOUT, use_cropping$OFFSET, fieldValue);
    }

    private static final OfInt crop_left$LAYOUT = (OfInt)$LAYOUT.select(groupElement("crop_left"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int crop_left
     * }
     */
    public static final OfInt crop_left$layout() {
        return crop_left$LAYOUT;
    }

    private static final long crop_left$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int crop_left
     * }
     */
    public static final long crop_left$offset() {
        return crop_left$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int crop_left
     * }
     */
    public static int crop_left(MemorySegment struct) {
        return struct.get(crop_left$LAYOUT, crop_left$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int crop_left
     * }
     */
    public static void crop_left(MemorySegment struct, int fieldValue) {
        struct.set(crop_left$LAYOUT, crop_left$OFFSET, fieldValue);
    }

    private static final OfInt crop_top$LAYOUT = (OfInt)$LAYOUT.select(groupElement("crop_top"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int crop_top
     * }
     */
    public static final OfInt crop_top$layout() {
        return crop_top$LAYOUT;
    }

    private static final long crop_top$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int crop_top
     * }
     */
    public static final long crop_top$offset() {
        return crop_top$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int crop_top
     * }
     */
    public static int crop_top(MemorySegment struct) {
        return struct.get(crop_top$LAYOUT, crop_top$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int crop_top
     * }
     */
    public static void crop_top(MemorySegment struct, int fieldValue) {
        struct.set(crop_top$LAYOUT, crop_top$OFFSET, fieldValue);
    }

    private static final OfInt crop_width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("crop_width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int crop_width
     * }
     */
    public static final OfInt crop_width$layout() {
        return crop_width$LAYOUT;
    }

    private static final long crop_width$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int crop_width
     * }
     */
    public static final long crop_width$offset() {
        return crop_width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int crop_width
     * }
     */
    public static int crop_width(MemorySegment struct) {
        return struct.get(crop_width$LAYOUT, crop_width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int crop_width
     * }
     */
    public static void crop_width(MemorySegment struct, int fieldValue) {
        struct.set(crop_width$LAYOUT, crop_width$OFFSET, fieldValue);
    }

    private static final OfInt crop_height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("crop_height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int crop_height
     * }
     */
    public static final OfInt crop_height$layout() {
        return crop_height$LAYOUT;
    }

    private static final long crop_height$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int crop_height
     * }
     */
    public static final long crop_height$offset() {
        return crop_height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int crop_height
     * }
     */
    public static int crop_height(MemorySegment struct) {
        return struct.get(crop_height$LAYOUT, crop_height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int crop_height
     * }
     */
    public static void crop_height(MemorySegment struct, int fieldValue) {
        struct.set(crop_height$LAYOUT, crop_height$OFFSET, fieldValue);
    }

    private static final OfInt use_scaling$LAYOUT = (OfInt)$LAYOUT.select(groupElement("use_scaling"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int use_scaling
     * }
     */
    public static final OfInt use_scaling$layout() {
        return use_scaling$LAYOUT;
    }

    private static final long use_scaling$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int use_scaling
     * }
     */
    public static final long use_scaling$offset() {
        return use_scaling$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int use_scaling
     * }
     */
    public static int use_scaling(MemorySegment struct) {
        return struct.get(use_scaling$LAYOUT, use_scaling$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int use_scaling
     * }
     */
    public static void use_scaling(MemorySegment struct, int fieldValue) {
        struct.set(use_scaling$LAYOUT, use_scaling$OFFSET, fieldValue);
    }

    private static final OfInt scaled_width$LAYOUT = (OfInt)$LAYOUT.select(groupElement("scaled_width"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int scaled_width
     * }
     */
    public static final OfInt scaled_width$layout() {
        return scaled_width$LAYOUT;
    }

    private static final long scaled_width$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int scaled_width
     * }
     */
    public static final long scaled_width$offset() {
        return scaled_width$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int scaled_width
     * }
     */
    public static int scaled_width(MemorySegment struct) {
        return struct.get(scaled_width$LAYOUT, scaled_width$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int scaled_width
     * }
     */
    public static void scaled_width(MemorySegment struct, int fieldValue) {
        struct.set(scaled_width$LAYOUT, scaled_width$OFFSET, fieldValue);
    }

    private static final OfInt scaled_height$LAYOUT = (OfInt)$LAYOUT.select(groupElement("scaled_height"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int scaled_height
     * }
     */
    public static final OfInt scaled_height$layout() {
        return scaled_height$LAYOUT;
    }

    private static final long scaled_height$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int scaled_height
     * }
     */
    public static final long scaled_height$offset() {
        return scaled_height$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int scaled_height
     * }
     */
    public static int scaled_height(MemorySegment struct) {
        return struct.get(scaled_height$LAYOUT, scaled_height$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int scaled_height
     * }
     */
    public static void scaled_height(MemorySegment struct, int fieldValue) {
        struct.set(scaled_height$LAYOUT, scaled_height$OFFSET, fieldValue);
    }

    private static final OfInt use_threads$LAYOUT = (OfInt)$LAYOUT.select(groupElement("use_threads"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int use_threads
     * }
     */
    public static final OfInt use_threads$layout() {
        return use_threads$LAYOUT;
    }

    private static final long use_threads$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int use_threads
     * }
     */
    public static final long use_threads$offset() {
        return use_threads$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int use_threads
     * }
     */
    public static int use_threads(MemorySegment struct) {
        return struct.get(use_threads$LAYOUT, use_threads$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int use_threads
     * }
     */
    public static void use_threads(MemorySegment struct, int fieldValue) {
        struct.set(use_threads$LAYOUT, use_threads$OFFSET, fieldValue);
    }

    private static final OfInt dithering_strength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dithering_strength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int dithering_strength
     * }
     */
    public static final OfInt dithering_strength$layout() {
        return dithering_strength$LAYOUT;
    }

    private static final long dithering_strength$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int dithering_strength
     * }
     */
    public static final long dithering_strength$offset() {
        return dithering_strength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int dithering_strength
     * }
     */
    public static int dithering_strength(MemorySegment struct) {
        return struct.get(dithering_strength$LAYOUT, dithering_strength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int dithering_strength
     * }
     */
    public static void dithering_strength(MemorySegment struct, int fieldValue) {
        struct.set(dithering_strength$LAYOUT, dithering_strength$OFFSET, fieldValue);
    }

    private static final OfInt flip$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flip"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int flip
     * }
     */
    public static final OfInt flip$layout() {
        return flip$LAYOUT;
    }

    private static final long flip$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int flip
     * }
     */
    public static final long flip$offset() {
        return flip$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int flip
     * }
     */
    public static int flip(MemorySegment struct) {
        return struct.get(flip$LAYOUT, flip$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int flip
     * }
     */
    public static void flip(MemorySegment struct, int fieldValue) {
        struct.set(flip$LAYOUT, flip$OFFSET, fieldValue);
    }

    private static final OfInt alpha_dithering_strength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("alpha_dithering_strength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int alpha_dithering_strength
     * }
     */
    public static final OfInt alpha_dithering_strength$layout() {
        return alpha_dithering_strength$LAYOUT;
    }

    private static final long alpha_dithering_strength$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int alpha_dithering_strength
     * }
     */
    public static final long alpha_dithering_strength$offset() {
        return alpha_dithering_strength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int alpha_dithering_strength
     * }
     */
    public static int alpha_dithering_strength(MemorySegment struct) {
        return struct.get(alpha_dithering_strength$LAYOUT, alpha_dithering_strength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int alpha_dithering_strength
     * }
     */
    public static void alpha_dithering_strength(MemorySegment struct, int fieldValue) {
        struct.set(alpha_dithering_strength$LAYOUT, alpha_dithering_strength$OFFSET, fieldValue);
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

    private static final long pad$OFFSET = 56;

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

