package com.nkolosnjaji.webp.imageio;

import com.nkolosnjaji.webp.imageio.exceptions.WebPWrongVersionException;
import com.nkolosnjaji.webp.gen.LibWebP;
import com.nkolosnjaji.webp.gen.WebPConfig;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Objects;

class InternalWriteConfig {

    private final MemorySegment ms;

    public InternalWriteConfig(Arena arena, WebPWriterParam param) {
        Objects.requireNonNull(arena, "arena must not be null");
        Objects.requireNonNull(param, "param must not be null");
        this.ms = WebPConfig.allocate(arena);
        final float quality = param.getCompressionQuality() * 100F;

        if (LibWebP.WebPConfigInitInternal(ms, getPreset(param.getPreset()), quality, LibWebP.WEBP_ENCODER_ABI_VERSION()) != 1) {
            throw new WebPWrongVersionException();
        }

        if (param.getMethod() != null) {
            WebPConfig.method(this.ms, param.getMethod());
        }

        if (param.getImageHint() != null) {
            WebPConfig.image_hint(this.ms, getHint(param.getImageHint()));
        }

        if(Boolean.TRUE.equals(param.getMultiThreading())) {
            WebPConfig.thread_level(this.ms, 1);
        }
        if(Boolean.TRUE.equals(param.getLowMemory())) {
            WebPConfig.low_memory(this.ms, 1);
        }

    }

    public MemorySegment getMemorySegment() {
        return this.ms;
    }

    private static int getPreset(WebPWriterParam.WebPWriterPreset writerPreset) {
        return switch (writerPreset) {
            case PHOTO -> LibWebP.WEBP_PRESET_PHOTO();
            case PICTURE -> LibWebP.WEBP_PRESET_PICTURE();
            case DRAWING -> LibWebP.WEBP_PRESET_DRAWING();
            case ICON -> LibWebP.WEBP_PRESET_ICON();
            case TEXT -> LibWebP.WEBP_PRESET_TEXT();
            case null, default -> LibWebP.WEBP_PRESET_DEFAULT();
        };
    }

    private static int getHint(WebPWriterParam.WebPWriterHint hint) {
        return switch (hint) {
            case PHOTO -> LibWebP.WEBP_HINT_PHOTO();
            case PICTURE -> LibWebP.WEBP_HINT_PICTURE();
            case GRAPH -> LibWebP.WEBP_HINT_GRAPH();
            case null, default -> LibWebP.WEBP_PRESET_DEFAULT();
        };
    }

}
