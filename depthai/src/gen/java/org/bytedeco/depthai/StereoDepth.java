// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


/**
 * \brief StereoDepth node. Compute stereo disparity and depth from left-right image pair.
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class StereoDepth extends StereoDepthPropertiesNode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StereoDepth(Pointer p) { super(p); }

    @MemberGetter public static native @Cast("const char*") BytePointer NAME();

    /**
     * Preset modes for stereo depth.
     */
    public enum PresetMode { HIGH_ACCURACY(0), HIGH_DENSITY(1);

        public final int value;
        private PresetMode(int v) { this.value = v; }
        private PresetMode(PresetMode e) { this.value = e.value; }
        public PresetMode intern() { for (PresetMode e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }
    public StereoDepth(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);
    public StereoDepth(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr StereoDepthProperties props) { super((Pointer)null); allocate(par, nodeId, props); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr StereoDepthProperties props);

    /**
     * Initial config to use for StereoDepth.
     */
    @MemberGetter public native @ByRef StereoDepthConfig initialConfig();

    /**
     * Input StereoDepthConfig message with ability to modify parameters in runtime.
     * Default queue is non-blocking with size 4.
     */
    @MemberGetter public native @ByRef Input inputConfig();

    /**
     * Input for left ImgFrame of left-right pair
     *
     * Default queue is non-blocking with size 8
     */
    @MemberGetter public native @ByRef Input left();

    /**
     * Input for right ImgFrame of left-right pair
     *
     * Default queue is non-blocking with size 8
     */
    @MemberGetter public native @ByRef Input right();

    /**
     * Outputs ImgFrame message that carries RAW16 encoded (0..65535) depth data in depth units (millimeter by default).
     *
     * Non-determined / invalid depth values are set to 0
     */
    @MemberGetter public native @ByRef Output depth();

    /**
     * Outputs ImgFrame message that carries RAW8 / RAW16 encoded disparity data:
     * RAW8 encoded (0..95) for standard mode;
     * RAW8 encoded (0..190) for extended disparity mode;
     * RAW16 encoded for subpixel disparity mode:
     * - 0..760 for 3 fractional bits (by default)
     * - 0..1520 for 4 fractional bits
     * - 0..3040 for 5 fractional bits
     */
    @MemberGetter public native @ByRef Output disparity();

    /**
     * Passthrough ImgFrame message from 'left' Input.
     */
    @MemberGetter public native @ByRef Output syncedLeft();

    /**
     * Passthrough ImgFrame message from 'right' Input.
     */
    @MemberGetter public native @ByRef Output syncedRight();

    /**
     * Outputs ImgFrame message that carries RAW8 encoded (grayscale) rectified frame data.
     */
    @MemberGetter public native @ByRef Output rectifiedLeft();

    /**
     * Outputs ImgFrame message that carries RAW8 encoded (grayscale) rectified frame data.
     */
    @MemberGetter public native @ByRef Output rectifiedRight();

    /**
     * Outputs StereoDepthConfig message that contains current stereo configuration.
     */
    @MemberGetter public native @ByRef Output outConfig();

    /**
     * Outputs ImgFrame message that carries left-right check first iteration (before combining with second iteration) disparity map.
     * Useful for debugging/fine tuning.
     */
    @MemberGetter public native @ByRef Output debugDispLrCheckIt1();

    /**
     * Outputs ImgFrame message that carries left-right check second iteration (before combining with first iteration) disparity map.
     * Useful for debugging/fine tuning.
     */
    @MemberGetter public native @ByRef Output debugDispLrCheckIt2();

    /**
     * Outputs ImgFrame message that carries extended left-right check first iteration (downscaled frame, before combining with second iteration) disparity map.
     * Useful for debugging/fine tuning.
     */
    @MemberGetter public native @ByRef Output debugExtDispLrCheckIt1();

    /**
     * Outputs ImgFrame message that carries extended left-right check second iteration (downscaled frame, before combining with first iteration) disparity map.
     * Useful for debugging/fine tuning.
     */
    @MemberGetter public native @ByRef Output debugExtDispLrCheckIt2();

    /**
     * Outputs ImgFrame message that carries cost dump of disparity map.
     * Useful for debugging/fine tuning.
     */
    @MemberGetter public native @ByRef Output debugDispCostDump();

    /**
     * Outputs ImgFrame message that carries RAW8 confidence map.
     * Lower values means higher confidence of the calculated disparity value.
     * RGB alignment, left-right check or any postproccessing (e.g. median filter) is not performed on confidence map.
     */
    @MemberGetter public native @ByRef Output confidenceMap();

    /**
     * Specify local filesystem path to the calibration file
     * @param path Path to calibration file. If empty use EEPROM
     */
    public native @Deprecated void loadCalibrationFile(@StdString BytePointer path);
    public native @Deprecated void loadCalibrationFile(@StdString ByteBuffer path);
    public native @Deprecated void loadCalibrationFile(@StdString String path);

    /**
     * Specify calibration data as a vector of bytes
     * @param path Calibration data. If empty use EEPROM
     */
    public native @Deprecated void loadCalibrationData(@Cast("std::uint8_t*") @StdVector BytePointer data);
    public native @Deprecated void loadCalibrationData(@Cast("std::uint8_t*") @StdVector ByteBuffer data);
    public native @Deprecated void loadCalibrationData(@Cast("std::uint8_t*") @StdVector byte[] data);

    /**
     * Specify that a passthrough/dummy calibration should be used,
     * when input frames are already rectified (e.g. sourced from recordings on the host)
     */
    public native @Deprecated void setEmptyCalibration();

    /**
     * Specify local filesystem paths to the mesh calibration files for 'left' and 'right' inputs.
     *
     * When a mesh calibration is set, it overrides the camera intrinsics/extrinsics matrices.
     * Mesh format: a sequence of (y,x) points as 'float' with coordinates from the input image
     * to be mapped in the output. The mesh can be subsampled, configured by {@code setMeshStep}.
     *
     * With a 1280x800 resolution and the default (16,16) step, the required mesh size is:
     *
     * width: 1280 / 16 + 1 = 81
     *
     * height: 800 / 16 + 1 = 51
     */
    public native void loadMeshFiles(@StdString BytePointer pathLeft, @StdString BytePointer pathRight);
    public native void loadMeshFiles(@StdString ByteBuffer pathLeft, @StdString ByteBuffer pathRight);
    public native void loadMeshFiles(@StdString String pathLeft, @StdString String pathRight);

    /**
     * Specify mesh calibration data for 'left' and 'right' inputs, as vectors of bytes.
     * See {@code loadMeshFiles} for the expected data format
     */
    public native void loadMeshData(@Cast("std::uint8_t*") @StdVector BytePointer dataLeft, @Cast("std::uint8_t*") @StdVector BytePointer dataRight);
    public native void loadMeshData(@Cast("std::uint8_t*") @StdVector ByteBuffer dataLeft, @Cast("std::uint8_t*") @StdVector ByteBuffer dataRight);
    public native void loadMeshData(@Cast("std::uint8_t*") @StdVector byte[] dataLeft, @Cast("std::uint8_t*") @StdVector byte[] dataRight);

    /**
     * Set the distance between mesh points. Default: (16, 16)
     */
    public native void setMeshStep(int width, int height);

    /**
     * Specify input resolution size
     *
     * Optional if MonoCamera exists, otherwise necessary
     */
    public native void setInputResolution(int width, int height);

    /**
     * Specify input resolution size
     *
     * Optional if MonoCamera exists, otherwise necessary
     */
    public native void setInputResolution(@ByVal @Cast("std::tuple<int,int>*") Pointer resolution);

    /**
     * Specify disparity/depth output resolution size, implemented by scaling.
     *
     * Currently only applicable when aligning to RGB camera
     */
    public native void setOutputSize(int width, int height);

    /**
     * Specifies whether the frames resized by {@code setOutputSize} should preserve aspect ratio,
     * with potential cropping when enabled. Default {@code true}
     */
    public native void setOutputKeepAspectRatio(@Cast("bool") boolean keep);

    /**
     * @param median Set kernel size for disparity/depth median filtering, or disable
     */
    public native @Deprecated void setMedianFilter(MedianFilter median);
    public native @Deprecated void setMedianFilter(@Cast("dai::MedianFilter") int median);

    /**
     * @param align Set the disparity/depth alignment: centered (between the 'left' and 'right' inputs),
     * or from the perspective of a rectified output stream
     */
    public native void setDepthAlign(RawStereoDepthConfig.AlgorithmControl.DepthAlign align);

    /**
     * @param camera Set the camera from whose perspective the disparity/depth will be aligned
     */
    public native void setDepthAlign(CameraBoardSocket camera);
    public native void setDepthAlign(@Cast("dai::CameraBoardSocket") int camera);

    /**
     * Confidence threshold for disparity calculation
     * @param confThr Confidence threshold value 0..255
     */
    public native @Deprecated void setConfidenceThreshold(int confThr);

    /**
     * Rectify input images or not.
     */
    public native void setRectification(@Cast("bool") boolean enable);

    /**
     * Computes and combines disparities in both L-R and R-L directions, and combine them.
     *
     * For better occlusion handling, discarding invalid disparity values
     */
    public native void setLeftRightCheck(@Cast("bool") boolean enable);

    /**
     * Computes disparity with sub-pixel interpolation (3 fractional bits by default).
     *
     * Suitable for long range. Currently incompatible with extended disparity
     */
    public native void setSubpixel(@Cast("bool") boolean enable);

    /**
     * Disparity range increased from 0-95 to 0-190, combined from full resolution and downscaled images.
     *
     * Suitable for short range objects. Currently incompatible with sub-pixel disparity
     */
    public native void setExtendedDisparity(@Cast("bool") boolean enable);

    /**
     * Fill color for missing data at frame edges
     * @param color Grayscale 0..255, or -1 to replicate pixels
     */
    public native void setRectifyEdgeFillColor(int color);

    /**
     * DEPRECATED function. It was removed, since rectified images are not flipped anymore.
     * Mirror rectified frames, only when LR-check mode is disabled. Default {@code true}.
     * The mirroring is required to have a normal non-mirrored disparity/depth output.
     *
     * A side effect of this option is disparity alignment to the perspective of left or right input:
     * {@code false}: mapped to left and mirrored, {@code true}: mapped to right.
     * With LR-check enabled, this option is ignored, none of the outputs are mirrored,
     * and disparity is mapped to right.
     *
     * @param enable True for normal disparity/depth, otherwise mirrored
     */
    public native @Deprecated void setRectifyMirrorFrame(@Cast("bool") boolean enable);

    /**
     * Enable outputting rectified frames. Optimizes computation on device side when disabled.
     * DEPRECATED. The outputs are auto-enabled if used
     */
    public native @Deprecated void setOutputRectified(@Cast("bool") boolean enable);

    /**
     * Enable outputting 'depth' stream (converted from disparity).
     * In certain configurations, this will disable 'disparity' stream.
     * DEPRECATED. The output is auto-enabled if used
     */
    public native @Deprecated void setOutputDepth(@Cast("bool") boolean enable);

    /**
     * Enable runtime stereo mode switch, e.g. from standard to LR-check.
     * Note: when enabled resources allocated for worst case to enable switching to any mode.
     */
    public native void setRuntimeModeSwitch(@Cast("bool") boolean enable);

    /**
     * Specify number of frames in pool.
     * @param numFramesPool How many frames should the pool have
     */
    public native void setNumFramesPool(int numFramesPool);

    /**
     * Useful for normalization of the disparity map.
     * @return Maximum disparity value that the node can return
     */
    public native @Deprecated float getMaxDisparity();

    /**
     * Specify allocated hardware resources for stereo depth.
     * Suitable only to increase post processing runtime.
     * @param numShaves Number of shaves.
     * @param numMemorySlices Number of memory slices.
     */
    public native void setPostProcessingHardwareResources(int numShaves, int numMemorySlices);

    /**
     * Sets a default preset based on specified option.
     * @param mode Stereo depth preset mode
     */
    public native void setDefaultProfilePreset(PresetMode mode);
    public native void setDefaultProfilePreset(@Cast("dai::node::StereoDepth::PresetMode") int mode);

    /**
     * Sets a default preset based on specified option.
     * @param mode Stereo depth preset mode
     */
    public native void setFocalLengthFromCalibration(@Cast("bool") boolean focalLengthFromCalibration);
}
