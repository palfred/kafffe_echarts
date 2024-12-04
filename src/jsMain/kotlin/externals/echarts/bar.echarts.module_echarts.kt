@file:JsModule("echarts")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package externals.echarts

import kotlin.js.*
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.svg.*
import tsstdlib.ArrayConstructor
import tsstdlib.ArrayLike
import tsstdlib.Parameters
import tsstdlib.ReturnType
import tsstdlib.Record
import tsstdlib.Partial

//external fun init(dom: HTMLElement? = definedExternally, opts: ZRenderInitOpt = definedExternally): ZRender

external interface GradientObject {
    var id: Number?
        get() = definedExternally
        set(value) = definedExternally
    var type: String
    var colorStops: Array<GradientColorStop>
    var global: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GradientColorStop {
    var offset: Number
    var color: String
}

external open class Gradient(colorStops: Array<GradientColorStop>) {
    open var id: Number
    open var type: String
    open var colorStops: Array<GradientColorStop>
    open var global: Boolean
    open fun addColorStop(offset: Number, color: String)
}

external interface RadialGradientObject : GradientObject {
    override var type: String /* "radial" */
    var x: Number
    var y: Number
    var r: Number
}

external open class RadialGradient(x: Number, y: Number, r: Number, colorStops: Array<GradientColorStop> = definedExternally, globalCoord: Boolean = definedExternally) : Gradient {
    override var type: String /* "radial" */
    open var x: Number
    open var y: Number
    open var r: Number
}

external interface LinearGradientObject : GradientObject {
    override var type: String /* "linear" */
    var x: Number
    var y: Number
    var x2: Number
    var y2: Number
}

external open class LinearGradient(x: Number, y: Number, x2: Number, y2: Number, colorStops: Array<GradientColorStop> = definedExternally, globalCoord: Boolean = definedExternally) : Gradient {
    override var type: String /* "linear" */
    open var x: Number
    open var y: Number
    open var x2: Number
    open var y2: Number
}

external interface Dictionary<T> {
    @nativeGetter
    operator fun get(key: String): T?
    @nativeSetter
    operator fun set(key: String, value: T)
}

external interface DictionaryPartial<T>

external interface `ArrayLike$1`<T> {
    @nativeGetter
    operator fun get(key: Number): T?
    @nativeSetter
    operator fun set(key: Number, value: T)
    var length: Number
}

external interface ZREventProperties {
    var zrX: Number
    var zrY: Number
    var zrDelta: Number
    var zrEventControl: String /* "no_globalout" | "only_globalout" */
    var zrByTouch: Boolean
}

external interface SVGVNode {
    var tag: String
    var attrs: SVGVNodeAttrs
    var children: Array<SVGVNode>?
        get() = definedExternally
        set(value) = definedExternally
    var text: String?
        get() = definedExternally
        set(value) = definedExternally
    var elm: Node?
        get() = definedExternally
        set(value) = definedExternally
    var key: String
}

external interface PatternObjectBase {
    var id: Number?
        get() = definedExternally
        set(value) = definedExternally
    var type: String? /* "pattern" */
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var scaleX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var scaleY: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ImagePatternObject : PatternObjectBase {
    var image: dynamic /* HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | String */
        get() = definedExternally
        set(value) = definedExternally
    var repeat: String? /* "repeat" | "repeat-x" | "repeat-y" | "no-repeat" */
        get() = definedExternally
        set(value) = definedExternally
    var imageWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var imageHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SVGPatternObject : PatternObjectBase {
    var svgElement: SVGVNode?
        get() = definedExternally
        set(value) = definedExternally
    var svgWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var svgHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external var nativeSlice: (start: Number, end: Number) -> Array<Any>

external fun guid(): Number

external fun logError(vararg args: Any)

external fun <T : Any> clone(source: T): T

external fun <T : Dictionary<Any>, S : Dictionary<Any>> merge(target: T, source: S, overwrite: Boolean = definedExternally): dynamic

external fun <T : Dictionary<Any>, S : Dictionary<Any>> merge(target: T, source: S): dynamic

external fun mergeAll(targetAndSources: Array<Any>, overwrite: Boolean = definedExternally): Any

external fun <T : Dictionary<Any>, S : Dictionary<Any>> extend(target: T, source: S): T /* T & S */

external fun <T : Dictionary<Any>, S : Dictionary<Any>> defaults(target: T, source: S, overlay: Boolean = definedExternally): T /* T & S */

external var createCanvas: () -> HTMLCanvasElement

external fun <T> indexOf(array: Array<T>, value: T): Number

external fun <T> indexOf(array: `ArrayLike$1`<T>, value: T): Number

external fun inherits(clazz: Function<*>, baseClazz: Function<*>)

external fun <T, S> mixin(target: T, source: S, override: Boolean = definedExternally)

external fun <T, S> mixin(target: T, source: S)

external fun <T, S> mixin(target: T, source: Function<*>, override: Boolean = definedExternally)

external fun <T, S> mixin(target: T, source: Function<*>)

external fun <T, S> mixin(target: Function<*>, source: S, override: Boolean = definedExternally)

external fun <T, S> mixin(target: Function<*>, source: S)

external fun <T, S> mixin(target: Function<*>, source: Function<*>, override: Boolean = definedExternally)

external fun <T, S> mixin(target: Function<*>, source: Function<*>)

external fun isArrayLike(data: Any): Boolean

external fun <I, Context> each(arr: I, cb: (self: Context, value: Any, index: Any, arr: I) -> Unit, context: Context = definedExternally)

external fun <T, R, Context> map(arr: Array<T>, cb: (self: Context, param_val: T, index: Number, arr: Array<T>) -> R, context: Context = definedExternally): Array<R>

external fun <T, S, Context> reduce(arr: Array<T>, cb: (self: Context, previousValue: S, currentValue: T, currentIndex: Number, arr: Array<T>) -> S, memo: S = definedExternally, context: Context = definedExternally): S

external fun <T, Context> filter(arr: Array<T>, cb: (self: Context, value: T, index: Number, arr: Array<T>) -> Boolean, context: Context = definedExternally): Array<T>

external fun <T, Context> find(arr: Array<T>, cb: (self: Context, value: T, index: Number, arr: Array<T>) -> Boolean, context: Context = definedExternally): T

external fun <T : Any?> keys(obj: T): Array<dynamic /* typealias KeyOfDistributive = dynamic */>


external interface FunctionBind {
    @nativeInvoke
    operator fun <F : BindFunc<Ctx>, Ctx> invoke(func: F, ctx: Ctx): Bind1<F, Ctx>
    @nativeInvoke
    operator fun <F : BindFunc<Ctx>, Ctx, T1 : Any> invoke(func: F, ctx: Ctx, a: T1): Bind2<F, Ctx, T1>
    @nativeInvoke
    operator fun <F : BindFunc<Ctx>, Ctx, T1 : Any, T2 : Any> invoke(func: F, ctx: Ctx, a: T1, b: T2): Bind3<F, Ctx, T1, T2>
    @nativeInvoke
    operator fun <F : BindFunc<Ctx>, Ctx, T1 : Any, T2 : Any, T3 : Any> invoke(func: F, ctx: Ctx, a: T1, b: T2, c: T3): Bind4<F, Ctx, T1, T2, T3>
    @nativeInvoke
    operator fun <F : BindFunc<Ctx>, Ctx, T1 : Any, T2 : Any, T3 : Any, T4 : Any> invoke(func: F, ctx: Ctx, a: T1, b: T2, c: T3, d: T4): Bind5<F, Ctx, T1, T2, T3, T4>
}

external var bind: FunctionBind

external fun <F : CurryFunc, T1 : Any> curry(func: F, a: T1): Curry1<F, T1>

external fun <F : CurryFunc, T1 : Any, T2 : Any> curry(func: F, a: T1, b: T2): Curry2<F, T1, T2>

external fun <F : CurryFunc, T1 : Any, T2 : Any, T3 : Any> curry(func: F, a: T1, b: T2, c: T3): Curry3<F, T1, T2, T3>

external fun <F : CurryFunc, T1 : Any, T2 : Any, T3 : Any, T4 : Any> curry(func: F, a: T1, b: T2, c: T3, d: T4): Curry4<F, T1, T2, T3, T4>

external fun isArray(value: Any): Boolean

external fun isFunction(value: Any): Boolean

external fun isString(value: Any): Boolean

external fun isStringSafe(value: Any): Boolean

external fun isNumber(value: Any): Boolean

external fun <T> isObject(value: T): Boolean

external fun isBuiltInObject(value: Any): Boolean

external fun isTypedArray(value: Any): Boolean

external fun isDom(value: Any): Boolean

external fun isGradientObject(value: Any): Boolean

external fun isImagePatternObject(value: Any): Boolean

external fun isRegExp(value: Any): Boolean

external fun eqNaN(value: Any): Boolean

external fun <T> retrieve(vararg args: T): T

external fun <T, R> retrieve2(value0: T, value1: R): dynamic /* T | R */

external fun <T, R, W> retrieve3(value0: T, value1: R, value2: W): dynamic /* T | R | W */

external fun <T> slice(arr: `ArrayLike$1`<T>, vararg args: SliceParams): Array<T>

external fun normalizeCssArray(param_val: Number): Array<Number>

external fun normalizeCssArray(param_val: Array<Number>): Array<Number>

external fun assert(condition: Any, message: String = definedExternally)

external fun trim(str: String): String

external fun setAsPrimitive(obj: Any)

external fun isPrimitive(obj: Any): Boolean

external interface MapInterface<T, KEY> {
    fun delete(key: KEY): Boolean
    fun has(key: KEY): Boolean
    fun get(key: KEY): T?
    fun set(key: KEY, value: T): MapInterface<T, KEY> /* this */
    fun keys(): Array<KEY>
    fun forEach(callback: (value: T, key: KEY) -> Unit)
}

external open class HashMap<T, KEY> {
    open var data: MapInterface<T, KEY>
    constructor(obj: HashMap<T, KEY> = definedExternally)
    constructor()
    constructor(obj: Any = definedExternally)
    constructor(obj: Array<KEY> = definedExternally)
    open fun hasKey(key: KEY): Boolean
    open fun get(key: KEY): T
    open fun set(key: KEY, value: T): T
    open fun <Context> each(cb: (self: Context, value: T, key: KEY) -> Unit, context: Context = definedExternally)
    open fun keys(): Array<KEY>
    open fun removeKey(key: KEY)
}

external open class HashMap__1<T> : HashMap<T, dynamic /* String | Number */>

external fun <T, KEY> createHashMap(obj: HashMap<T, KEY> = definedExternally): HashMap<T, KEY>

external fun <T, KEY> createHashMap(): HashMap<T, KEY>

external fun <T, KEY> createHashMap(obj: Any = definedExternally): HashMap<T, KEY>

external fun <T, KEY> createHashMap(obj: Array<KEY> = definedExternally): HashMap<T, KEY>

external fun <T, R> concatArray(a: `ArrayLike$1`<T>, b: `ArrayLike$1`<R>): `ArrayLike$1`<dynamic /* T | R */>

external fun <T> createObject(proto: Any? = definedExternally, properties: T = definedExternally): T

external fun disableUserSelect(dom: HTMLElement)

external fun hasOwn(own: Any?, prop: String): Boolean

external fun noop()

external var RADIAN_TO_DEGREE: Number

external var util_d_curry: Any

external var util_d_guid: Any

external var util_d_logError: Any

external var util_d_clone: Any

external var util_d_merge: Any

external var util_d_mergeAll: Any

external var util_d_extend: Any

external var util_d_defaults: Any

external var util_d_createCanvas: Any

external var util_d_indexOf: Any

external var util_d_inherits: Any

external var util_d_mixin: Any

external var util_d_isArrayLike: Any

external var util_d_each: Any

external var util_d_map: Any

external var util_d_reduce: Any

external var util_d_filter: Any

external var util_d_find: Any

external var util_d_keys: Any

external var util_d_bind: Any

external var util_d_isArray: Any

external var util_d_isFunction: Any

external var util_d_isString: Any

external var util_d_isStringSafe: Any

external var util_d_isNumber: Any

external var util_d_isObject: Any

external var util_d_isBuiltInObject: Any

external var util_d_isTypedArray: Any

external var util_d_isDom: Any

external var util_d_isGradientObject: Any

external var util_d_isImagePatternObject: Any

external var util_d_isRegExp: Any

external var util_d_eqNaN: Any

external var util_d_retrieve: Any

external var util_d_retrieve2: Any

external var util_d_retrieve3: Any

external var util_d_slice: Any

external var util_d_normalizeCssArray: Any

external var util_d_assert: Any

external var util_d_trim: Any

external var util_d_setAsPrimitive: Any

external var util_d_isPrimitive: Any

// external var util_d_HashMap: Any

external var util_d_createHashMap: Any

external var util_d_concatArray: Any

external var util_d_createObject: Any

external var util_d_disableUserSelect: Any

external var util_d_hasOwn: Any

external var util_d_noop: Any

external var util_d_RADIAN_TO_DEGREE: Any

external interface EventProcessor<EvtDef> {
    var normalizeQuery: ((query: dynamic /* String | Object */) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var filter: ((eventType: Any, query: dynamic /* String | Object */) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
    var afterTrigger: ((eventType: Any) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Eventful<EvtDef /* : DefaultEventDefinition*/>(eventProcessors: EventProcessor<EvtDef> = definedExternally) {
    open var `_$handlers`: Any
    open var `_$eventProcessor`: EventProcessor<EvtDef>
    open fun <Ctx, EvtNm : Any> on(event: EvtNm, handler: WithThisType<Any, CbThis<Ctx, Eventful<EvtDef> /* this */>>, context: Ctx = definedExternally): Eventful<EvtDef> /* this */
    open fun <Ctx, EvtNm : Any> on(event: EvtNm, handler: WithThisType<Any, CbThis<Ctx, Eventful<EvtDef> /* this */>>): Eventful<EvtDef> /* this */
    open fun <Ctx, EvtNm : Any> on(event: EvtNm, query: String, handler: WithThisType<Any, CbThis<Ctx, Eventful<EvtDef> /* this */>>, context: Ctx = definedExternally): Eventful<EvtDef> /* this */
    open fun <Ctx, EvtNm : Any> on(event: EvtNm, query: String, handler: WithThisType<Any, CbThis<Ctx, Eventful<EvtDef> /* this */>>): Eventful<EvtDef> /* this */
    open fun <Ctx, EvtNm : Any> on(event: EvtNm, query: Any, handler: WithThisType<Any, CbThis<Ctx, Eventful<EvtDef> /* this */>>, context: Ctx = definedExternally): Eventful<EvtDef> /* this */
    open fun <Ctx, EvtNm : Any> on(event: EvtNm, query: Any, handler: WithThisType<Any, CbThis<Ctx, Eventful<EvtDef> /* this */>>): Eventful<EvtDef> /* this */
    open fun isSilent(eventName: Any): Boolean
    open fun off(eventType: Any = definedExternally, handler: Function<*> = definedExternally): Eventful<EvtDef> /* this */
    open fun <EvtNm : Any> trigger(eventType: EvtNm, vararg args: Parameters<Any>): Eventful<EvtDef> /* this */
    open fun triggerWithContext(type: Any, vararg args: Any): Eventful<EvtDef> /* this */
}

external open class Eventful__0 : Eventful<DefaultEventDefinition>

external fun create(x: Number = definedExternally, y: Number = definedExternally): VectorArray

external fun <T : VectorArray> copy(out: T, v: VectorArray): T

external fun `clone$1`(v: VectorArray): VectorArray

external fun <T : VectorArray> set(out: T, a: Number, b: Number): T

external fun <T : VectorArray> add(out: T, v1: VectorArray, v2: VectorArray): T

external fun <T : VectorArray> scaleAndAdd(out: T, v1: VectorArray, v2: VectorArray, a: Number): T

external fun <T : VectorArray> sub(out: T, v1: VectorArray, v2: VectorArray): T

external fun len(v: VectorArray): Number

external var length: Any

external fun lenSquare(v: VectorArray): Number

external var lengthSquare: Any

external fun <T : VectorArray> mul(out: T, v1: VectorArray, v2: VectorArray): T

external fun <T : VectorArray> div(out: T, v1: VectorArray, v2: VectorArray): T

external fun dot(v1: VectorArray, v2: VectorArray): Number

external fun <T : VectorArray> scale(out: T, v: VectorArray, s: Number): T

external fun <T : VectorArray> normalize(out: T, v: VectorArray): T

external fun distance(v1: VectorArray, v2: VectorArray): Number

external var dist: Any

external fun distanceSquare(v1: VectorArray, v2: VectorArray): Number

external var distSquare: Any

external fun <T : VectorArray> negate(out: T, v: VectorArray): T

external fun <T : VectorArray> lerp(out: T, v1: VectorArray, v2: VectorArray, t: Number): T

external fun <T : VectorArray> applyTransform(out: T, v: VectorArray, m: MatrixArray): T

external fun <T : VectorArray> min(out: T, v1: VectorArray, v2: VectorArray): T

external fun <T : VectorArray> max(out: T, v1: VectorArray, v2: VectorArray): T

external var vector_d_create: Any

external var vector_d_copy: Any

external var vector_d_set: Any

external var vector_d_add: Any

external var vector_d_scaleAndAdd: Any

external var vector_d_sub: Any

external var vector_d_len: Any

external var vector_d_length: Any

external var vector_d_lenSquare: Any

external var vector_d_lengthSquare: Any

external var vector_d_mul: Any

external var vector_d_div: Any

external var vector_d_dot: Any

external var vector_d_scale: Any

external var vector_d_normalize: Any

external var vector_d_distance: Any

external var vector_d_dist: Any

external var vector_d_distanceSquare: Any

external var vector_d_distSquare: Any

external var vector_d_negate: Any

external var vector_d_lerp: Any

external var vector_d_applyTransform: Any

external var vector_d_min: Any

external var vector_d_max: Any

external fun `create$1`(): MatrixArray

external fun identity(out: MatrixArray): MatrixArray

external fun `copy$1`(out: MatrixArray, m: MatrixArray): MatrixArray

external fun `mul$1`(out: MatrixArray, m1: MatrixArray, m2: MatrixArray): MatrixArray

external fun translate(out: MatrixArray, a: MatrixArray, v: VectorArray): MatrixArray

external fun rotate(out: MatrixArray, a: MatrixArray, rad: Number, pivot: VectorArray = definedExternally): MatrixArray

external fun `scale$1`(out: MatrixArray, a: MatrixArray, v: VectorArray): MatrixArray

external fun invert(out: MatrixArray, a: MatrixArray): MatrixArray?

external fun `clone$2`(a: MatrixArray): MatrixArray

external var matrix_d_identity: Any

external var matrix_d_translate: Any

external var matrix_d_rotate: Any

external var matrix_d_invert: Any

external interface PointLike {
    var x: Number
    var y: Number
}

external open class Point(x: Number = definedExternally, y: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open fun copy(other: PointLike): Point /* this */
    open fun clone(): Point
    open fun set(x: Number, y: Number): Point /* this */
    open fun equal(other: PointLike): Boolean
    open fun add(other: PointLike): Point /* this */
    open fun scale(scalar: Number)
    open fun scaleAndAdd(other: PointLike, scalar: Number)
    open fun sub(other: PointLike): Point /* this */
    open fun dot(other: PointLike): Number
    open fun len(): Number
    open fun lenSquare(): Number
    open fun normalize(): Point /* this */
    open fun distance(other: PointLike): Number
    open fun distanceSquare(other: Point): Number
    open fun negate(): Point /* this */
    open fun transform(m: MatrixArray): Point /* this */
    open fun toArray(out: Array<Number>): Array<Number>
    open fun fromArray(input: Array<Number>)

    companion object {
        fun set(p: PointLike, x: Number, y: Number)
        fun copy(p: PointLike, p2: PointLike)
        fun len(p: PointLike): Number
        fun lenSquare(p: PointLike): Number
        fun dot(p0: PointLike, p1: PointLike): Number
        fun add(out: PointLike, p0: PointLike, p1: PointLike)
        fun sub(out: PointLike, p0: PointLike, p1: PointLike)
        fun scale(out: PointLike, p0: PointLike, scalar: Number)
        fun scaleAndAdd(out: PointLike, p0: PointLike, p1: PointLike, scalar: Number)
        fun lerp(out: PointLike, p0: PointLike, p1: PointLike, t: Number)
    }
}

external open class BoundingRect(x: Number, y: Number, width: Number, height: Number) {
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open fun union(other: BoundingRect)
    open fun applyTransform(m: MatrixArray)
    open fun calculateTransform(b: RectLike): MatrixArray
    open fun intersect(b: RectLike, mtv: PointLike = definedExternally): Boolean
    open fun contain(x: Number, y: Number): Boolean
    open fun clone(): BoundingRect
    open fun copy(other: RectLike)
    open fun plain(): RectLike
    open fun isFinite(): Boolean
    open fun isZero(): Boolean

    companion object {
        fun create(rect: RectLike): BoundingRect
        fun copy(target: RectLike, source: RectLike)
        fun applyTransform(target: RectLike, source: RectLike, m: MatrixArray)
    }
}

external interface RectLike {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}

external interface ExtendedCanvasRenderingContext2D : CanvasRenderingContext2D {
    var dpr: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$0` {
    var M: Number
    var L: Number
    var C: Number
    var Q: Number
    var A: Number
    var Z: Number
    var R: Number
}

external open class PathProxy(notSaveData: Boolean = definedExternally) {
    open var dpr: Number
    open var data: dynamic /* Array<Number> | Float32Array */
    open var _version: Any
    open var _saveData: Any
    open var _pendingPtX: Any
    open var _pendingPtY: Any
    open var _pendingPtDist: Any
    open var _ctx: Any
    open var _xi: Any
    open var _yi: Any
    open var _x0: Any
    open var _y0: Any
    open var _len: Any
    open var _pathSegLen: Any
    open var _pathLen: Any
    open var _ux: Any
    open var _uy: Any
    open fun increaseVersion()
    open fun getVersion(): Number
    open fun setScale(sx: Number, sy: Number, segmentIgnoreThreshold: Number = definedExternally)
    open fun setDPR(dpr: Number)
    open fun setContext(ctx: ExtendedCanvasRenderingContext2D)
    open fun getContext(): ExtendedCanvasRenderingContext2D
    open fun beginPath(): PathProxy /* this */
    open fun reset()
    open fun moveTo(x: Number, y: Number): PathProxy /* this */
    open fun lineTo(x: Number, y: Number): PathProxy /* this */
    open fun bezierCurveTo(x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number): PathProxy /* this */
    open fun quadraticCurveTo(x1: Number, y1: Number, x2: Number, y2: Number): PathProxy /* this */
    open fun arc(cx: Number, cy: Number, r: Number, startAngle: Number, endAngle: Number, anticlockwise: Boolean = definedExternally): PathProxy /* this */
    open fun arcTo(x1: Number, y1: Number, x2: Number, y2: Number, radius: Number): PathProxy /* this */
    open fun rect(x: Number, y: Number, w: Number, h: Number): PathProxy /* this */
    open fun closePath(): PathProxy /* this */
    open fun fill(ctx: CanvasRenderingContext2D)
    open fun stroke(ctx: CanvasRenderingContext2D)
    open fun len(): Number
    open fun setData(data: Float32Array)
    open fun setData(data: Array<Number>)
    open fun appendPath(path: PathProxy)
    open fun appendPath(path: Array<PathProxy>)
    open fun addData(cmd: Number, a: Number = definedExternally, b: Number = definedExternally, c: Number = definedExternally, d: Number = definedExternally, e: Number = definedExternally, f: Number = definedExternally, g: Number = definedExternally, h: Number = definedExternally)
    open var _drawPendingPt: Any
    open var _expandData: Any
    open fun toStatic()
    open fun getBoundingRect(): BoundingRect
    open var _calculateLength: Any
    open fun rebuildPath(ctx: PathRebuilder, percent: Number)
    open fun clone(): PathProxy

    companion object {
        var CMD: `T$0`
        var initDefaultProps: Any
    }
}

external interface PathRebuilder {
    fun moveTo(x: Number, y: Number)
    fun lineTo(x: Number, y: Number)
    fun bezierCurveTo(x: Number, y: Number, x2: Number, y2: Number, x3: Number, y3: Number)
    fun quadraticCurveTo(x: Number, y: Number, x2: Number, y2: Number)
    fun arc(cx: Number, cy: Number, r: Number, startAngle: Number, endAngle: Number, anticlockwise: Boolean)
    fun ellipse(cx: Number, cy: Number, radiusX: Number, radiusY: Number, rotation: Number, startAngle: Number, endAngle: Number, anticlockwise: Boolean)
    fun rect(x: Number, y: Number, width: Number, height: Number)
    fun closePath()
}

external object easingFuncs {
    fun linear(k: Number): Number
    fun quadraticIn(k: Number): Number
    fun quadraticOut(k: Number): Number
    fun quadraticInOut(k: Number): Number
    fun cubicIn(k: Number): Number
    fun cubicOut(k: Number): Number
    fun cubicInOut(k: Number): Number
    fun quarticIn(k: Number): Number
    fun quarticOut(k: Number): Number
    fun quarticInOut(k: Number): Number
    fun quinticIn(k: Number): Number
    fun quinticOut(k: Number): Number
    fun quinticInOut(k: Number): Number
    fun sinusoidalIn(k: Number): Number
    fun sinusoidalOut(k: Number): Number
    fun sinusoidalInOut(k: Number): Number
    fun exponentialIn(k: Number): Number
    fun exponentialOut(k: Number): Number
    fun exponentialInOut(k: Number): Number
    fun circularIn(k: Number): Number
    fun circularOut(k: Number): Number
    fun circularInOut(k: Number): Number
    fun elasticIn(k: Number): Number
    fun elasticOut(k: Number): Number
    fun elasticInOut(k: Number): Number
    fun backIn(k: Number): Number
    fun backOut(k: Number): Number
    fun backInOut(k: Number): Number
    fun bounceIn(k: Number): Number
    fun bounceOut(k: Number): Number
    fun bounceInOut(k: Number): Number
}

external interface Stage {
    var update: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AnimationOption {
    var stage: Stage?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$1` {
    var loop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Animation(opts: AnimationOption = definedExternally) : Eventful__0 {
    open var stage: Stage
    open var _head: Any
    open var _tail: Any
    open var _running: Any
    open var _time: Any
    open var _pausedTime: Any
    open var _pauseStart: Any
    open var _paused: Any
    open fun addClip(clip: Clip)
    open fun addAnimator(animator: Animator<Any>)
    open fun removeClip(clip: Clip)
    open fun removeAnimator(animator: Animator<Any>)
    open fun update(notTriggerFrameAndStageUpdate: Boolean = definedExternally)
    open fun _startLoop()
    open fun start()
    open fun stop()
    open fun pause()
    open fun resume()
    open fun clear()
    open fun isFinished(): Boolean
    open fun <T> animate(target: T, options: `T$1`): Animator<T>
}

external interface ClipProps {
    var life: Number?
        get() = definedExternally
        set(value) = definedExternally
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var loop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var easing: dynamic /* Any | easingFunc? */
        get() = definedExternally
        set(value) = definedExternally
    var onframe: OnframeCallback?
        get() = definedExternally
        set(value) = definedExternally
    var ondestroy: ondestroyCallback?
        get() = definedExternally
        set(value) = definedExternally
    var onrestart: onrestartCallback?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Clip(opts: ClipProps) {
    open var _life: Any
    open var _delay: Any
    open var _inited: Any
    open var _startTime: Any
    open var _pausedTime: Any
    open var _paused: Any
    open var animation: Animation
    open var loop: Boolean
    open var easing: dynamic /* Any | easingFunc */
    open var easingFunc: (p: Number) -> Number
    open var next: Clip
    open var prev: Clip
    open var onframe: OnframeCallback
    open var ondestroy: ondestroyCallback
    open var onrestart: onrestartCallback
    open fun step(globalTime: Number, deltaTime: Number): Boolean
    open fun pause()
    open fun resume()
    open fun setEasing(easing: Any)
    open fun setEasing(easing: easingFunc)
}

external interface Keyframe {
    var time: Number
    var value: Any
    var percent: Number
    var rawValue: Any
    var easing: dynamic /* Any | easingFunc? */
        get() = definedExternally
        set(value) = definedExternally
    var easingFunc: ((percent: Number) -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var additiveValue: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Track(propName: String) {
    open var keyframes: Array<Keyframe>
    open var propName: String
    open var valType: Number /* 0 | 1 | 2 | 3 | 4 | 5 | 6 */
    open var discrete: Boolean
    open var _invalid: Boolean
    open var _finished: Any
    open var _needsSort: Any
    open var _additiveTrack: Any
    open var _additiveValue: Any
    open var _lastFr: Any
    open var _lastFrP: Any
    open fun isFinished(): Boolean
    open fun setFinished()
    open fun needsAnimate(): Boolean
    open fun getAdditiveTrack(): Track
    open fun addKeyframe(time: Number, rawValue: Any, easing: Any = definedExternally): Keyframe
    open fun addKeyframe(time: Number, rawValue: Any): Keyframe
    open fun addKeyframe(time: Number, rawValue: Any, easing: easingFunc = definedExternally): Keyframe
    open fun prepare(maxTime: Number, additiveTrack: Track = definedExternally)
    open fun step(target: Any, percent: Number)
    open var _addToTarget: Any
}

external open class Animator<T>(target: T, loop: Boolean, allowDiscreteAnimation: Boolean = definedExternally, additiveTo: Array<Animator<Any>> = definedExternally) {
    open var animation: Animation
    open var targetName: String
    open var scope: String
    open var __fromStateTransition: String
    open var _tracks: Any
    open var _trackKeys: Any
    open var _target: Any
    open var _loop: Any
    open var _delay: Any
    open var _maxTime: Any
    open var _force: Any
    open var _paused: Any
    open var _started: Any
    open var _allowDiscrete: Any
    open var _additiveAnimators: Any
    open var _doneCbs: Any
    open var _onframeCbs: Any
    open var _abortedCbs: Any
    open var _clip: Any
    open fun getMaxTime(): Number
    open fun getDelay(): Number
    open fun getLoop(): Boolean
    open fun getTarget(): T
    open fun changeTarget(target: T)
    open fun `when`(time: Number, props: Dictionary<Any>, easing: Any = definedExternally): Animator<T> /* this */
    open fun `when`(time: Number, props: Dictionary<Any>): Animator<T> /* this */
    open fun `when`(time: Number, props: Dictionary<Any>, easing: easingFunc = definedExternally): Animator<T> /* this */
    open fun whenWithKeys(time: Number, props: Dictionary<Any>, propNames: Array<String>, easing: Any = definedExternally): Animator<T> /* this */
    open fun whenWithKeys(time: Number, props: Dictionary<Any>, propNames: Array<String>): Animator<T> /* this */
    open fun whenWithKeys(time: Number, props: Dictionary<Any>, propNames: Array<String>, easing: easingFunc = definedExternally): Animator<T> /* this */
    open fun pause()
    open fun resume()
    open fun isPaused(): Boolean
    open fun duration(duration: Number): Animator<T> /* this */
    open var _doneCallback: Any
    open var _abortedCallback: Any
    open var _setTracksFinished: Any
    open var _getAdditiveTrack: Any
    open fun start(easing: Any = definedExternally): Animator<T> /* this */
    open fun start(): Animator<T> /* this */
    open fun start(easing: easingFunc = definedExternally): Animator<T> /* this */
    open fun stop(forwardToLast: Boolean = definedExternally)
    open fun delay(time: Number): Animator<T> /* this */
    open fun during(cb: `OnframeCallback$1`<T>): Animator<T> /* this */
    open fun done(cb: DoneCallback): Animator<T> /* this */
    open fun aborted(cb: AbortCallback): Animator<T> /* this */
    open fun getClip(): Clip
    open fun getTrack(propName: String): Track
    open fun getTracks(): Array<Track>
    open fun stopTracks(propNames: Array<String>, forwardToLast: Boolean = definedExternally): Boolean
    open fun saveTo(target: T, trackKeys: Array<String> = definedExternally, firstOrLast: Boolean = definedExternally)
    open fun __changeFinalValue(finalProps: Dictionary<Any>, trackKeys: Array<String> = definedExternally)
}

external interface PathStyleProps : CommonStyleProps {
    var fill: dynamic /* String? | ImagePatternObject? | SVGPatternObject? | LinearGradientObject? | RadialGradientObject? */
        get() = definedExternally
        set(value) = definedExternally
    var stroke: dynamic /* String? | ImagePatternObject? | SVGPatternObject? | LinearGradientObject? | RadialGradientObject? */
        get() = definedExternally
        set(value) = definedExternally
    var decal: dynamic /* ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var strokePercent: Number?
        get() = definedExternally
        set(value) = definedExternally
    var strokeNoScale: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fillOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var strokeOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineDash: dynamic /* Boolean? | Array<Number>? | "solid" | "dashed" | "dotted" */
        get() = definedExternally
        set(value) = definedExternally
    var lineDashOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineCap: String? /* "butt" | "round" | "square" */
        get() = definedExternally
        set(value) = definedExternally
    var lineJoin: String? /* "bevel" | "miter" | "round" */
        get() = definedExternally
        set(value) = definedExternally
    var miterLimit: Number?
        get() = definedExternally
        set(value) = definedExternally
    var strokeFirst: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PathProps : DisplayableProps {
    var strokeContainThreshold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var segmentIgnoreThreshold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var subPixelOptimize: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var shape: Dictionary<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var autoBatch: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var __value: dynamic /* Array<dynamic /* String | Number */>? | String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var buildPath: ((ctx: dynamic /* PathProxy | CanvasRenderingContext2D */, shapeCfg: Dictionary<Any>, inBatch: Boolean) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$2`<Shape> {
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var shape: Shape?
        get() = definedExternally
        set(value) = definedExternally
    var style: PathStyleProps?
        get() = definedExternally
        set(value) = definedExternally
    var beforeBrush: Any?
        get() = definedExternally
        set(value) = definedExternally
    var afterBrush: Any?
        get() = definedExternally
        set(value) = definedExternally
    var getBoundingRect: Any?
        get() = definedExternally
        set(value) = definedExternally
    var calculateTextPosition: Any?
        get() = definedExternally
        set(value) = definedExternally
    fun buildPath(ctx: CanvasRenderingContext2D, shape: Shape, inBatch: Boolean = definedExternally)
    fun buildPath(ctx: CanvasRenderingContext2D, shape: Shape)
    fun buildPath(ctx: PathProxy, shape: Shape, inBatch: Boolean = definedExternally)
    fun buildPath(ctx: PathProxy, shape: Shape)
    val init: ((opts: PathProps) -> Unit)?
}

external open class Path<Props : PathProps>(opts: Props = definedExternally) : Displayable<Props> {
    override fun animate(key: String /* "" | "style" | "shape" */, loop: Boolean): dynamic /* Animator */
    override fun animate(): Animator<Path<Props> /* this */>
    override fun animate(key: String /* "" | "style" | "shape" */): dynamic /* Animator */
    override fun getState(stateName: String): dynamic /* typealias Pick = dynamic */
    override fun ensureState(stateName: String): dynamic /* typealias Pick = dynamic */
    override var states: Dictionary<dynamic /* typealias Pick = dynamic */>
    override var stateProxy: (stateName: String, targetStates: Array<String>) -> dynamic
    open var path: PathProxy
    open var strokeContainThreshold: Number
    open var segmentIgnoreThreshold: Number
    open var subPixelOptimize: Boolean
    open var autoBatch: Boolean
    open var _rectStroke: Any
    override var _normalState: dynamic /* typealias Pick = dynamic */
    open var _decalEl: Path__0
    open var shape: Dictionary<Any>
    override fun update()
    open fun getDecalElement(): Path<PathProps>
    override fun _init(props: Props)
    open fun getDefaultStyle(): Any
    open fun getDefaultShape(): Any
    override fun canBeInsideText(): Boolean
    override fun getInsideTextFill(): String /* "#333" | "#ccc" | "#eee" */
    override fun getInsideTextStroke(textFill: String): String
    open fun buildPath(ctx: PathProxy, shapeCfg: Dictionary<Any>, inBatch: Boolean = definedExternally)
    open fun buildPath(ctx: PathProxy, shapeCfg: Dictionary<Any>)
    open fun buildPath(ctx: CanvasRenderingContext2D, shapeCfg: Dictionary<Any>, inBatch: Boolean = definedExternally)
    open fun buildPath(ctx: CanvasRenderingContext2D, shapeCfg: Dictionary<Any>)
    open fun pathUpdated()
    open fun getUpdatedPathProxy(inBatch: Boolean = definedExternally): PathProxy
    open fun createPathProxy()
    open fun hasStroke(): Boolean
    open fun hasFill(): Boolean
    override fun getBoundingRect(): BoundingRect
    override fun contain(x: Number, y: Number): Boolean
    open fun dirtyShape()
    override fun dirty()
    open fun animateShape(loop: Boolean): Animator<Any>
    override fun updateDuringAnimation(targetKey: String)
    override fun attrKV(key: String /* "strokeContainThreshold" | "segmentIgnoreThreshold" | "subPixelOptimize" | "style" | "shape" | "autoBatch" | "__value" | "buildPath" */, value: PathPropertyType)
    open fun setShape(obj: Any): Path<Props> /* this */
    open fun <T : Any> setShape(obj: T, value: Any): Path<Props> /* this */
    open fun shapeChanged(): Boolean
    override fun createStyle(obj: Any): Any
    override fun _innerSaveToNormal(toState: dynamic /* typealias Pick = dynamic */)
    override fun _applyStateObj(stateName: String, state: dynamic /* typealias Pick = dynamic */, normalState: dynamic /* typealias Pick = dynamic */, keepCurrentStates: Boolean, transition: Boolean, animationCfg: ElementAnimateConfig)
    override fun _mergeStates(states: Array<dynamic /* typealias Pick = dynamic */>): dynamic /* typealias Pick = dynamic */
    override fun getAnimationStyleProps(): MapToType<PathProps, Boolean>
    open fun isZeroArea(): Boolean

    companion object {
        fun <Shape : Dictionary<Any>> extend(defaultProps: `T$2`<Shape>): Any
        var initDefaultProps: Unit
    }
}

external open class Path__0 : Path<PathProps>

external open class Transformable {
    open var parent: Transformable
    open var x: Number
    open var y: Number
    open var scaleX: Number
    open var scaleY: Number
    open var skewX: Number
    open var skewY: Number
    open var rotation: Number
    open var anchorX: Number
    open var anchorY: Number
    open var originX: Number
    open var originY: Number
    open var globalScaleRatio: Number
    open var transform: MatrixArray
    open var invTransform: MatrixArray
    open fun getLocalTransform(m: MatrixArray = definedExternally): MatrixArray
    open fun setPosition(arr: Array<Number>)
    open fun setScale(arr: Array<Number>)
    open fun setSkew(arr: Array<Number>)
    open fun setOrigin(arr: Array<Number>)
    open fun needLocalTransform(): Boolean
    open fun updateTransform()
    open var _resolveGlobalScaleRatio: Any
    open fun getComputedTransform(): MatrixArray
    open fun setLocalTransform(m: VectorArray)
    open fun decomposeTransform()
    open fun getGlobalScale(out: VectorArray = definedExternally): VectorArray
    open fun transformCoordToLocal(x: Number, y: Number): Array<Number>
    open fun transformCoordToGlobal(x: Number, y: Number): Array<Number>
    open fun getLineScale(): Number
    open fun copyTransform(source: Transformable)

    companion object {
        fun getLocalTransform(target: Transformable, m: MatrixArray = definedExternally): MatrixArray
        var initDefaultProps: Any
    }
}

external var TRANSFORMABLE_PROPS: dynamic /* JsTuple<String, String, String, String, String, String, String, String, String, String, String> */

external interface TSpanStyleProps : PathStyleProps {
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var text: String?
        get() = definedExternally
        set(value) = definedExternally
    var font: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fontWeight: dynamic /* "normal" | "bold" | "bolder" | "lighter" | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var fontStyle: String? /* "normal" | "italic" | "oblique" */
        get() = definedExternally
        set(value) = definedExternally
    var fontFamily: String?
        get() = definedExternally
        set(value) = definedExternally
    var textAlign: String? /* "center" | "end" | "left" | "right" | "start" */
        get() = definedExternally
        set(value) = definedExternally
    var textBaseline: String? /* "alphabetic" | "bottom" | "hanging" | "ideographic" | "middle" | "top" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface TSpanProps : DisplayableProps

external open class TSpan : Displayable<TSpanProps> {
    open fun hasStroke(): Boolean
    open fun hasFill(): Boolean
    open fun createStyle(obj: TSpanStyleProps = definedExternally): TSpanStyleProps
    override fun createStyle(obj: Any): Any
    open fun setBoundingRect(rect: BoundingRect)
    override fun getBoundingRect(): BoundingRect

    companion object {
        var initDefaultProps: Unit
    }
}

external interface ImageStyleProps : CommonStyleProps {
    var image: dynamic /* String? | HTMLImageElement? | HTMLCanvasElement? | HTMLVideoElement? */
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var sHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ImageProps : DisplayableProps {
    var onload: ((image: dynamic /* HTMLImageElement | HTMLCanvasElement | HTMLVideoElement */) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external open class ZRImage : Displayable<ImageProps> {
    open var __image: dynamic /* HTMLImageElement | HTMLCanvasElement | HTMLVideoElement */
    open var __imageSrc: String
    open var onload: (image: dynamic /* HTMLImageElement | HTMLCanvasElement | HTMLVideoElement */) -> Unit
    open fun createStyle(obj: ImageStyleProps = definedExternally): ImageStyleProps
    override fun createStyle(obj: Any): Any
    open var _getSize: Any
    open fun getWidth(): Number
    open fun getHeight(): Number
    override fun getAnimationStyleProps(): MapToType<ImageProps, Boolean>
    override fun getBoundingRect(): BoundingRect
}

external open class RectShape {
    open var r: dynamic /* Number | Array<Number> */
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
}

external interface RectShapePartial {
    var r: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RectProps : PathProps

external open class Rect(opts: RectProps = definedExternally) : Path<RectProps> {
    override fun getDefaultShape(): RectShape
    open fun buildPath(ctx: CanvasRenderingContext2D, shape: RectShape)
    override fun isZeroArea(): Boolean
}

external interface GroupProps : ElementProps

external open class Group(opts: GroupProps = definedExternally) : Element<GroupProps> {
    open var _children: Any
    open fun childrenRef(): Array<Element<ElementProps>>
    open fun children(): Array<Element<ElementProps>>
    open fun childAt(idx: Number): Element__0
    open fun childOfName(name: String): Element__0
    open fun childCount(): Number
    open fun add(child: Element__0): Group
    open fun addBefore(child: Element__0, nextSibling: Element__0): Group /* this */
    open fun replace(oldChild: Element__0, newChild: Element__0): Group /* this */
    open fun replaceAt(child: Element__0, index: Number): Group /* this */
    open fun _doAdd(child: Element__0)
    open fun remove(child: Element__0): Group /* this */
    open fun removeAll(): Group /* this */
    open fun <Context> eachChild(cb: (self: Context, el: Element__0, index: Number) -> Unit, context: Context = definedExternally): Group /* this */
    open fun <T> traverse(cb: (self: T, el: Element__0) -> Any, context: T = definedExternally): Group /* this */
    override fun addSelfToZr(zr: ZRenderType)
    override fun removeSelfFromZr(zr: ZRenderType)
    open fun getBoundingRect(includeChildren: Array<Element__0> = definedExternally): BoundingRect
}

external interface GroupLike : Element__0 {
    fun childrenRef(): Array<Element__0>
}

external interface TextStylePropsPart {
    var text: String?
        get() = definedExternally
        set(value) = definedExternally
    var fill: String?
        get() = definedExternally
        set(value) = definedExternally
    var stroke: String?
        get() = definedExternally
        set(value) = definedExternally
    var strokeNoScale: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var opacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fillOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var strokeOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineDash: dynamic /* Boolean? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var lineDashOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var borderDash: dynamic /* Boolean? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var borderDashOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var font: String?
        get() = definedExternally
        set(value) = definedExternally
    var textFont: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontStyle: String? /* "normal" | "italic" | "oblique" */
        get() = definedExternally
        set(value) = definedExternally
    var fontWeight: dynamic /* "normal" | "bold" | "bolder" | "lighter" | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var fontFamily: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontSize: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var align: String? /* "left" | "center" | "right" */
        get() = definedExternally
        set(value) = definedExternally
    var verticalAlign: String? /* "top" | "middle" | "bottom" */
        get() = definedExternally
        set(value) = definedExternally
    var lineHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tag: String?
        get() = definedExternally
        set(value) = definedExternally
    var textShadowColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var textShadowBlur: Number?
        get() = definedExternally
        set(value) = definedExternally
    var textShadowOffsetX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var textShadowOffsetY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* String? | `T$3`? */
        get() = definedExternally
        set(value) = definedExternally
    var padding: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var margin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var borderColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var borderWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var borderRadius: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var shadowColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var shadowBlur: Number?
        get() = definedExternally
        set(value) = definedExternally
    var shadowOffsetX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var shadowOffsetY: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TextStyleProps : TextStylePropsPart {
    override var text: String?
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rich: Dictionary<TextStylePropsPart>?
        get() = definedExternally
        set(value) = definedExternally
    var overflow: String? /* "break" | "breakAll" | "truncate" | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var lineOverflow: String? /* "truncate" */
        get() = definedExternally
        set(value) = definedExternally
    var ellipsis: String?
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
    var truncateMinChar: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TextProps : DisplayableProps {
    override var zlevel: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var z: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var z2: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var culling: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var cursor: String?
        get() = definedExternally
        set(value) = definedExternally
}

//external open class ZRText(opts: TextProps = definedExternally) : Displayable<TextProps>, GroupLike {
//    override var parent: Group
//        get() = definedExternally
//        set(value) = definedExternally
//    override fun animate(key: String /* "" | "style" */, loop: Boolean): dynamic /* Animator | Animator */
//    open fun animate(): Animator<ZRText /* this */>
//    override fun animate(key: String /* "" | "style" */): dynamic /* Animator | Animator */
//    override fun getState(stateName: String): dynamic /* typealias Pick = dynamic */
//    override fun ensureState(stateName: String): dynamic /* typealias Pick = dynamic */
//    override var states: Dictionary<dynamic /* typealias Pick = dynamic */>
//    override var stateProxy: (stateName: String) -> dynamic
//    override var type: String
//    open var overlap: String /* "hidden" | "show" | "blur" */
//    open var innerTransformable: Transformable
//    open var _children: Any
//    open var _childCursor: Any
//    open var _defaultStyle: Any
//    override fun childrenRef(): Array<dynamic /* ZRImage | Rect | TSpan */>
//    override fun update()
//    override fun updateTransform()
//    override fun getLocalTransform(m: MatrixArray): MatrixArray
//    override fun getComputedTransform(): MatrixArray
//    open var _updateSubTexts: Any
//    override fun addSelfToZr(zr: ZRenderType)
//    override fun removeSelfFromZr(zr: ZRenderType)
//    override fun getBoundingRect(): BoundingRect
//    open fun setDefaultTextStyle(defaultTextStyle: dynamic /* typealias Pick = dynamic */)
//    open fun setTextContent(textContent: Any)
//    override fun setTextContent(textEl: ZRText)
//    open fun _mergeStyle(targetStyle: TextStyleProps, sourceStyle: TextStyleProps): TextStyleProps
//    open var _mergeRich: Any
//    override fun getAnimationStyleProps(): MapToType<TextProps, Boolean>
//    open var _getOrCreateChild: Any
//    open var _updatePlainTexts: Any
//    open var _updateRichTexts: Any
//    open var _placeToken: Any
//    open var _renderBackground: Any
//
//    companion object {
//        fun makeFont(style: TextStylePropsPart): String
//    }
//}

external interface TextPositionCalculationResult {
    var x: Number
    var y: Number
    var align: String /* "left" | "center" | "right" */
    var verticalAlign: String /* "top" | "middle" | "bottom" */
}

external open class PolylineShape {
    open var points: Array<VectorArray>
    open var percent: Number
    open var smooth: Number
    open var smoothConstraint: Array<VectorArray>
}

external interface PolylineShapePartial {
    var points: Array<VectorArray>?
        get() = definedExternally
        set(value) = definedExternally
    var percent: Number?
        get() = definedExternally
        set(value) = definedExternally
    var smooth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var smoothConstraint: Array<VectorArray>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PolylineProps : PathProps

external interface `T$4` {
    var stroke: String
    var fill: String
}

external open class Polyline(opts: PolylineProps = definedExternally) : Path<PolylineProps> {
    override fun getDefaultStyle(): `T$4`
    override fun getDefaultShape(): PolylineShape
    open fun buildPath(ctx: CanvasRenderingContext2D, shape: PolylineShape)
}

external interface ElementAnimateConfig {
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var easing: dynamic /* Any | easingFunc? */
        get() = definedExternally
        set(value) = definedExternally
    var during: ((percent: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var done: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var aborted: Function<*>?
        get() = definedExternally
        set(value) = definedExternally
    var scope: String?
        get() = definedExternally
        set(value) = definedExternally
    var force: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var additive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var setToFinal: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ElementTextConfig {
    var position: dynamic /* "left" | "right" | "top" | "bottom" | "inside" | "insideLeft" | "insideRight" | "insideTop" | "insideBottom" | "insideTopLeft" | "insideTopRight" | "insideBottomLeft" | "insideBottomRight" | Array<dynamic /* Number | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var layoutRect: RectLike?
        get() = definedExternally
        set(value) = definedExternally
    var offset: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var origin: dynamic /* Array<dynamic /* Number | String */>? | "center" */
        get() = definedExternally
        set(value) = definedExternally
    var distance: Number?
        get() = definedExternally
        set(value) = definedExternally
    var local: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var insideFill: String?
        get() = definedExternally
        set(value) = definedExternally
    var insideStroke: String?
        get() = definedExternally
        set(value) = definedExternally
    var outsideFill: String?
        get() = definedExternally
        set(value) = definedExternally
    var outsideStroke: String?
        get() = definedExternally
        set(value) = definedExternally
    var inside: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ElementTextGuideLineConfig {
    var anchor: Point?
        get() = definedExternally
        set(value) = definedExternally
    var showAbove: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var candidates: Array<String? /* "left" | "top" | "right" | "bottom" */>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ElementEvent {
    var type: String /* "click" | "dblclick" | "mousewheel" | "mouseout" | "mouseover" | "mouseup" | "mousedown" | "mousemove" | "contextmenu" | "drag" | "dragstart" | "dragend" | "dragenter" | "dragleave" | "dragover" | "drop" | "globalout" */
    var event: dynamic /* MouseEvent & ZREventProperties | TouchEvent & ZREventProperties */
        get() = definedExternally
        set(value) = definedExternally
    var target: Element__0
    var topTarget: Element__0
    var cancelBubble: Boolean
    var offsetX: Number
    var offsetY: Number
    var gestureEvent: String
    var pinchX: Number
    var pinchY: Number
    var pinchScale: Number
    var wheelDelta: Number
    var zrByTouch: Boolean
    var which: Number
    var stop: (self: ElementEvent) -> Unit
}

external interface ElementEventHandlerProps {
    var onclick: ElementEventCallback<Any, Any>
    var ondblclick: ElementEventCallback<Any, Any>
    var onmouseover: ElementEventCallback<Any, Any>
    var onmouseout: ElementEventCallback<Any, Any>
    var onmousemove: ElementEventCallback<Any, Any>
    var onmousewheel: ElementEventCallback<Any, Any>
    var onmousedown: ElementEventCallback<Any, Any>
    var onmouseup: ElementEventCallback<Any, Any>
    var oncontextmenu: ElementEventCallback<Any, Any>
    var ondrag: ElementEventCallback<Any, Any>
    var ondragstart: ElementEventCallback<Any, Any>
    var ondragend: ElementEventCallback<Any, Any>
    var ondragenter: ElementEventCallback<Any, Any>
    var ondragleave: ElementEventCallback<Any, Any>
    var ondragover: ElementEventCallback<Any, Any>
    var ondrop: ElementEventCallback<Any, Any>
}

external interface ElementProps : ElementEventHandlerProps /* , Pick<Transformable, Any> */ {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var ignore: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isGroup: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var draggable: dynamic /* Boolean? | "horizontal" | "vertical" */
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ignoreClip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var globalScaleRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var textConfig: ElementTextConfig?
        get() = definedExternally
        set(value) = definedExternally
    var textContent: Any? //ZRText?
        get() = definedExternally
        set(value) = definedExternally
    var clipPath: Path__0?
        get() = definedExternally
        set(value) = definedExternally
    var drift: Any?
        get() = definedExternally
        set(value) = definedExternally
    var extra: Dictionary<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var anid: String?
        get() = definedExternally
        set(value) = definedExternally
}

external var PRIMARY_STATES_KEYS: dynamic /* JsTuple<String, String> */

external interface ElementCommonState {
    var hoverLayer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Element<Props : ElementProps> : Transformable, ElementEventHandlerProps {
    // override var parent: Transformable
    override var x: Number
    override var y: Number
    override var scaleX: Number
    override var scaleY: Number
    override var skewX: Number
    override var skewY: Number
    override var rotation: Number
    override var anchorX: Number
    override var anchorY: Number
    override var originX: Number
    override var originY: Number
    override var globalScaleRatio: Number
    override var transform: MatrixArray
    override var invTransform: MatrixArray
    override fun getLocalTransform(m: MatrixArray): MatrixArray
    override fun setPosition(arr: Array<Number>)
    override fun setScale(arr: Array<Number>)
    override fun setSkew(arr: Array<Number>)
    override fun setOrigin(arr: Array<Number>)
    override fun needLocalTransform(): Boolean
    override fun updateTransform()
    override var _resolveGlobalScaleRatio: Any
    override fun getComputedTransform(): MatrixArray
    override fun setLocalTransform(m: VectorArray)
    override fun decomposeTransform()
    override fun getGlobalScale(out: VectorArray): VectorArray
    override fun transformCoordToLocal(x: Number, y: Number): Array<Number>
    override fun transformCoordToGlobal(x: Number, y: Number): Array<Number>
    override fun getLineScale(): Number
    override fun copyTransform(source: Transformable)
    open var `_$handlers`: Any
    open var `_$eventProcessor`: EventProcessor<Any /* Any & Any */>
    constructor(eventProcessors: EventProcessor<Any /* Any & Any */> = definedExternally)
    constructor()
    open fun <Ctx, EvtNm : Any> on(event: EvtNm, handler: WithThisType<Any, CbThis<Ctx, Element<Props> /* this */>>, context: Ctx = definedExternally): Element<Props> /* this */
    open fun <Ctx, EvtNm : Any> on(event: EvtNm, handler: WithThisType<Any, CbThis<Ctx, Element<Props> /* this */>>): Element<Props> /* this */
    open fun <Ctx, EvtNm : Any> on(event: EvtNm, query: String, handler: WithThisType<Any, CbThis<Ctx, Element<Props> /* this */>>, context: Ctx = definedExternally): Element<Props> /* this */
    open fun <Ctx, EvtNm : Any> on(event: EvtNm, query: String, handler: WithThisType<Any, CbThis<Ctx, Element<Props> /* this */>>): Element<Props> /* this */
    open fun <Ctx, EvtNm : Any> on(event: EvtNm, query: Any, handler: WithThisType<Any, CbThis<Ctx, Element<Props> /* this */>>, context: Ctx = definedExternally): Element<Props> /* this */
    open fun <Ctx, EvtNm : Any> on(event: EvtNm, query: Any, handler: WithThisType<Any, CbThis<Ctx, Element<Props> /* this */>>): Element<Props> /* this */
    open fun isSilent(eventName: Any): Boolean
    open fun off(eventType: Any = definedExternally, handler: Function<*> = definedExternally): Element<Props> /* this */
    open fun <EvtNm : Any> trigger(eventType: EvtNm, vararg args: Parameters<Any>): Element<Props> /* this */
    open fun triggerWithContext(type: Any, vararg args: Any): Element<Props> /* this */
    override var onclick: ElementEventCallback<Any, Any>
    override var ondblclick: ElementEventCallback<Any, Any>
    override var onmouseover: ElementEventCallback<Any, Any>
    override var onmouseout: ElementEventCallback<Any, Any>
    override var onmousemove: ElementEventCallback<Any, Any>
    override var onmousewheel: ElementEventCallback<Any, Any>
    override var onmousedown: ElementEventCallback<Any, Any>
    override var onmouseup: ElementEventCallback<Any, Any>
    override var oncontextmenu: ElementEventCallback<Any, Any>
    override var ondrag: ElementEventCallback<Any, Any>
    override var ondragstart: ElementEventCallback<Any, Any>
    override var ondragend: ElementEventCallback<Any, Any>
    override var ondragenter: ElementEventCallback<Any, Any>
    override var ondragleave: ElementEventCallback<Any, Any>
    override var ondragover: ElementEventCallback<Any, Any>
    override var ondrop: ElementEventCallback<Any, Any>
    open var id: Number
    open var type: String
    open var name: String
    open var ignore: Boolean
    open var silent: Boolean
    open var isGroup: Boolean
    open var draggable: dynamic /* Boolean | "horizontal" | "vertical" */
    open var dragging: Boolean
    // override var parent: Group
    open var animators: Array<Animator<Any>>
    open var ignoreClip: Boolean
    open var __hostTarget: Element__0
    open var __zr: ZRenderType
    open var __dirty: Number
    open var __isRendered: Boolean
    open var __inHover: Boolean
    open var _clipPath: Any
    open var _textContent: Any
    open var _textGuide: Any
    open var textConfig: ElementTextConfig
    open var textGuideLineConfig: ElementTextGuideLineConfig
    open var anid: String
    open var extra: Dictionary<Any>
    open var currentStates: Array<String>
    open var prevStates: Array<String>
    open var states: Dictionary<dynamic /* typealias Pick = dynamic */>
    open var stateTransition: ElementAnimateConfig
    open var stateProxy: (stateName: String, targetStates: Array<String>) -> dynamic
    open var _normalState: dynamic /* typealias Pick = dynamic */
    open var _innerTextDefaultStyle: Any
    constructor(props: Props = definedExternally)
    open fun _init(props: Props = definedExternally)
    open fun drift(dx: Number, dy: Number, e: ElementEvent = definedExternally)
    open fun beforeUpdate()
    open fun afterUpdate()
    open fun update()
    open fun updateInnerText(forceUpdate: Boolean = definedExternally)
    open fun canBeInsideText(): Boolean
    open fun getInsideTextFill(): String?
    open fun getInsideTextStroke(textFill: String): String?
    open fun getOutsideFill(): String?
    open fun getOutsideStroke(textFill: String): String
    open fun <Context> traverse(cb: (self: Context, el: Element<Props>) -> Unit, context: Context = definedExternally)
    open fun attrKV(key: String, value: Any)
    open fun hide()
    open fun show()
    open fun attr(keyOrObj: Props): Element<Props> /* this */
    open fun <T : Any> attr(keyOrObj: T, value: Any): Element<Props> /* this */
    open fun saveCurrentToNormalState(toState: dynamic /* typealias Pick = dynamic */)
    open fun _innerSaveToNormal(toState: dynamic /* typealias Pick = dynamic */)
    open fun _savePrimaryToNormal(toState: Dictionary<Any>, normalState: Dictionary<Any>, primaryKeys: Array<String>)
    open fun hasState(): Boolean
    open fun getState(name: String): dynamic /* typealias Pick = dynamic */
    open fun ensureState(name: String): dynamic /* typealias Pick = dynamic */
    open fun clearStates(noAnimation: Boolean = definedExternally)
    open fun useState(stateName: String, keepCurrentStates: Boolean = definedExternally, noAnimation: Boolean = definedExternally, forceUseHoverLayer: Boolean = definedExternally): dynamic /* typealias Pick = dynamic */
    open fun useStates(states: Array<String>, noAnimation: Boolean = definedExternally, forceUseHoverLayer: Boolean = definedExternally)
    open fun isSilent(): Boolean
    open var _updateAnimationTargets: Any
    open fun removeState(state: String)
    open fun replaceState(oldState: String, newState: String, forceAdd: Boolean)
    open fun toggleState(state: String, enable: Boolean)
    open fun _mergeStates(states: Array<dynamic /* typealias Pick = dynamic */>): dynamic /* typealias Pick = dynamic */
    open fun _applyStateObj(stateName: String, state: dynamic /* typealias Pick = dynamic */, normalState: dynamic /* typealias Pick = dynamic */, keepCurrentStates: Boolean, transition: Boolean, animationCfg: ElementAnimateConfig)
    open var _attachComponent: Any
    open var _detachComponent: Any
    open fun getClipPath(): Path<PathProps>
    open fun setClipPath(clipPath: Path__0)
    open fun removeClipPath()
    open fun getTextContent(): ZRText
    open fun setTextContent(textEl: ZRText)
    open fun setTextConfig(cfg: ElementTextConfig)
    open fun removeTextConfig()
    open fun removeTextContent()
    open fun getTextGuideLine(): Polyline
    open fun setTextGuideLine(guideLine: Polyline)
    open fun removeTextGuideLine()
    open fun markRedraw()
    open fun dirty()
    open var _toggleHoverLayerFlag: Any
    open fun addSelfToZr(zr: ZRenderType)
    open fun removeSelfFromZr(zr: ZRenderType)
    open fun animate(key: String = definedExternally, loop: Boolean = definedExternally, allowDiscreteAnimation: Boolean = definedExternally): Animator<Any>
    open fun addAnimator(animator: Animator<Any>, key: String)
    open fun updateDuringAnimation(key: String)
    open fun stopAnimation(scope: String = definedExternally, forwardToLast: Boolean = definedExternally): Element<Props> /* this */
    open fun animateTo(target: Props, cfg: ElementAnimateConfig = definedExternally, animationProps: MapToType<Props, Boolean> = definedExternally)
    open fun animateFrom(target: Props, cfg: ElementAnimateConfig, animationProps: MapToType<Props, Boolean> = definedExternally)
    open fun _transitionState(stateName: String, target: Props, cfg: ElementAnimateConfig = definedExternally, animationProps: MapToType<Props, Boolean> = definedExternally)
    open fun getBoundingRect(): BoundingRect
    open fun getPaintRect(): BoundingRect
    open var calculateTextPosition: ElementCalculateTextPosition

    companion object {
        fun getLocalTransform(target: Transformable, m: MatrixArray = definedExternally): MatrixArray
        var initDefaultProps: Any
        // var initDefaultProps: Unit
    }
}

external open class Element__0 : Element<ElementProps>

external interface CommonStyleProps {
    var shadowBlur: Number?
        get() = definedExternally
        set(value) = definedExternally
    var shadowOffsetX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var shadowOffsetY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var shadowColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var opacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var blend: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DisplayableProps : ElementProps {
    var style: Dictionary<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var zlevel: Number?
        get() = definedExternally
        set(value) = definedExternally
    var z: Number?
        get() = definedExternally
        set(value) = definedExternally
    var z2: Number?
        get() = definedExternally
        set(value) = definedExternally
    var culling: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var cursor: String?
        get() = definedExternally
        set(value) = definedExternally
    var rectHover: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var progressive: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var incremental: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var ignoreCoarsePointer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var batch: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var invisible: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Displayable<Props : DisplayableProps>(props: Props = definedExternally) : Element<Props> {
    open fun animate(key: String /* "" | "style" */ = definedExternally, loop: Boolean = definedExternally): dynamic /* Animator | Animator */
    open fun animate(): Animator<Displayable<Props> /* this */>
    open fun animate(key: String /* "" | "style" */ = definedExternally): dynamic /* Animator | Animator */
    override fun getState(stateName: String): dynamic /* typealias Pick = dynamic */
    override fun ensureState(stateName: String): dynamic /* typealias Pick = dynamic */
    override var states: Dictionary<dynamic /* typealias Pick = dynamic */>
    open var invisible: Boolean
    open var z: Number
    open var z2: Number
    open var zlevel: Number
    open var culling: Boolean
    open var cursor: String
    open var rectHover: Boolean
    open var incremental: Boolean
    open var ignoreCoarsePointer: Boolean
    open var style: Dictionary<Any>
    override var _normalState: dynamic /* typealias Pick = dynamic */
    open var _rect: BoundingRect
    open var _paintRect: BoundingRect
    open var _prevPaintRect: BoundingRect
    open var dirtyRectTolerance: Number
    open var useHoverLayer: Boolean
    open var __hoverStyle: CommonStyleProps
    open var __clipPaths: Array<Path__0>
    open var __canvasFillGradient: CanvasGradient
    open var __canvasStrokeGradient: CanvasGradient
    open var __canvasFillPattern: CanvasPattern
    open var __canvasStrokePattern: CanvasPattern
    open var __svgEl: SVGElement
    override fun _init(props: Props)
    open fun beforeBrush()
    open fun afterBrush()
    open fun innerBeforeBrush()
    open fun innerAfterBrush()
    open fun shouldBePainted(viewWidth: Number, viewHeight: Number, considerClipPath: Boolean, considerAncestors: Boolean): Boolean
    open fun contain(x: Number, y: Number): Boolean
    open fun <Context> traverse(cb: (self: Context, el: Displayable<Props> /* this */) -> Unit, context: Context = definedExternally)
    open fun rectContain(x: Number, y: Number): Boolean
    override fun getPaintRect(): BoundingRect
    open fun setPrevPaintRect(paintRect: BoundingRect)
    open fun getPrevPaintRect(): BoundingRect
    open fun animateStyle(loop: Boolean): Animator<Any>
    override fun updateDuringAnimation(targetKey: String)
    override fun attrKV(key: String /* "style" | "zlevel" | "z" | "z2" | "culling" | "cursor" | "rectHover" | "progressive" | "incremental" | "ignoreCoarsePointer" | "batch" | "invisible" */, value: DisplayablePropertyType)
    open fun setStyle(obj: Any): Displayable<Props> /* this */
    open fun <T : Any> setStyle(obj: T, value: Any): Displayable<Props> /* this */
    open fun dirtyStyle(notRedraw: Boolean = definedExternally)
    override fun dirty()
    open fun styleChanged(): Boolean
    open fun styleUpdated()
    open fun createStyle(obj: Any = definedExternally): Any
    open fun useStyle(obj: Any)
    open fun isStyleObject(obj: Any): Any
    override fun _innerSaveToNormal(toState: dynamic /* typealias Pick = dynamic */)
    override fun _applyStateObj(stateName: String, state: dynamic /* typealias Pick = dynamic */, normalState: dynamic /* typealias Pick = dynamic */, keepCurrentStates: Boolean, transition: Boolean, animationCfg: ElementAnimateConfig)
    override fun _mergeStates(states: Array<dynamic /* typealias Pick = dynamic */>): dynamic /* typealias Pick = dynamic */
    open fun _mergeStyle(targetStyle: CommonStyleProps, sourceStyle: CommonStyleProps): CommonStyleProps
    open fun getAnimationStyleProps(): MapToType<DisplayableProps, Boolean>

    companion object {
        var initDefaultProps: Unit
    }
}

external open class Displayable__0 : Displayable<DisplayableProps>

external interface `T$5` {
    var offsetLeft: Number
    var offsetTop: Number
}

external interface PainterBase {
    var type: String
    var root: HTMLElement?
        get() = definedExternally
        set(value) = definedExternally
    var ssrOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    fun resize(width: Number = definedExternally, height: Number = definedExternally)
    fun resize()
    fun resize(width: Number = definedExternally)
    fun resize(width: Number = definedExternally, height: String = definedExternally)
    fun resize(width: String = definedExternally, height: Number = definedExternally)
    fun resize(width: String = definedExternally)
    fun resize(width: String = definedExternally, height: String = definedExternally)
    fun refresh()
    fun clear()
    val renderToString: (() -> String)?
    var getType: () -> String
    fun getWidth(): Number
    fun getHeight(): Number
    fun dispose()
    var getViewportRoot: () -> HTMLElement
    var getViewportRootOffset: () -> `T$5`
    fun refreshHover()
    fun configLayer(zlevel: Number, config: Dictionary<Any>)
    fun setBackgroundColor(backgroundColor: String)
    fun setBackgroundColor(backgroundColor: GradientObject)
    fun setBackgroundColor(backgroundColor: ImagePatternObject)
    fun setBackgroundColor(backgroundColor: SVGPatternObject)
}

external interface HandlerProxyInterface : Eventful__0 {
    var handler: Handler
    var dispose: () -> Unit
    var setCursor: (cursorStyle: String) -> Unit
}

external fun shapeCompareFunc(a: Displayable__0, b: Displayable__0): Number

external open class Storage {
    open var _roots: Any
    open var _displayList: Any
    open var _displayListLen: Any
    open fun <T> traverse(cb: (self: T, el: Element__0) -> Unit, context: T = definedExternally)
    open fun getDisplayList(update: Boolean = definedExternally, includeIgnore: Boolean = definedExternally): Array<Displayable__0>
    open fun updateDisplayList(includeIgnore: Boolean = definedExternally)
    open var _updateAndAddDisplayable: Any
    open fun addRoot(el: Element__0)
    open fun delRoot(el: Element__0)
    open fun delRoot(el: Array<Element__0>)
    open fun delAllRoots()
    open fun getRoots(): Array<Element<ElementProps>>
    open fun dispose()
    open var displayableSortFunc: Any
}

external open class HoveredResult(x: Number = definedExternally, y: Number = definedExternally) {
    open var x: Number
    open var y: Number
    open var target: Displayable__0
    open var topTarget: Displayable__0
}

external interface `T$6` {
    var target: Element__0?
        get() = definedExternally
        set(value) = definedExternally
    var topTarget: Element__0?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Handler(storage: Storage, painter: PainterBase, proxy: HandlerProxyInterface, painterRoot: HTMLElement, pointerSize: Number) : Eventful__0 {
    open var storage: Storage
    open var painter: PainterBase
    open var painterRoot: HTMLElement
    open var proxy: HandlerProxyInterface
    open var _hovered: Any
    open var _gestureMgr: Any
    open var _draggingMgr: Any
    open var _pointerSize: Any
    open var _downEl: Element__0
    open var _upEl: Element__0
    open var _downPoint: dynamic /* JsTuple<Number, Number> */
    open fun setHandlerProxy(proxy: HandlerProxyInterface)
    open fun mousemove(event: MouseEvent /* MouseEvent & ZREventProperties */)
    open fun mousemove(event: TouchEvent /* TouchEvent & ZREventProperties */)
    open fun mouseout(event: MouseEvent /* MouseEvent & ZREventProperties */)
    open fun mouseout(event: TouchEvent /* TouchEvent & ZREventProperties */)
    open fun resize()
    open fun dispatch(eventName: String /* "click" | "dblclick" | "mousewheel" | "mouseout" | "mouseup" | "mousedown" | "mousemove" | "contextmenu" */, eventArgs: Any = definedExternally)
    open fun dispose()
    open fun setCursorStyle(cursorStyle: String)
    open fun dispatchToElement(targetInfo: `T$6`, eventName: String /* "click" | "dblclick" | "mousewheel" | "mouseout" | "mouseover" | "mouseup" | "mousedown" | "mousemove" | "contextmenu" | "drag" | "dragstart" | "dragend" | "dragenter" | "dragleave" | "dragover" | "drop" | "globalout" */, event: MouseEvent /* MouseEvent & ZREventProperties */)
    open fun dispatchToElement(targetInfo: `T$6`, eventName: String /* "click" | "dblclick" | "mousewheel" | "mouseout" | "mouseover" | "mouseup" | "mousedown" | "mousemove" | "contextmenu" | "drag" | "dragstart" | "dragend" | "dragenter" | "dragleave" | "dragover" | "drop" | "globalout" */, event: TouchEvent /* TouchEvent & ZREventProperties */)
    open fun findHover(x: Number, y: Number, exclude: Displayable__0 = definedExternally): HoveredResult
    open fun processGesture(event: MouseEvent /* MouseEvent & ZREventProperties */, stage: String /* "start" | "end" | "change" */ = definedExternally)
    open fun processGesture(event: MouseEvent /* MouseEvent & ZREventProperties */)
    open fun processGesture(event: TouchEvent /* TouchEvent & ZREventProperties */, stage: String /* "start" | "end" | "change" */ = definedExternally)
    open fun processGesture(event: TouchEvent /* TouchEvent & ZREventProperties */)
    open var click: (event: dynamic /* MouseEvent & ZREventProperties | TouchEvent & ZREventProperties */) -> Unit
    open var mousedown: (event: dynamic /* MouseEvent & ZREventProperties | TouchEvent & ZREventProperties */) -> Unit
    open var mouseup: (event: dynamic /* MouseEvent & ZREventProperties | TouchEvent & ZREventProperties */) -> Unit
    open var mousewheel: (event: dynamic /* MouseEvent & ZREventProperties | TouchEvent & ZREventProperties */) -> Unit
    open var dblclick: (event: dynamic /* MouseEvent & ZREventProperties | TouchEvent & ZREventProperties */) -> Unit
    open var contextmenu: (event: dynamic /* MouseEvent & ZREventProperties | TouchEvent & ZREventProperties */) -> Unit
}

external interface LayerConfig {
    var clearColor: dynamic /* String? | GradientObject? | ImagePatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var motionBlur: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var lastFrameAlpha: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PainterBaseCtor

external interface `T$7` {
    var width: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var height: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$8` {
    var target: Displayable__0
    var topTarget: Displayable__0
}

external open class ZRender(id: Number, dom: HTMLElement = definedExternally, opts: ZRenderInitOpt = definedExternally) {
    open var dom: HTMLElement
    open var id: Number
    open var storage: Storage
    open var painter: PainterBase
    open var handler: Handler
    open var animation: Animation
    open var _sleepAfterStill: Any
    open var _stillFrameAccum: Any
    open var _needsRefresh: Any
    open var _needsRefreshHover: Any
    open var _disposed: Any
    open var _darkMode: Any
    open var _backgroundColor: Any
    open fun add(el: Element__0)
    open fun remove(el: Element__0)
    open fun configLayer(zLevel: Number, config: LayerConfig)
    open fun setBackgroundColor(backgroundColor: String)
    open fun setBackgroundColor(backgroundColor: GradientObject)
    open fun setBackgroundColor(backgroundColor: ImagePatternObject)
    open fun setBackgroundColor(backgroundColor: SVGPatternObject)
    open fun getBackgroundColor(): dynamic /* String | GradientObject | ImagePatternObject | SVGPatternObject */
    open fun setDarkMode(darkMode: Boolean)
    open fun isDarkMode(): Boolean
    open fun refreshImmediately(fromInside: Boolean = definedExternally)
    open fun refresh()
    open fun flush()
    open var _flush: Any
    open fun setSleepAfterStill(stillFramesCount: Number)
    open fun wakeUp()
    open fun refreshHover()
    open fun refreshHoverImmediately()
    open fun resize(opts: `T$7` = definedExternally)
    open fun clearAnimation()
    open fun getWidth(): Number?
    open fun getHeight(): Number?
    open fun setCursorStyle(cursorStyle: String)
    open fun findHover(x: Number, y: Number): `T$8`?
    open fun <Ctx> on(eventName: String /* "click" | "dblclick" | "mousewheel" | "mouseout" | "mouseover" | "mouseup" | "mousedown" | "mousemove" | "contextmenu" | "drag" | "dragstart" | "dragend" | "dragenter" | "dragleave" | "dragover" | "drop" | "globalout" */, eventHandler: ElementEventCallback<Ctx, ZRenderType>, context: Ctx = definedExternally): ZRender /* this */
    open fun <Ctx> on(eventName: String /* "click" | "dblclick" | "mousewheel" | "mouseout" | "mouseover" | "mouseup" | "mousedown" | "mousemove" | "contextmenu" | "drag" | "dragstart" | "dragend" | "dragenter" | "dragleave" | "dragover" | "drop" | "globalout" */, eventHandler: ElementEventCallback<Ctx, ZRenderType>): ZRender /* this */
    open fun <Ctx> on(eventName: String, eventHandler: WithThisType<EventCallback<Array<Any>>, Any>, context: Ctx = definedExternally): ZRender /* this */
    open fun on(eventName: String, eventHandler: WithThisType<EventCallback<Array<Any>>, Any>): ZRender /* this */
    open fun off(eventName: String = definedExternally, eventHandler: EventCallback<Any> = definedExternally)
    open fun trigger(eventName: String, event: Any = definedExternally)
    open fun clear()
    open fun dispose()

    open fun setOption(option: Any /*EChartsOption*/)
}

external interface ZRenderInitOpt {
    var renderer: String?
        get() = definedExternally
        set(value) = definedExternally
    var devicePixelRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var height: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var useDirtyRect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useCoarsePointer: dynamic /* "auto" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var pointerSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ssr: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external fun init(dom: HTMLElement? = definedExternally, opts: ZRenderInitOpt = definedExternally): ZRender

external fun dispose(zr: ZRender)

external fun disposeAll()

external fun getInstance(id: Number): ZRender

external fun registerPainter(name: String, Ctor: PainterBaseCtor)

external fun getElementSSRData(el: Element__0): ElementSSRData

external fun <T> registerSSRDataGetter(getter: ElementSSRDataGetter<T>)

external var version: Any

external interface ZRenderType : ZRender

external var zrender_d_init: Any

external var zrender_d_dispose: Any

external var zrender_d_disposeAll: Any

external var zrender_d_getInstance: Any

external var zrender_d_registerPainter: Any

external var zrender_d_getElementSSRData: Any

external var zrender_d_registerSSRDataGetter: Any

external var zrender_d_version: Any

external fun encodeHTML(source: String): String

external interface InnerTruncateOption {
    var maxIteration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minChar: Number?
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
    var maxIterations: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external fun truncateText(text: String, containerWidth: Number, font: String, ellipsis: String = definedExternally, options: InnerTruncateOption = definedExternally): String

external open class SVGPath : Path__0 {
    open fun applyTransform(m: MatrixArray)
}

external fun extendFromString(str: String, defaultOpts: SVGPathOption = definedExternally): Any

external fun mergePath(pathEls: Array<Path__0>, opts: PathProps): Path<PathProps>

external open class CircleShape {
    open var cx: Number
    open var cy: Number
    open var r: Number
}

external interface CircleShapePartial {
    var cx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var r: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CircleProps : PathProps

external open class Circle(opts: CircleProps = definedExternally) : Path<CircleProps> {
    override fun getDefaultShape(): CircleShape
    open fun buildPath(ctx: CanvasRenderingContext2D, shape: CircleShape)
}

external open class EllipseShape {
    open var cx: Number
    open var cy: Number
    open var rx: Number
    open var ry: Number
}

external interface EllipseShapePartial {
    var cx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ry: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EllipseProps : PathProps

external open class Ellipse(opts: EllipseProps = definedExternally) : Path<EllipseProps> {
    override fun getDefaultShape(): EllipseShape
    open fun buildPath(ctx: CanvasRenderingContext2D, shape: EllipseShape)
}

external open class SectorShape {
    open var cx: Number
    open var cy: Number
    open var r0: Number
    open var r: Number
    open var startAngle: Number
    open var endAngle: Number
    open var clockwise: Boolean
    open var cornerRadius: dynamic /* Number | Array<Number> */
}

external interface SectorShapePartial {
    var cx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var r0: Number?
        get() = definedExternally
        set(value) = definedExternally
    var r: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var clockwise: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var cornerRadius: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SectorProps : PathProps

external open class Sector(opts: SectorProps = definedExternally) : Path<SectorProps> {
    override fun getDefaultShape(): SectorShape
    open fun buildPath(ctx: CanvasRenderingContext2D, shape: SectorShape)
    override fun isZeroArea(): Boolean
}

external open class RingShape {
    open var cx: Number
    open var cy: Number
    open var r: Number
    open var r0: Number
}

external interface RingShapePartial {
    var cx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var r: Number?
        get() = definedExternally
        set(value) = definedExternally
    var r0: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RingProps : PathProps

external open class Ring(opts: RingProps = definedExternally) : Path<RingProps> {
    override fun getDefaultShape(): RingShape
    open fun buildPath(ctx: CanvasRenderingContext2D, shape: RingShape)
}

external open class PolygonShape {
    open var points: Array<VectorArray>
    open var smooth: Number
    open var smoothConstraint: Array<VectorArray>
}

external interface PolygonShapePartial {
    var points: Array<VectorArray>?
        get() = definedExternally
        set(value) = definedExternally
    var smooth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var smoothConstraint: Array<VectorArray>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PolygonProps : PathProps

external open class Polygon(opts: PolygonProps = definedExternally) : Path<PolygonProps> {
    override fun getDefaultShape(): PolygonShape
    open fun buildPath(ctx: CanvasRenderingContext2D, shape: PolygonShape)
}

external open class LineShape {
    open var x1: Number
    open var y1: Number
    open var x2: Number
    open var y2: Number
    open var percent: Number
}

external interface LineShapePartial {
    var x1: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y1: Number?
        get() = definedExternally
        set(value) = definedExternally
    var x2: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y2: Number?
        get() = definedExternally
        set(value) = definedExternally
    var percent: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LineProps : PathProps

external open class Line(opts: LineProps = definedExternally) : Path<LineProps> {
    override fun getDefaultStyle(): `T$4`
    override fun getDefaultShape(): LineShape
    open fun buildPath(ctx: CanvasRenderingContext2D, shape: LineShape)
    open fun pointAt(p: Number): VectorArray
}

external open class BezierCurveShape {
    open var x1: Number
    open var y1: Number
    open var x2: Number
    open var y2: Number
    open var cpx1: Number
    open var cpy1: Number
    open var cpx2: Number
    open var cpy2: Number
    open var percent: Number
}

external interface BezierCurveShapePartial {
    var x1: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y1: Number?
        get() = definedExternally
        set(value) = definedExternally
    var x2: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y2: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cpx1: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cpy1: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cpx2: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cpy2: Number?
        get() = definedExternally
        set(value) = definedExternally
    var percent: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BezierCurveProps : PathProps

external open class BezierCurve(opts: BezierCurveProps = definedExternally) : Path<BezierCurveProps> {
    override fun getDefaultStyle(): `T$4`
    override fun getDefaultShape(): BezierCurveShape
    open fun buildPath(ctx: CanvasRenderingContext2D, shape: BezierCurveShape)
    open fun pointAt(t: Number): Array<Number>
    open fun tangentAt(t: Number): Array<Number>
}

external open class ArcShape {
    open var cx: Number
    open var cy: Number
    open var r: Number
    open var startAngle: Number
    open var endAngle: Number
    open var clockwise: Boolean
}

external interface ArcShapePartial {
    var cx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var r: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var clockwise: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ArcProps : PathProps

external open class Arc(opts: ArcProps = definedExternally) : Path<ArcProps> {
    override fun getDefaultStyle(): `T$4`
    override fun getDefaultShape(): ArcShape
    open fun buildPath(ctx: CanvasRenderingContext2D, shape: ArcShape)
}

external interface CompoundPathShape {
    var paths: Array<Path__0>
}

external interface CompoundPathShapePartial {
    var paths: Array<Path__0>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class CompoundPath : Path__0 {
    override var type: String
    open var _updatePathDirty: Any
    override fun beforeBrush()
    open fun buildPath(ctx: PathProxy, shape: CompoundPathShape)
    open fun buildPath(ctx: CanvasRenderingContext2D, shape: CompoundPathShape)
    override fun afterBrush()
    override fun getBoundingRect(): BoundingRect
}

external open class IncrementalDisplayable : Displayable__0 {
    open var notClear: Boolean
    override var incremental: Boolean
    open var _displayables: Any
    open var _temporaryDisplayables: Any
    open var _cursor: Any
    open fun <T> traverse(cb: (self: T, el: IncrementalDisplayable /* this */) -> Unit, context: T)
    open fun useStyle()
    open fun getCursor(): Number
    override fun innerAfterBrush()
    open fun clearDisplaybles()
    open fun clearTemporalDisplayables()
    open fun addDisplayable(displayable: Displayable__0, notPersistent: Boolean = definedExternally)
    open fun addDisplayables(displayables: Array<Displayable__0>, notPersistent: Boolean = definedExternally)
    open fun getDisplayables(): Array<Displayable__0>
    open fun getTemporalDisplayables(): Array<Displayable__0>
    open fun eachPendingDisplayable(cb: (displayable: Displayable__0) -> Unit)
    override fun update()
    override fun getBoundingRect(): BoundingRect
    override fun contain(x: Number, y: Number): Boolean
}

external interface ClassManager {
    var registerClass: (clz: Constructor) -> Constructor
    var getClass: (componentMainType: Nothing? /* Nothing? & String */, subType: ComponentSubType, throwWhenNotFound: Boolean) -> Constructor
    var getClassesByMainType: (componentType: Nothing? /* Nothing? & String */) -> Array<Constructor>
    var hasClass: (componentType: ComponentFullType) -> Boolean
    var getAllClassMainTypes: () -> Array<String? /* Nothing? & String */>
    var hasSubTypes: (componentType: ComponentFullType) -> Boolean
}

external interface SubTypeDefaulter {
    @nativeInvoke
    operator fun invoke(option: ComponentOption): ComponentSubType
}

external interface SubTypeDefaulterManager {
    var registerSubTypeDefaulter: (componentType: String, defaulter: SubTypeDefaulter) -> Unit
    var determineSubType: (componentType: String, option: ComponentOption) -> String
}

external open class DataDiffer<CTX>(oldArr: `ArrayLike$1`<Any>, newArr: `ArrayLike$1`<Any>, oldKeyGetter: DiffKeyGetter<CTX> = definedExternally, newKeyGetter: DiffKeyGetter<CTX> = definedExternally, context: CTX = definedExternally, diffMode: String /* "oneToOne" | "multiple" */ = definedExternally) {
    open var _old: Any
    open var _new: Any
    open var _oldKeyGetter: Any
    open var _newKeyGetter: Any
    open var _add: Any
    open var _update: Any
    open var _updateManyToOne: Any
    open var _updateOneToMany: Any
    open var _updateManyToMany: Any
    open var _remove: Any
    open var _diffModeMultiple: Any
    open val context: CTX
    open fun add(func: DiffCallbackAdd): DataDiffer<CTX> /* this */
    open fun update(func: DiffCallbackUpdate): DataDiffer<CTX> /* this */
    open fun updateManyToOne(func: DiffCallbackUpdateManyToOne): DataDiffer<CTX> /* this */
    open fun updateOneToMany(func: DiffCallbackUpdateOneToMany): DataDiffer<CTX> /* this */
    open fun updateManyToMany(func: DiffCallbackUpdateManyToMany): DataDiffer<CTX> /* this */
    open fun remove(func: DiffCallbackRemove): DataDiffer<CTX> /* this */
    open fun execute()
    open var _executeOneToOne: Any
    open var _executeMultiple: Any
    open var _performRestAdd: Any
    open var _initIndexMap: Any
}

external open class DataDiffer__0 : DataDiffer<Any>

external interface DataTransformOption {
    var type: DataTransformType
    var config: DataTransformConfig?
        get() = definedExternally
        set(value) = definedExternally
    var print: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExternalDataTransform<TO : DataTransformOption> {
    var type: String
    var __isBuiltIn: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var transform: (param: ExternalDataTransformParam<TO>) -> dynamic
}

external interface ExternalDataTransform__0 : ExternalDataTransform<DataTransformOption>

external interface ExternalDataTransformParam<TO : DataTransformOption> {
    var upstream: ExternalSource
    var upstreamList: Array<ExternalSource>
    var config: Any
}

external interface ExternalDataTransformResultItem {
    var data: dynamic /* OptionSourceDataArrayRows | OptionSourceDataObjectRows */
        get() = definedExternally
        set(value) = definedExternally
    var dimensions: Array<dynamic /* DimensionName | DimensionDefinition */>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExternalDimensionDefinition : DimensionDefinition {
    var index: DimensionIndex
}

external open class ExternalSource {
    open var sourceFormat: Any
    open fun getRawData(): Any
    open fun getRawDataItem(dataIndex: Number): Any
    open fun cloneRawData(): Any
    open fun getDimensionInfo(dim: DimensionName): ExternalDimensionDefinition
    open fun getDimensionInfo(dim: DimensionIndex): ExternalDimensionDefinition
    open fun cloneAllDimensionInfo(): Array<ExternalDimensionDefinition>
    open fun count(): Number
    open fun retrieveValue(dataIndex: Number, dimIndex: DimensionIndex): dynamic /* String? | Number? | Date? */
    open fun retrieveValueFromItem(dataItem: Any, dimIndex: DimensionIndex): dynamic /* String? | Number? | Date? */
    open fun convertValue(rawVal: Any, dimInfo: ExternalDimensionDefinition): dynamic /* Number | OrdinalNumber | String */
}

external fun registerExternalTransform(externalTransform: ExternalDataTransform__0)

external open class PaletteMixin<T : PaletteOptionMixin> : Model<T> {
    open fun getColorFromPalette(self: PaletteMixin<T>, name: String, scope: Any = definedExternally, requestNum: Number = definedExternally): dynamic /* ColorString | LinearGradientObject | RadialGradientObject | ImagePatternObject | SVGPatternObject */
    open fun clearColorPalette(self: PaletteMixin<T>)
}

external open class ComponentView {
    open val updateTransform: ((model: ComponentModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload) -> dynamic)?
    open fun filterForExposedEvent(eventType: String, query: EventQueryItem, targetEl: Element__0, packedEvent: ECActionEvent): Boolean
    open fun filterForExposedEvent(eventType: String, query: EventQueryItem, targetEl: Element__0, packedEvent: ECElementEvent): Boolean
    open val findHighDownDispatchers: ((name: String) -> Array<Element__0>)?
    open var focusBlurEnabled: Boolean?
    open val group: ViewRootGroup
    open val uid: String
    open var __model: ComponentModel__0
    open var __alive: Boolean
    open var __id: String
    open fun init(ecModel: GlobalModel, api: ExtensionAPI)
    open fun render(model: ComponentModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload)
    open fun dispose(ecModel: GlobalModel, api: ExtensionAPI)
    open fun updateView(model: ComponentModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload)
    open fun updateLayout(model: ComponentModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload)
    open fun updateVisual(model: ComponentModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload)
    open fun toggleBlurSeries(seriesModels: Array<SeriesModel__0>, isBlur: Boolean, ecModel: GlobalModel)
    open fun eachRendered(cb: (el: Element__0) -> Any)

    companion object {
        var registerClass: (clz: Constructor) -> Constructor
    }
}

external interface TaskContext {
    var outputData: SeriesData__0?
        get() = definedExternally
        set(value) = definedExternally
    var data: SeriesData__0?
        get() = definedExternally
        set(value) = definedExternally
    var payload: Payload?
        get() = definedExternally
        set(value) = definedExternally
    var model: SeriesModel__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TaskProgressParams {
    var start: Number
    var end: Number
    var count: Number
    var next: TaskDataIteratorNext?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TaskDefineParam<Ctx : Any /* TaskContext */> {
    var reset: TaskResetCallback<Ctx>?
        get() = definedExternally
        set(value) = definedExternally
    var plan: TaskPlanCallback<Ctx>?
        get() = definedExternally
        set(value) = definedExternally
    var count: TaskCountCallback<Ctx>?
        get() = definedExternally
        set(value) = definedExternally
    var onDirty: TaskOnDirtyCallback<Ctx>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PerformArgs {
    var step: Number?
        get() = definedExternally
        set(value) = definedExternally
    var skip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var modBy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var modDataCount: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Task<Ctx : Any /* TaskContext*/>(define: TaskDefineParam<Ctx>) {
    open var _reset: Any
    open var _plan: Any
    open var _count: Any
    open var _onDirty: Any
    open var _progress: Any
    open var _callingProgress: Any
    open var _dirty: Any
    open var _modBy: Any
    open var _modDataCount: Any
    open var _upstream: Any
    open var _downstream: Any
    open var _dueEnd: Any
    open var _outputDueEnd: Any
    open var _settedOutputEnd: Any
    open var _dueIndex: Any
    open var _disposed: Any
    open var __pipeline: Pipeline
    open var __idxInPipeline: Number
    open var __block: Boolean
    open var context: Ctx
    open fun perform(performArgs: PerformArgs = definedExternally): Boolean
    open fun dirty()
    open var _doProgress: Any
    open var _doReset: Any
    open fun unfinished(): Boolean
    open fun pipe(downTask: Task<Ctx>)
    open fun dispose()
    open fun getUpstream(): Task<Ctx>
    open fun getDownstream(): Task<Ctx>
    open fun setOutputEnd(end: Number)
}

external interface Pipeline {
    var id: String
    var head: GeneralTask
    var tail: GeneralTask
    var threshold: Number
    var progressiveEnabled: Boolean
    var blockIndex: Number
    var step: Number
    var count: Number
    var currentTask: GeneralTask?
        get() = definedExternally
        set(value) = definedExternally
    var context: PipelineContext?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PipelineContext {
    var progressiveRender: Boolean
    var modDataCount: Number
    var large: Boolean
}

external interface PerformStageTaskOpt {
    var block: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var setDirty: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var visualType: String? /* "layout" | "visual" */
        get() = definedExternally
        set(value) = definedExternally
    var dirtyMap: HashMap__1<Any>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SeriesTaskContext : TaskContext {
    override var model: SeriesModel__0?
        get() = definedExternally
        set(value) = definedExternally
    override var data: SeriesData__0?
        get() = definedExternally
        set(value) = definedExternally
    var view: ChartView?
        get() = definedExternally
        set(value) = definedExternally
    var ecModel: GlobalModel?
        get() = definedExternally
        set(value) = definedExternally
    var api: ExtensionAPI?
        get() = definedExternally
        set(value) = definedExternally
    var useClearVisual: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var plan: StageHandlerPlan?
        get() = definedExternally
        set(value) = definedExternally
    var reset: StageHandlerReset?
        get() = definedExternally
        set(value) = definedExternally
    var scheduler: Scheduler?
        get() = definedExternally
        set(value) = definedExternally
    override var payload: Payload?
        get() = definedExternally
        set(value) = definedExternally
    var resetDefines: Array<StageHandlerProgressExecutor>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OverallTaskContext : TaskContext {
    var ecModel: GlobalModel
    var api: ExtensionAPI
    var overallReset: StageHandlerOverallReset
    var scheduler: Scheduler
    override var payload: Payload?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$10` {
    var step: Number
    var modBy: Number
    var modDataCount: Number
}

external open class Scheduler(ecInstance: EChartsType, api: ExtensionAPI, dataProcessorHandlers: Array<StageHandlerInternal>, visualHandlers: Array<StageHandlerInternal>) {
    open val ecInstance: EChartsType
    open val api: ExtensionAPI
    open var unfinished: Boolean
    open var _dataProcessorHandlers: Any
    open var _visualHandlers: Any
    open var _allHandlers: Any
    open var _stageTaskMap: Any
    open var _pipelineMap: Any
    open fun restoreData(ecModel: GlobalModel, payload: Payload)
    open fun getPerformArgs(task: GeneralTask, isBlock: Boolean = definedExternally): `T$10`
    open fun getPipeline(pipelineId: String): Pipeline
    open fun updateStreamModes(seriesModel: SeriesModel<SeriesOption__0 /* SeriesOption__0 & SeriesLargeOptionMixin */>, view: ChartView)
    open fun restorePipelines(ecModel: GlobalModel)
    open fun prepareStageTasks()
    open fun prepareView(view: ChartView, model: SeriesModel__0, ecModel: GlobalModel, api: ExtensionAPI)
    open fun performDataProcessorTasks(ecModel: GlobalModel, payload: Payload = definedExternally)
    open fun performVisualTasks(ecModel: GlobalModel, payload: Payload = definedExternally, opt: PerformStageTaskOpt = definedExternally)
    open var _performStageTasks: Any
    open fun performSeriesTasks(ecModel: GlobalModel)
    open fun plan()
    open fun updatePayload(task: Task<Any /* SeriesTaskContext | OverallTaskContext */>, payload: Payload)
    open fun updatePayload(task: Task<Any /* SeriesTaskContext | OverallTaskContext */>, payload: String /* "remain" */)
    open var _createSeriesStageTask: Any
    open var _createOverallStageTask: Any
    open var _pipe: Any

    companion object {
        fun wrapStageHandler(stageHandler: StageHandler, visualType: String /* "layout" | "visual" */): StageHandlerInternal
        fun wrapStageHandler(stageHandler: StageHandlerOverallReset, visualType: String /* "layout" | "visual" */): StageHandlerInternal
    }
}

external open class ChartView {
    open fun incrementalPrepareRender(seriesModel: SeriesModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload)
    open fun incrementalRender(params: StageHandlerProgressParams, seriesModel: SeriesModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload)
    open fun updateTransform(seriesModel: SeriesModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload): dynamic /* Unit | `T$9` */
    open fun containPoint(point: Array<Number>, seriesModel: SeriesModel__0): Boolean
    open fun filterForExposedEvent(eventType: String, query: EventQueryItem, targetEl: Element__0, packedEvent: ECActionEvent): Boolean
    open fun filterForExposedEvent(eventType: String, query: EventQueryItem, targetEl: Element__0, packedEvent: ECElementEvent): Boolean
    open var type: String
    open val group: ViewRootGroup
    open val uid: String
    open val renderTask: SeriesTask
    open var ignoreLabelLineUpdate: Boolean
    open var __alive: Boolean
    open var __model: SeriesModel__0
    open var __id: String
    open fun init(ecModel: GlobalModel, api: ExtensionAPI)
    open fun render(seriesModel: SeriesModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload)
    open fun highlight(seriesModel: SeriesModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload)
    open fun downplay(seriesModel: SeriesModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload)
    open fun remove(ecModel: GlobalModel, api: ExtensionAPI)
    open fun dispose(ecModel: GlobalModel, api: ExtensionAPI)
    open fun updateView(seriesModel: SeriesModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload)
    open fun updateLayout(seriesModel: SeriesModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload)
    open fun updateVisual(seriesModel: SeriesModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload)
    open fun eachRendered(cb: (el: Element__0) -> Any)

    companion object {
        var protoInitialize: Unit
        fun markUpdateMethod(payload: Payload, methodName: String /* "incrementalPrepareRender" | "incrementalRender" | "updateTransform" | "containPoint" | "filterForExposedEvent" | "type" | "group" | "uid" | "renderTask" | "ignoreLabelLineUpdate" | "__alive" | "__model" | "__id" | "protoInitialize" | "init" | "render" | "highlight" | "downplay" | "remove" | "dispose" | "updateView" | "updateLayout" | "updateVisual" | "eachRendered" | "markUpdateMethod" | "registerClass" */)
        var registerClass: (clz: Constructor) -> Constructor
    }
}

external var availableMethods: Array<Nothing?>

external open class ExtensionAPI(ecInstance: EChartsType) : EChartsType {
    open fun getCoordinateSystems(): Array<CoordinateSystemMaster>
    open fun getComponentByElement(el: Element__0): ComponentModel__0
    open fun enterEmphasis(el: Element__0, highlightDigit: Number = definedExternally)
    open fun leaveEmphasis(el: Element__0, highlightDigit: Number = definedExternally)
    open fun enterSelect(el: Element__0)
    open fun leaveSelect(el: Element__0)
    open fun enterBlur(el: Element__0)
    open fun leaveBlur(el: Element__0)
    open fun getViewOfComponentModel(componentModel: ComponentModel__0): ComponentView
    open fun getViewOfSeriesModel(seriesModel: SeriesModel__0): ChartView
    open fun getModel(): GlobalModel
}

external object AXIS_TYPES {
    val value: Number /* 1 */
    val category: Number /* 1 */
    val time: Number /* 1 */
    val log: Number /* 1 */
}

external interface `T$11` {
    var maxWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ellipsis: String?
        get() = definedExternally
        set(value) = definedExternally
    var placeholder: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$12` {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AxisBaseOptionCommon : ComponentOption, AnimationOptionMixin {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inverse: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var nameLocation: String? /* "start" | "middle" | "end" */
        get() = definedExternally
        set(value) = definedExternally
    var nameRotate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var nameTruncate: `T$11`?
        get() = definedExternally
        set(value) = definedExternally
    var nameTextStyle: AxisNameTextStyleOption?
        get() = definedExternally
        set(value) = definedExternally
    var nameGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var triggerEvent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: `T$12`?
        get() = definedExternally
        set(value) = definedExternally
    var axisLabel: AxisLabelBaseOption?
        get() = definedExternally
        set(value) = definedExternally
    var axisPointer: CommonAxisPointerOption?
        get() = definedExternally
        set(value) = definedExternally
    var axisLine: AxisLineOption?
        get() = definedExternally
        set(value) = definedExternally
    var axisTick: AxisTickOption?
        get() = definedExternally
        set(value) = definedExternally
    var minorTick: MinorTickOption?
        get() = definedExternally
        set(value) = definedExternally
    var splitLine: SplitLineOption?
        get() = definedExternally
        set(value) = definedExternally
    var minorSplitLine: MinorSplitLineOption?
        get() = definedExternally
        set(value) = definedExternally
    var splitArea: SplitAreaOption?
        get() = definedExternally
        set(value) = definedExternally
    var min: dynamic /* Number? | OrdinalNumber? | String? | Date? | "dataMin" | ((extent: `T$13`) -> dynamic)? */
        get() = definedExternally
        set(value) = definedExternally
    var max: dynamic /* Number? | OrdinalNumber? | String? | Date? | "dataMax" | ((extent: `T$13`) -> dynamic)? */
        get() = definedExternally
        set(value) = definedExternally
    var startValue: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface NumericAxisBaseOptionCommon : AxisBaseOptionCommon {
    var boundaryGap: dynamic /* JsTuple<dynamic, dynamic> */
        get() = definedExternally
        set(value) = definedExternally
    var splitNumber: Number?
        get() = definedExternally
        set(value) = definedExternally
    var interval: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minInterval: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxInterval: Number?
        get() = definedExternally
        set(value) = definedExternally
    var alignTicks: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CategoryAxisBaseOption : AxisBaseOptionCommon {
    override var type: String? /* "category" */
        get() = definedExternally
        set(value) = definedExternally
    var boundaryGap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<dynamic /* String | Number | `T$15` */>?
        get() = definedExternally
        set(value) = definedExternally
    var deduplication: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var axisTick: AxisTickOption? /* AxisTickOption? & `T$16`? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ValueAxisBaseOption : NumericAxisBaseOptionCommon {
    override var type: String? /* "value" */
        get() = definedExternally
        set(value) = definedExternally
    var scale: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LogAxisBaseOption : NumericAxisBaseOptionCommon {
    override var type: String? /* "log" */
        get() = definedExternally
        set(value) = definedExternally
    var logBase: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TimeAxisBaseOption : NumericAxisBaseOptionCommon {
    override var type: String? /* "time" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface AxisNameTextStyleOption : TextCommonOption {
    var rich: Dictionary<TextCommonOption>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AxisLineOption {
    var show: dynamic /* Boolean? | "auto" */
        get() = definedExternally
        set(value) = definedExternally
    var onZero: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var onZeroAxisIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var symbol: dynamic /* String? | JsTuple<String, String> */
        get() = definedExternally
        set(value) = definedExternally
    var symbolSize: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var symbolOffset: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AxisTickOption {
    var show: dynamic /* Boolean? | "auto" */
        get() = definedExternally
        set(value) = definedExternally
    var inside: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var length: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var customValues: Array<dynamic /* Number | String | Date */>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LabelFormatters {
    var value: dynamic /* AxisLabelValueFormatter | String */
        get() = definedExternally
        set(value) = definedExternally
    var log: dynamic /* AxisLabelValueFormatter | String */
        get() = definedExternally
        set(value) = definedExternally
    var category: dynamic /* AxisLabelCategoryFormatter | String */
        get() = definedExternally
        set(value) = definedExternally
    var time: dynamic /* String | (value: Number, index: Number, extra: `T$165`) -> String | `T$166` */
        get() = definedExternally
        set(value) = definedExternally
}

external interface AxisLabelBaseOption /*: Omit<TextCommonOption, String "color" >*/ {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var inside: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rotate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showMinLabel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showMaxLabel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var alignMinLabel: String? /* "left" | "center" | "right" */
        get() = definedExternally
        set(value) = definedExternally
    var alignMaxLabel: String? /* "left" | "center" | "right" */
        get() = definedExternally
        set(value) = definedExternally
    var verticalAlignMinLabel: String? /* "top" | "middle" | "bottom" */
        get() = definedExternally
        set(value) = definedExternally
    var verticalAlignMaxLabel: String? /* "top" | "middle" | "bottom" */
        get() = definedExternally
        set(value) = definedExternally
    var margin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rich: Dictionary<TextCommonOption>?
        get() = definedExternally
        set(value) = definedExternally
    var hideOverlap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var customValues: Array<dynamic /* Number | String | Date */>?
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* ColorString? | ((value: dynamic /* String | Number */, index: Number) -> ColorString)? */
        get() = definedExternally
        set(value) = definedExternally
    var overflow: String? /* "break" | "breakAll" | "truncate" | "none" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface AxisLabelOption<TType : Any> : AxisLabelBaseOption {
    var formatter: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MinorTickOption {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var splitNumber: Number?
        get() = definedExternally
        set(value) = definedExternally
    var length: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SplitLineOption {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var interval: dynamic /* "auto" | Number? | ((index: Number, value: String) -> Boolean)? */
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: LineStyleOption<dynamic /* ColorString | LinearGradientObject | RadialGradientObject | ImagePatternObject | SVGPatternObject | Array<dynamic /* ColorString | LinearGradientObject | RadialGradientObject | ImagePatternObject | SVGPatternObject */> */>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MinorSplitLineOption {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SplitAreaOption {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var interval: dynamic /* "auto" | Number? | ((index: Number, value: String) -> Boolean)? */
        get() = definedExternally
        set(value) = definedExternally
    var areaStyle: AreaStyleOption<Array<dynamic /* ColorString | LinearGradientObject | RadialGradientObject | ImagePatternObject | SVGPatternObject */>>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class AxisModelCommonMixin<Opt> : Model<Opt> {
    open var axis: Axis
    open fun getNeedCrossZero(): Boolean
    open fun getCoordSysModel(): CoordinateSystemHostModel
}

external interface `T$17` {
    var categories: Array<dynamic /* String | Number */>?
        get() = definedExternally
        set(value) = definedExternally
    var needCollect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var deduplication: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class OrdinalMeta(opt: `T$17`) {
    open val categories: Array<dynamic /* String | Number */>
    open var _needCollect: Any
    open var _deduplication: Any
    open var _map: Any
    open val uid: Number
    open fun getOrdinal(category: String): OrdinalNumber
    open fun getOrdinal(category: Number): OrdinalNumber
    open fun parseAndCollect(category: String): OrdinalNumber
    open fun parseAndCollect(category: Number): OrdinalNumber
    open var _getOrCreateMap: Any

    companion object {
        fun createByAxisModel(axisModel: Model__0): OrdinalMeta
    }
}

external fun registerImpl(name: String, impl: Any)

external interface `T$18` {
    var FILTER: Number
    var SERIES_FILTER: Number
    var STATISTIC: Number
}

external interface `T$19` {
    var LAYOUT: Number
    var PROGRESSIVE_LAYOUT: Number
    var GLOBAL: Number
    var CHART: Number
    var POST_CHART_LAYOUT: Number
    var COMPONENT: Number
    var BRUSH: Number
    var CHART_ITEM: Number
    var ARIA: Number
    var DECAL: Number
}

external interface `T$20` {
    var PROCESSOR: `T$18`
    var VISUAL: `T$19`
}

external object extensionRegisters {
    var registerPreprocessor: Any
    var registerProcessor: Any
    var registerPostInit: Any
    var registerPostUpdate: Any
    var registerUpdateLifecycle: Any
    var registerAction: Any
    var registerCoordinateSystem: Any
    var registerLayout: Any
    var registerVisual: Any
    var registerTransform: Any
    var registerLoading: Any
    var registerMap: Any
    var registerImpl: Any
    var PRIORITY: `T$20`
    var ComponentModel: Any
    var ComponentView: Any
    var SeriesModel: Any
    var ChartView: Any
    fun registerComponentModel(ComponentModelClass: Constructor)
    fun registerComponentView(ComponentViewClass: Any)
    fun registerSeriesModel(SeriesModelClass: Constructor)
    fun registerChartView(ChartViewClass: Any)
    fun registerSubTypeDefaulter(componentType: String, defaulter: SubTypeDefaulter)
    fun registerPainter(painterType: String, PainterCtor: Any)
}

external interface EChartsExtension {
    var install: EChartsExtensionInstaller
}

external fun use(ext: EChartsExtensionInstaller)

external fun use(ext: EChartsExtension)

external fun use(ext: Array<Any /* EChartsExtensionInstaller | EChartsExtension */>)

external interface AxisModelExtendedInCreator {
    fun getCategories(rawData: Boolean = definedExternally): dynamic /* Array<dynamic /* String | Number */> | Array<dynamic /* String | Number | `T$15` */> */
    fun getOrdinalMeta(): OrdinalMeta
}

external interface AxisBaseModel<T : AxisBaseOptionCommon> : ComponentModel<T>, /* AxisModelCommonMixin<T>,*/ AxisModelExtendedInCreator {
    var axis: Axis
}

external interface AxisBaseModel__0 : AxisBaseModel<AxisBaseOptionCommon>

external interface `T$21` {
    var level: Number?
        get() = definedExternally
        set(value) = definedExternally
    var formattedLabel: String
    var rawLabel: String
    var tickValue: Number
}

external interface `T$22` {
    var labels: Array<`T$21`>
    var labelCategoryInterval: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external fun createAxisLabels(axis: Axis): `T$22`

external fun calculateCategoryInterval(axis: Axis): Number

external interface ScaleRawExtentResult {
    val min: Number
    val max: Number
    val minFixed: Boolean
    val maxFixed: Boolean
    val isBlank: Boolean
}

external open class ScaleRawExtentInfo(scale: Scale__0, model: AxisBaseModel__0, originalExtent: Array<Number>) {
    open var _needCrossZero: Any
    open var _isOrdinal: Any
    open var _axisDataLen: Any
    open var _boundaryGapInner: Any
    open var _modelMinRaw: Any
    open var _modelMaxRaw: Any
    open var _modelMinNum: Any
    open var _modelMaxNum: Any
    open var _dataMin: Any
    open var _dataMax: Any
    open var _determinedMin: Any
    open var _determinedMax: Any
    open val frozen: Boolean
    open var _prepareParams: Any
    open fun calculate(): ScaleRawExtentResult
    open fun modifyDataMinMax(minMaxName: String /* "min" | "max" */, param_val: Number)
    open fun setDeterminedMinMax(minMaxName: String /* "min" | "max" */, param_val: Number)
    open fun freeze()
}

external interface `T$23` {
    var splitNumber: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fixMin: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var fixMax: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var minInterval: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxInterval: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Scale<SETTING : Dictionary<Any>>(setting: SETTING = definedExternally) {
    open var type: String
    open var _setting: Any
    open var _extent: dynamic /* JsTuple<Number, Number> */
    open var _isBlank: Any
    open val rawExtentInfo: ScaleRawExtentInfo
    open fun <KEY : Any> getSetting(name: KEY): Any
    open fun parse(param_val: String?): Number
    open fun parse(param_val: Number?): Number
    open fun parse(param_val: Date?): Number
    open fun contain(param_val: Number): Boolean
    open fun contain(param_val: String): Boolean
    open fun contain(param_val: Date): Boolean
    open fun normalize(param_val: Number): Number
    open fun normalize(param_val: String): Number
    open fun normalize(param_val: Date): Number
    open fun scale(param_val: Number): Number
    open fun unionExtent(other: Any /* JsTuple<Number, Number> */)
    open fun unionExtentFromData(data: SeriesData__0, dim: DimensionName)
    open fun unionExtentFromData(data: SeriesData__0, dim: DimensionIndex)
    open fun getExtent(): dynamic /* JsTuple<Number, Number> */
    open fun setExtent(start: Number, end: Number)
    open fun isInExtentRange(value: Number): Boolean
    open fun isBlank(): Boolean
    open fun setBlank(isBlank: Boolean)
    open fun calcNiceTicks(splitNumber: Number = definedExternally, minInterval: Number = definedExternally, maxInterval: Number = definedExternally)
    open fun calcNiceExtent(opt: `T$23` = definedExternally)
    open fun getLabel(tick: ScaleTick): String
    open fun getTicks(): Array<ScaleTick>
    open fun getMinorTicks(splitNumber: Number): Array<Array<Number>>

    companion object {
        var registerClass: (clz: Constructor) -> Constructor
        var getClass: (componentMainType: Nothing? /* Nothing? & String */, subType: ComponentSubType, throwWhenNotFound: Boolean) -> Constructor
    }
}

external open class Scale__0 : Scale<Dictionary<Any>>

external interface TickCoord {
    var coord: Number
    var tickValue: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$24` {
    var tickModel: Model__0?
        get() = definedExternally
        set(value) = definedExternally
    var clamp: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external open class Axis(dim: DimensionName, scale: Scale__0, extent: Any /* JsTuple<Number, Number> */) {
    open var type: Any
    open val dim: DimensionName
    open var scale: Scale__0
    open var _extent: Any
    open var model: AxisBaseModel__0
    open var onBand: Boolean
    open var inverse: Any
    open fun contain(coord: Number): Boolean
    open fun containData(data: Number): Boolean
    open fun containData(data: String): Boolean
    open fun containData(data: Date): Boolean
    open fun getExtent(): dynamic /* JsTuple<Number, Number> */
    open fun getPixelPrecision(dataExtent: Any /* JsTuple<Number, Number> */ = definedExternally): Number
    open fun setExtent(start: Number, end: Number)
    open fun dataToCoord(data: Number, clamp: Boolean = definedExternally): Number
    open fun dataToCoord(data: Number): Number
    open fun dataToCoord(data: String, clamp: Boolean = definedExternally): Number
    open fun dataToCoord(data: String): Number
    open fun dataToCoord(data: Date, clamp: Boolean = definedExternally): Number
    open fun dataToCoord(data: Date): Number
    open fun coordToData(coord: Number, clamp: Boolean = definedExternally): Number
    open fun pointToData(point: Array<Number>, clamp: Boolean = definedExternally): Number
    open fun getTicksCoords(opt: `T$24` = definedExternally): Array<TickCoord>
    open fun getMinorTicksCoords(): Array<Array<TickCoord>>
    open fun getViewLabels(): Any
    open fun getLabelModel(): Model<Any>
    open fun getTickModel(): Model__0
    open fun getBandWidth(): Number
    open var getRotate: () -> Number
    open fun calculateCategoryInterval(): ReturnType<Any>
}

external interface MarkerPositionOption {
    var x: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var y: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var coord: Array<dynamic /* Number | OrdinalNumber | String | Date | "average" | "min" | "max" | "median" */>?
        get() = definedExternally
        set(value) = definedExternally
    var xAxis: dynamic /* Number? | OrdinalNumber? | String? | Date? */
        get() = definedExternally
        set(value) = definedExternally
    var yAxis: dynamic /* Number? | OrdinalNumber? | String? | Date? */
        get() = definedExternally
        set(value) = definedExternally
    var radiusAxis: dynamic /* Number? | OrdinalNumber? | String? | Date? */
        get() = definedExternally
        set(value) = definedExternally
    var angleAxis: dynamic /* Number? | OrdinalNumber? | String? | Date? */
        get() = definedExternally
        set(value) = definedExternally
    var type: String? /* "average" | "min" | "max" | "median" */
        get() = definedExternally
        set(value) = definedExternally
    var valueIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var valueDim: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface MarkerOption : ComponentOption, AnimationOptionMixin {
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: CommonTooltipOption<Any>? /* CommonTooltipOption<Any>? & `T$25`? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface MarkAreaStateOption {
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MarkAreaDataItemOptionBase : MarkAreaStateOption, StatesOptionMixin<MarkAreaStateOption, StatesMixinBase> {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MarkArea1DDataItemOption : MarkAreaDataItemOptionBase {
    var xAxis: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yAxis: Number?
        get() = definedExternally
        set(value) = definedExternally
    var type: String? /* "average" | "min" | "max" | "median" */
        get() = definedExternally
        set(value) = definedExternally
    var valueIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var valueDim: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MarkArea2DDataItemDimOption : MarkAreaDataItemOptionBase, MarkerPositionOption

external interface MarkAreaOption : MarkerOption, MarkAreaStateOption, StatesOptionMixin<MarkAreaStateOption, StatesMixinBase> {
    override var mainType: String? /* "markArea" */
        get() = definedExternally
        set(value) = definedExternally
    var precision: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var data: Array<dynamic /* MarkArea1DDataItemOption | JsTuple<MarkArea2DDataItemDimOption, MarkArea2DDataItemDimOption> */>?
        get() = definedExternally
        set(value) = definedExternally
}

external var dimPermutations: dynamic /* JsTuple<dynamic, dynamic, dynamic, dynamic> */

external interface BaseBarSeriesOption<StateOption, ExtraStateOption/* : StatesMixinBase*/> : SeriesOption<StateOption, ExtraStateOption>, SeriesOnCartesianOptionMixin, SeriesOnPolarOptionMixin {
    var barMinHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var barMinAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var barMaxWidth: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var barMinWidth: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var barWidth: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var barGap: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var barCategoryGap: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var largeThreshold: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LayoutRect : BoundingRect {
    var margin: Array<Number>
}

external interface `T$27` {
    var width: Number
    var height: Number
}

external fun getLayoutRect(positionInfo: BoxLayoutOptionMixin /* BoxLayoutOptionMixin & `T$26` */, containerRect: `T$27`, margin: Number = definedExternally): LayoutRect

external fun getLayoutRect(positionInfo: BoxLayoutOptionMixin /* BoxLayoutOptionMixin & `T$26` */, containerRect: `T$27`): LayoutRect

external fun getLayoutRect(positionInfo: BoxLayoutOptionMixin /* BoxLayoutOptionMixin & `T$26` */, containerRect: `T$27`, margin: Array<Number> = definedExternally): LayoutRect

external interface GridOption : ComponentOption, BoxLayoutOptionMixin, ShadowOptionMixin {
    override var mainType: String? /* "grid" */
        get() = definedExternally
        set(value) = definedExternally
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var containLabel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var borderWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var borderColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PolarOption : ComponentOption, CircleLayoutOptionMixin {
    override var mainType: String? /* "polar" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface BrushCoverConfig {
    var brushType: String /* "polygon" | "rect" | "lineX" | "lineY" */
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var range: dynamic /* BrushDimensionMinMax? | Array<BrushDimensionMinMax>? */
        get() = definedExternally
        set(value) = definedExternally
    var panelId: String?
        get() = definedExternally
        set(value) = definedExternally
    var brushMode: String? /* "single" | "multiple" */
        get() = definedExternally
        set(value) = definedExternally
    var brushStyle: dynamic /* typealias Pick = dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var transformable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var removeOnClick: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var z: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface NameMap {
    @nativeGetter
    operator fun get(regionName: String): String?
    @nativeSetter
    operator fun set(regionName: String, value: String)
}

external interface `T$28` {
    var left: Number
    var top: Number
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GeoSpecialAreas {
    @nativeGetter
    operator fun get(areaName: String): `T$28`?
    @nativeSetter
    operator fun set(areaName: String, value: `T$28`)
}

external interface GeoJSON : GeoJSONFeatureCollection<dynamic /* GeoJSONGeometryPoint | GeoJSONGeometryMultiPoint | GeoJSONGeometryLineString | GeoJSONGeometryMultiLineString | GeoJSONGeometryPolygon | GeoJSONGeometryMultiPolygon */>

external interface GeoJSONCompressed : GeoJSONFeatureCollection<dynamic /* GeoJSONGeometryPolygonCompressed | GeoJSONGeometryMultiPolygonCompressed | GeoJSONGeometryLineStringCompressed | GeoJSONGeometryMultiLineStringCompressed */> {
    var UTF8Encoding: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var UTF8Scale: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GeoJSONFeatureCollection<G> {
    var type: String /* "FeatureCollection" */
    var features: Array<GeoJSONFeature<G>>
}

external interface `T$29` {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var cp: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}

external interface GeoJSONFeature<G> {
    var type: String /* "Feature" */
    var id: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var properties: `T$29`
    var geometry: G
}

external interface GeoJSONGeometryPoint {
    var type: String /* "Point" */
    var coordinates: Array<Number>
}

external interface GeoJSONGeometryMultiPoint {
    var type: String /* "MultiPoint" */
    var coordinates: Array<Array<Number>>
}

external interface GeoJSONGeometryLineString {
    var type: String /* "LineString" */
    var coordinates: Array<Array<Number>>
}

external interface GeoJSONGeometryLineStringCompressed {
    var type: String /* "LineString" */
    var coordinates: String
    var encodeOffsets: Array<Number>
}

external interface GeoJSONGeometryMultiLineString {
    var type: String /* "MultiLineString" */
    var coordinates: Array<Array<Array<Number>>>
}

external interface GeoJSONGeometryMultiLineStringCompressed {
    var type: String /* "MultiLineString" */
    var coordinates: Array<String>
    var encodeOffsets: Array<Array<Number>>
}

external interface GeoJSONGeometryPolygon {
    var type: String /* "Polygon" */
    var coordinates: Array<Array<Array<Number>>>
}

external interface GeoJSONGeometryPolygonCompressed {
    var type: String /* "Polygon" */
    var coordinates: Array<String>
    var encodeOffsets: Array<Array<Number>>
}

external interface GeoJSONGeometryMultiPolygon {
    var type: String /* "MultiPolygon" */
    var coordinates: Array<Array<Array<Array<Number>>>>
}

external interface GeoJSONGeometryMultiPolygonCompressed {
    var type: String /* "MultiPolygon" */
    var coordinates: Array<Array<String>>
    var encodeOffsets: Array<Array<Array<Number>>>
}

external interface `T$30` {
    var boundingRect: BoundingRect
    var regions: Array<Region>
    var regionsMap: HashMap__1<Region>
}

external interface GeoResource {
    val type: String /* "geoJSON" | "geoSVG" */
    fun load(nameMap: NameMap, nameProperty: String): `T$30`
}

external interface ProjectionStream {
    fun point(x: Number, y: Number)
    fun lineStart()
    fun lineEnd()
    fun polygonStart()
    fun polygonEnd()
    fun sphere()
}

external interface GeoProjection {
    fun project(point: Array<Number>): Array<Number>
    fun unproject(point: Array<Number>): Array<Number>
    val stream: ((outStream: ProjectionStream) -> ProjectionStream)?
}

external open class Region(name: String) {
    open val name: String
    open val type: String /* "geoJSON" | "geoSVG" */
    open var _center: Array<Number>
    open var _rect: BoundingRect
    open fun setCenter(center: Array<Number>)
    open fun getCenter(): Array<Number>
    open fun calcCenter(): Array<Number>
}

external open class GeoJSONPolygonGeometry(exterior: Array<Array<Number>>, interiors: Array<Array<Array<Number>>>) {
    open val type: Any = definedExternally /* "polygon" */
    open var exterior: Array<Array<Number>>
    open var interiors: Array<Array<Array<Number>>>
}

external open class GeoJSONLineStringGeometry(points: Array<Array<Array<Number>>>) {
    open val type: Any = definedExternally /* "linestring" */
    open var points: Array<Array<Array<Number>>>
}

external open class GeoJSONRegion(name: String, geometries: Array<Any /* GeoJSONPolygonGeometry | GeoJSONLineStringGeometry */>, cp: Any) : Region {
    open val geometries: Array<dynamic /* GeoJSONPolygonGeometry | GeoJSONLineStringGeometry */>
    open var properties: Any
    override fun calcCenter(): Array<Number>
    open fun getBoundingRect(projection: GeoProjection = definedExternally): BoundingRect
    open fun contain(coord: Array<Number>): Boolean
    open fun transformTo(x: Number, y: Number, width: Number, height: Number)
    open fun cloneShallow(name: String): GeoJSONRegion
}

external fun createSymbol(symbolType: String, x: Number, y: Number, w: Number, h: Number, color: ColorString = definedExternally, keepAspect: Boolean = definedExternally): Path__0 /* Path__0 & `T$172` */

external fun createSymbol(symbolType: String, x: Number, y: Number, w: Number, h: Number): Path__0 /* Path__0 & `T$172` */

external fun createSymbol(symbolType: String, x: Number, y: Number, w: Number, h: Number, color: ColorString = definedExternally): Path__0 /* Path__0 & `T$172` */

external fun createSymbol(symbolType: String, x: Number, y: Number, w: Number, h: Number, color: LinearGradientObject = definedExternally, keepAspect: Boolean = definedExternally): Path__0 /* Path__0 & `T$172` */

external fun createSymbol(symbolType: String, x: Number, y: Number, w: Number, h: Number, color: LinearGradientObject = definedExternally): Path__0 /* Path__0 & `T$172` */

external fun createSymbol(symbolType: String, x: Number, y: Number, w: Number, h: Number, color: RadialGradientObject = definedExternally, keepAspect: Boolean = definedExternally): Path__0 /* Path__0 & `T$172` */

external fun createSymbol(symbolType: String, x: Number, y: Number, w: Number, h: Number, color: RadialGradientObject = definedExternally): Path__0 /* Path__0 & `T$172` */

external fun createSymbol(symbolType: String, x: Number, y: Number, w: Number, h: Number, color: ImagePatternObject = definedExternally, keepAspect: Boolean = definedExternally): Path__0 /* Path__0 & `T$172` */

external fun createSymbol(symbolType: String, x: Number, y: Number, w: Number, h: Number, color: ImagePatternObject = definedExternally): Path__0 /* Path__0 & `T$172` */

external fun createSymbol(symbolType: String, x: Number, y: Number, w: Number, h: Number, color: SVGPatternObject = definedExternally, keepAspect: Boolean = definedExternally): Path__0 /* Path__0 & `T$172` */

external fun createSymbol(symbolType: String, x: Number, y: Number, w: Number, h: Number, color: SVGPatternObject = definedExternally): Path__0 /* Path__0 & `T$172` */

external open class ItemStyleMixin {
    open fun getItemStyle(self: Model__0, excludes: Array<Nothing?> = definedExternally, includes: Array<Nothing?> = definedExternally): dynamic /* typealias ItemStyleProps = dynamic */
}

external open class LineStyleMixin {
    open fun getLineStyle(self: Model__0, excludes: Array<Nothing?> = definedExternally): dynamic /* typealias LineStyleProps = dynamic */
}

external interface LegendSelectorButtonOption {
    var type: String? /* "all" | "inverse" */
        get() = definedExternally
        set(value) = definedExternally
    var title: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$31` {
    var borderWidth: String /* "auto" */
}

external interface LegendItemStyleOption  /*: ExtendPropertyType<ItemStyleOption__0, String "inherit" , `T$31`>*/

external interface `T$32` {
    var width: String /* "auto" */
}

external interface LegendLineStyleOption /*: ExtendPropertyType<LineStyleOption__0, String  "inherit", `T$32`>  */{
    var inactiveColor: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var inactiveWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LegendStyleOption {
    var icon: String?
        get() = definedExternally
        set(value) = definedExternally
    var inactiveColor: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var inactiveBorderColor: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var inactiveBorderWidth: dynamic /* Number? | "auto" */
        get() = definedExternally
        set(value) = definedExternally
    var formatter: dynamic /* String? | ((name: String) -> String)? */
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: LegendItemStyleOption?
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: LegendLineStyleOption?
        get() = definedExternally
        set(value) = definedExternally
    var textStyle: LabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var symbolRotate: dynamic /* Number? | "inherit" */
        get() = definedExternally
        set(value) = definedExternally
    var symbolKeepAspect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DataItem : LegendStyleOption {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    override var icon: String?
        get() = definedExternally
        set(value) = definedExternally
    override var textStyle: LabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LegendTooltipFormatterParams {
    @nativeGetter
    operator fun get(key: String): dynamic? /* JsTuple<String> */
    @nativeSetter
    operator fun set(key: String, value: dynamic /* JsTuple<String> */)
    var componentType: String /* "legend" */
    var legendIndex: Number
    var name: String
}

external interface LegendIconParams {
    var itemWidth: Number
    var itemHeight: Number
    var icon: String
    var iconRotate: dynamic /* Number | "inherit" */
        get() = definedExternally
        set(value) = definedExternally
    var symbolKeepAspect: Boolean
    var itemStyle: PathStyleProps
    var lineStyle: dynamic /* typealias LineStyleProps = dynamic */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$33` {
    var selectorLabel: LabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LegendOption : ComponentOption, LegendStyleOption, BoxLayoutOptionMixin, BorderOptionMixin {
    override var mainType: String? /* "legend" */
        get() = definedExternally
        set(value) = definedExternally
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var orient: String? /* "vertical" | "horizontal" */
        get() = definedExternally
        set(value) = definedExternally
    var align: String? /* "auto" | "left" | "right" */
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var borderRadius: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var padding: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var itemGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var itemWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var itemHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var selectedMode: dynamic /* Boolean? | "single" | "multiple" */
        get() = definedExternally
        set(value) = definedExternally
    var selected: Dictionary<Boolean>?
        get() = definedExternally
        set(value) = definedExternally
    var selector: dynamic /* Array<dynamic /* LegendSelectorButtonOption | "all" | "inverse" */>? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var selectorLabel: LabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var emphasis: `T$33`?
        get() = definedExternally
        set(value) = definedExternally
    var selectorPosition: String? /* "auto" | "start" | "end" */
        get() = definedExternally
        set(value) = definedExternally
    var selectorItemGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var selectorButtonGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<dynamic /* String | DataItem */>?
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: CommonTooltipOption<LegendTooltipFormatterParams>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MapStateOption<TCbParams> {
    var itemStyle: GeoItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MapStateOption__0 : MapStateOption<Any>

external interface MapDataItemOption : MapStateOption__0, StatesOptionMixin<MapStateOption__0, StatesMixinBase>, OptionDataItemObject<dynamic /* Number | "-" */> {
    var cursor: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MapSeriesOption : SeriesOption<MapStateOption<CallbackDataParams>, StatesMixinBase>, MapStateOption<CallbackDataParams>, GeoCommonOptionMixin, SeriesOnGeoOptionMixin, BoxLayoutOptionMixin, SeriesEncodeOptionMixin {
    override var type: String? /* "map" */
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String?
        get() = definedExternally
        set(value) = definedExternally
    override var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var markLine: Any?
        get() = definedExternally
        set(value) = definedExternally
    var markPoint: Any?
        get() = definedExternally
        set(value) = definedExternally
    var markArea: Any?
        get() = definedExternally
        set(value) = definedExternally
    var mapValueCalculation: String? /* "sum" | "average" | "min" | "max" */
        get() = definedExternally
        set(value) = definedExternally
    var showLegendSymbol: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var geoCoord: Dictionary<Array<Number>>?
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<dynamic /* Number | "-" | Array<dynamic /* Number | "-" */> | MapDataItemOption */>?
        get() = definedExternally
        set(value) = definedExternally
    override var nameProperty: String?
        get() = definedExternally
        set(value) = definedExternally
    override var seriesLayoutBy: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GeoItemStyleOption<TCbParams> : ItemStyleOption<TCbParams> {
    var areaColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface GeoItemStyleOption__0 : GeoItemStyleOption<Any>

external interface GeoLabelOption : LabelOption {
    var formatter: dynamic /* String? | ((params: GeoLabelFormatterDataParams) -> String)? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface GeoStateOption {
    var itemStyle: GeoItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var label: GeoLabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GeoLabelFormatterDataParams {
    var name: String
    var status: String /* "normal" | "emphasis" | "blur" | "select" */
}

external interface RegoinOption : GeoStateOption, StatesOptionMixin<GeoStateOption, StatesMixinBase> {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var selected: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: CommonTooltipOption<GeoTooltipFormatterParams>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GeoTooltipFormatterParams {
    @nativeGetter
    operator fun get(key: String): dynamic? /* JsTuple<String> */
    @nativeSetter
    operator fun set(key: String, value: dynamic /* JsTuple<String> */)
    var componentType: String /* "geo" */
    var geoIndex: Number
    var name: String
}

external interface GeoCommonOptionMixin : RoamOptionMixin {
    var map: String
    var aspectScale: Number?
        get() = definedExternally
        set(value) = definedExternally
    var layoutCenter: Array<dynamic /* Number | String */>?
        get() = definedExternally
        set(value) = definedExternally
    var layoutSize: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var boundingCoords: Array<Array<Number>>?
        get() = definedExternally
        set(value) = definedExternally
    var nameMap: NameMap?
        get() = definedExternally
        set(value) = definedExternally
    var nameProperty: String?
        get() = definedExternally
        set(value) = definedExternally
    var projection: GeoProjection?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GeoOption : ComponentOption, BoxLayoutOptionMixin, AnimationOptionMixin, GeoCommonOptionMixin, StatesOptionMixin<GeoStateOption, StatesMixinBase>, GeoStateOption {
    override var mainType: String? /* "geo" */
        get() = definedExternally
        set(value) = definedExternally
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var regions: Array<RegoinOption>?
        get() = definedExternally
        set(value) = definedExternally
    var stateAnimation: AnimationOptionMixin?
        get() = definedExternally
        set(value) = definedExternally
    var selectedMode: dynamic /* "single" | "multiple" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var selectedMap: Dictionary<Boolean>?
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: CommonTooltipOption<GeoTooltipFormatterParams>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$34` {
    var offset: dynamic /* Array<BrushDimensionMinMax> | BrushDimensionMinMax */
        get() = definedExternally
        set(value) = definedExternally
    var xyMinMax: Array<BrushDimensionMinMax>
}

external interface BrushAreaParam : ModelFinderObject {
    var brushType: String /* "polygon" | "rect" | "lineX" | "lineY" */
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var range: dynamic /* BrushDimensionMinMax? | Array<BrushDimensionMinMax>? */
        get() = definedExternally
        set(value) = definedExternally
    var panelId: String?
        get() = definedExternally
        set(value) = definedExternally
    var coordRange: dynamic /* BrushDimensionMinMax? | Array<BrushDimensionMinMax>? */
        get() = definedExternally
        set(value) = definedExternally
    var coordRanges: Array<dynamic /* BrushDimensionMinMax | Array<BrushDimensionMinMax> */>?
        get() = definedExternally
        set(value) = definedExternally
    var __rangeOffset: `T$34`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BrushAreaParamInternal : BrushAreaParam {
    var brushMode: String /* "single" | "multiple" */
    var brushStyle: dynamic /* typealias Pick = dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var transformable: Boolean
    var removeOnClick: Boolean
    var z: Number
}

external interface `T$36` {
    var borderWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var borderColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface BrushOption : ComponentOption, ModelFinderObject {
    override var mainType: String? /* "brush" */
        get() = definedExternally
        set(value) = definedExternally
    var toolbox: Array<String? /* "polygon" | "rect" | "lineX" | "lineY" | "keep" | "clear" */>?
        get() = definedExternally
        set(value) = definedExternally
    var brushLink: dynamic /* Array<Number>? | "all" | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var throttleType: String? /* "fixRate" | "debounce" */
        get() = definedExternally
        set(value) = definedExternally
    var throttleDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inBrush: VisualOptionFixed?
        get() = definedExternally
        set(value) = definedExternally
    var outOfBrush: VisualOptionFixed?
        get() = definedExternally
        set(value) = definedExternally
    var brushType: dynamic /* "polygon" | "rect" | "lineX" | "lineY" | Boolean? | "auto" */
        get() = definedExternally
        set(value) = definedExternally
    var brushStyle: `T$36`?
        get() = definedExternally
        set(value) = definedExternally
    var transformable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var brushMode: String? /* "single" | "multiple" */
        get() = definedExternally
        set(value) = definedExternally
    var removeOnClick: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BrushSelectableArea : BrushAreaParamInternal {
    var boundingRect: BoundingRect
    var selectors: BrushCommonSelectorsForSeries
}

external interface BrushCommonSelectorsForSeries {
    fun point(itemLayout: Array<Number>): Boolean
    fun rect(itemLayout: RectLike): Boolean
}

external interface BarStateOption<TCbParams> {
    var itemStyle: BarItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* typealias Omit = dynamic */
        get() = definedExternally
        set(value) = definedExternally
}

external interface BarStateOption__0 : BarStateOption<Any>

external interface BarStatesMixin {
    var emphasis: DefaultStatesMixinEmphasis?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BarItemStyleOption<TCbParams> : ItemStyleOption<TCbParams> {
    override var borderRadius: dynamic /* Array<dynamic /* Number | String */>? | Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface BarDataItemOption : BarStateOption__0, StatesOptionMixin<BarStateOption__0, BarStatesMixin>, OptionDataItemObject<dynamic /* String? | Number? | Date? */> {
    var cursor: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BarSeriesOption : BaseBarSeriesOption<BarStateOption<CallbackDataParams>, BarStatesMixin>, BarStateOption<CallbackDataParams>, SeriesStackOptionMixin, SeriesSamplingOptionMixin, SeriesEncodeOptionMixin {
    override var type: String? /* "bar" */
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String? /* "cartesian2d" | "polar" */
        get() = definedExternally
        set(value) = definedExternally
    var clip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var roundCap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showBackground: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var startValue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundStyle: ItemStyleOption__0? /* ItemStyleOption__0? & `T$37`? */
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<dynamic /* BarDataItemOption? | String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */>?
        get() = definedExternally
        set(value) = definedExternally
    var realtimeSort: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var seriesLayoutBy: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$174` {
    var bandWidth: Number
    var offset: Number
    var offsetCenter: Number
    var width: Number
}

external interface BarGridLayoutOptionForCustomSeries {
    var count: Number
    var barWidth: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var barMaxWidth: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var barMinWidth: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var barGap: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var barCategoryGap: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface TransitionOptionMixin<T> {
    var transition: dynamic /* Any | Array<Any>? | "all" */
        get() = definedExternally
        set(value) = definedExternally
    var enterFrom: T?
        get() = definedExternally
        set(value) = definedExternally
    var leaveTo: T?
        get() = definedExternally
        set(value) = definedExternally
    var enterAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    var updateAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    var leaveAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TransitionOptionMixin__0 : TransitionOptionMixin<Record<String, Any>>

external interface TransitionBaseDuringAPI {
    fun setTransform(key: Any, param_val: Number): TransitionBaseDuringAPI /* this */
    fun getTransform(key: Any): Number
    fun setExtra(key: String, param_val: Any): TransitionBaseDuringAPI /* this */
    fun getExtra(key: String): Any
}

external interface TransitionDuringAPI<StyleOpt : Any, ShapeOpt : Any> : TransitionBaseDuringAPI {
    fun <T : Any> setShape(key: T, param_val: Any): TransitionDuringAPI<StyleOpt, ShapeOpt> /* this */
    fun <T : Any> getShape(key: T): Any
    fun <T : Any> setStyle(key: T, param_val: Any): TransitionDuringAPI<StyleOpt, ShapeOpt> /* this */
    fun <T : Any> getStyle(key: T): Any
}

external interface TransitionDuringAPI__0 : TransitionDuringAPI<Any, Any>

external interface ElementKeyframeAnimationOption<Props : Record<String, Any>> : `AnimationOption$1` {
    var loop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var keyframes: Array<Props /* Props & `T$175` */>?
        get() = definedExternally
        set(value) = definedExternally
}

external object STYLE_VISUAL_TYPE {
    val color: String /* "fill" */
    val borderColor: String /* "stroke" */
}

external object NON_STYLE_VISUAL_PROPS {
    val symbol: Number /* 1 */
    val symbolSize: Number /* 1 */
    val symbolKeepAspect: Number /* 1 */
    val legendIcon: Number /* 1 */
    val visualMeta: Number /* 1 */
    val liftZ: Number /* 1 */
    val decal: Number /* 1 */
}

external interface ShapeMorphingOption {
    var morph: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomBaseElementOption /*: Pick<Element__0, dynamic /* Any | "silent" | "ignore" | "textConfig" */>*/ {
    var type: String
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var info: CustomExtraElementInfo?
        get() = definedExternally
        set(value) = definedExternally
    var textContent: dynamic /* CustomTextOption? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var clipPath: dynamic /* CustomBaseZRPathOption__0? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var extra: Dictionary<Any>? /* Dictionary<Any>? & TransitionOptionMixin__0? */
        get() = definedExternally
        set(value) = definedExternally
    val during: ((params: TransitionBaseDuringAPI) -> Unit)?
    var enterAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    var updateAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    var leaveAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomDisplayableOption : CustomBaseElementOption /*, Pick<Displayable__0, String /* "zlevel" | "z" | "z2" | "invisible" */>*/ {
    var style: dynamic /* PathStyleProps? | ImageStyleProps? | TSpanStyleProps? | TextStyleProps? */
        get() = definedExternally
        set(value) = definedExternally
    var styleEmphasis: dynamic /* PathStyleProps? | ImageStyleProps? | TSpanStyleProps? | TextStyleProps? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var emphasis: CustomDisplayableOptionOnState?
        get() = definedExternally
        set(value) = definedExternally
    var blur: CustomDisplayableOptionOnState?
        get() = definedExternally
        set(value) = definedExternally
    var select: CustomDisplayableOptionOnState?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomDisplayableOptionOnState /*: Pick<Displayable__0, dynamic /* Any | "textConfig" | "z2" */>*/ {
    var style: dynamic /* PathStyleProps? | ImageStyleProps? | TSpanStyleProps? | TextStyleProps? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomGroupOption : CustomBaseElementOption, TransitionOptionMixin<GroupProps> {
    @nativeGetter
    operator fun get(key: String): dynamic? /* Boolean? | "byName" | "byIndex" */
    @nativeSetter
    operator fun set(key: String, value: dynamic /* Boolean? | "byName" | "byIndex" */)
    override var type: String /* "group" */
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var diffChildrenByName: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var children: Array<dynamic /* CreateCustomBuitinPathOption<String /* "circle" | "rect" | "sector" | "polygon" | "polyline" | "line" | "arc" | "bezierCurve" | "ring" | "ellipse" | "compoundPath" */> | CustomSVGPathOption | CustomImageOption | CustomTextOption | CustomGroupOption */>
    var keyframeAnimation: dynamic /* ElementKeyframeAnimationOption<GroupProps>? | Array<ElementKeyframeAnimationOption<GroupProps>>? */
        get() = definedExternally
        set(value) = definedExternally
    override var enterAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    override var updateAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    override var leaveAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomBaseZRPathOption<T/* : Dictionary<Any>*/> : CustomDisplayableOption, ShapeMorphingOption, TransitionOptionMixin<PathProps /* PathProps & `T$38`<T> */> {
    var autoBatch: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var shape: T? /* T? & TransitionOptionMixin<T>? */
        get() = definedExternally
        set(value) = definedExternally
    override var style: PathStyleProps? /* PathStyleProps? & TransitionOptionMixin<PathStyleProps>? */
        get() = definedExternally
        set(value) = definedExternally
    var keyframeAnimation: dynamic /* ElementKeyframeAnimationOption<PathProps /* PathProps & `T$38`<T> */>? | Array<ElementKeyframeAnimationOption<PathProps /* PathProps & `T$38`<T> */>>? */
        get() = definedExternally
        set(value) = definedExternally
    override var enterAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    override var leaveAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    override var updateAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomBaseZRPathOption__0 : CustomBaseZRPathOption<Dictionary<Any>>

external interface BuiltinShapes {
    var circle: CircleShapePartial
    var rect: RectShapePartial
    var sector: SectorShapePartial
    var polygon: PolygonShapePartial
    var polyline: PolylineShapePartial
    var line: LineShapePartial
    var arc: ArcShapePartial
    var bezierCurve: BezierCurveShapePartial
    var ring: RingShapePartial
    var ellipse: EllipseShapePartial
    var compoundPath: CompoundPathShapePartial
}

external interface CustomSVGPathShapeOption {
    var pathData: String?
        get() = definedExternally
        set(value) = definedExternally
    var d: String?
        get() = definedExternally
        set(value) = definedExternally
    var layout: String? /* "center" | "cover" */
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomSVGPathOption : CustomBaseZRPathOption<CustomSVGPathShapeOption> {
    override var type: String /* "path" */
}

external interface CustomBuitinPathOption<T : String> : CustomBaseZRPathOption<Any> {
    override var type: String
}

external interface CustomImageOptionOnState : CustomDisplayableOptionOnState {
    override var style: ImageStyleProps?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomImageOption : CustomDisplayableOption, TransitionOptionMixin<ImageProps> {
    override var type: String /* "image" */
    override var style: ImageStyleProps? /* ImageStyleProps? & TransitionOptionMixin<ImageStyleProps>? */
        get() = definedExternally
        set(value) = definedExternally
    override var emphasis: CustomDisplayableOptionOnState? //CustomImageOptionOnState?
        get() = definedExternally
        set(value) = definedExternally
    override var blur: CustomDisplayableOptionOnState?
        get() = definedExternally
        set(value) = definedExternally
    override var select: CustomDisplayableOptionOnState?
        get() = definedExternally
        set(value) = definedExternally
    var keyframeAnimation: dynamic /* ElementKeyframeAnimationOption<ImageProps>? | Array<ElementKeyframeAnimationOption<ImageProps>>? */
        get() = definedExternally
        set(value) = definedExternally

    override var enterAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    override var leaveAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    override var updateAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomTextOptionOnState : CustomDisplayableOptionOnState {
    override var style: TextStyleProps?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomTextOption : CustomDisplayableOption, TransitionOptionMixin<TextProps> {
    override var type: String /* "text" */
    override var style: TextStyleProps? /* TextStyleProps? & TransitionOptionMixin<TextStyleProps>? */
        get() = definedExternally
        set(value) = definedExternally
    override var emphasis: CustomDisplayableOptionOnState? //CustomTextOptionOnState?
        get() = definedExternally
        set(value) = definedExternally
    override var blur: CustomDisplayableOptionOnState?
        get() = definedExternally
        set(value) = definedExternally
    override var select: CustomDisplayableOptionOnState?
        get() = definedExternally
        set(value) = definedExternally
    var keyframeAnimation: dynamic /* ElementKeyframeAnimationOption<TextProps>? | Array<ElementKeyframeAnimationOption<TextProps>>? */
        get() = definedExternally
        set(value) = definedExternally

    override var enterAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    override var leaveAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    override var updateAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomSeriesRenderItemAPI : CustomSeriesRenderItemCoordinateSystemAPI {
    fun getWidth(): Number
    fun getHeight(): Number
    fun getZr(): ZRenderType
    fun getDevicePixelRatio(): Number
    fun value(dim: DimensionName, dataIndexInside: Number = definedExternally): dynamic /* Number | OrdinalNumber | String */
    fun value(dim: DimensionName): dynamic /* Number | OrdinalNumber | String */
    fun value(dim: DimensionIndex, dataIndexInside: Number = definedExternally): dynamic /* Number | OrdinalNumber | String */
    fun value(dim: DimensionIndex): dynamic /* Number | OrdinalNumber | String */
    fun ordinalRawValue(dim: DimensionName, dataIndexInside: Number = definedExternally): dynamic /* Number | OrdinalNumber | String */
    fun ordinalRawValue(dim: DimensionName): dynamic /* Number | OrdinalNumber | String */
    fun ordinalRawValue(dim: DimensionIndex, dataIndexInside: Number = definedExternally): dynamic /* Number | OrdinalNumber | String */
    fun ordinalRawValue(dim: DimensionIndex): dynamic /* Number | OrdinalNumber | String */
    fun style(userProps: PathStyleProps = definedExternally, dataIndexInside: Number = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun style(): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun style(userProps: PathStyleProps = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun style(userProps: ImageStyleProps = definedExternally, dataIndexInside: Number = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun style(userProps: ImageStyleProps = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun style(userProps: TSpanStyleProps = definedExternally, dataIndexInside: Number = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun style(userProps: TSpanStyleProps = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun style(userProps: TextStyleProps = definedExternally, dataIndexInside: Number = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun style(userProps: TextStyleProps = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun styleEmphasis(userProps: PathStyleProps = definedExternally, dataIndexInside: Number = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun styleEmphasis(): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun styleEmphasis(userProps: PathStyleProps = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun styleEmphasis(userProps: ImageStyleProps = definedExternally, dataIndexInside: Number = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun styleEmphasis(userProps: ImageStyleProps = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun styleEmphasis(userProps: TSpanStyleProps = definedExternally, dataIndexInside: Number = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun styleEmphasis(userProps: TSpanStyleProps = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun styleEmphasis(userProps: TextStyleProps = definedExternally, dataIndexInside: Number = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun styleEmphasis(userProps: TextStyleProps = definedExternally): dynamic /* PathStyleProps | ImageStyleProps | TSpanStyleProps | TextStyleProps */
    fun <VT : Any> visual(visualType: VT, dataIndexInside: Number = definedExternally): Any
    fun barLayout(opt: BarGridLayoutOptionForCustomSeries): BarGridLayoutResult
    fun currentSeriesIndices(): Array<Number>
    fun font(opt: dynamic /* typealias Pick = dynamic */): String
}

external interface CustomSeriesRenderItemParamsCoordSys {
    var type: String
}

external interface `L$0` {
    @nativeInvoke
    operator fun invoke(dataSize: String?, dataItem: Any? /* String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */ = definedExternally): dynamic /* Number | Array<Number> */
    @nativeInvoke
    operator fun invoke(dataSize: String?): dynamic /* Number | Array<Number> */
    @nativeInvoke
    operator fun invoke(dataSize: Number?, dataItem: Any? /* String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */ = definedExternally): dynamic /* Number | Array<Number> */
    @nativeInvoke
    operator fun invoke(dataSize: Number?): dynamic /* Number | Array<Number> */
    @nativeInvoke
    operator fun invoke(dataSize: Date?, dataItem: Any? /* String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */ = definedExternally): dynamic /* Number | Array<Number> */
    @nativeInvoke
    operator fun invoke(dataSize: Date?): dynamic /* Number | Array<Number> */
    @nativeInvoke
    operator fun invoke(dataSize: Array<Any? /* String? | Number? | Date? */>?, dataItem: Any? /* String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */ = definedExternally): dynamic /* Number | Array<Number> */
    @nativeInvoke
    operator fun invoke(dataSize: Array<Any? /* String? | Number? | Date? */>?): dynamic /* Number | Array<Number> */
}

external interface CustomSeriesRenderItemCoordinateSystemAPI {
    fun coord(data: String?, clamp: Boolean = definedExternally): Array<Number>
    fun coord(data: String?): Array<Number>
    fun coord(data: Number?, clamp: Boolean = definedExternally): Array<Number>
    fun coord(data: Number?): Array<Number>
    fun coord(data: Date?, clamp: Boolean = definedExternally): Array<Number>
    fun coord(data: Date?): Array<Number>
    fun coord(data: Array<Any? /* String? | Number? | Date? */>?, clamp: Boolean = definedExternally): Array<Number>
    fun coord(data: Array<Any? /* String? | Number? | Date? */>?): Array<Number>
    val size: `L$0`?
        get() = definedExternally
}

external interface CustomSeriesRenderItemParams {
    var context: Dictionary<Any>
    var dataIndex: Number
    var seriesId: String
    var seriesName: String
    var seriesIndex: Number
    var coordSys: CustomSeriesRenderItemParamsCoordSys
    var encode: WrapEncodeDefRet
    var dataIndexInside: Number
    var dataInsideLength: Number
    var actionType: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$39` {
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var label: LabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CustomSeriesOption : SeriesOption__1<Any>, SeriesEncodeOptionMixin, SeriesOnCartesianOptionMixin, SeriesOnPolarOptionMixin, SeriesOnSingleOptionMixin, SeriesOnGeoOptionMixin, SeriesOnCalendarOptionMixin {
    override var type: String? /* "custom" */
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String? /* String? | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var renderItem: CustomSeriesRenderItem?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var label: LabelOption?
        get() = definedExternally
        set(value) = definedExternally
    override var emphasis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var clip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var seriesLayoutBy: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$177` {
    var coordSys: CustomSeriesRenderItemParamsCoordSys
    var api: CustomSeriesRenderItemCoordinateSystemAPI
}

external interface CoordinateSystemCreator {
    var create: (ecModel: GlobalModel, api: ExtensionAPI) -> Array<CoordinateSystemMaster>
    var dimensions: Array<DimensionName>?
        get() = definedExternally
        set(value) = definedExternally
    var getDimensionsInfo: (() -> Array<dynamic /* DimensionName | DimensionDefinition */>)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$40` {
    var baseAxes: Array<Axis>
    var otherAxes: Array<Axis>
}

external interface `L$1` {
    @nativeInvoke
    operator fun invoke(ecModel: GlobalModel, finder: ParsedModelFinder, value: Number): dynamic /* Number | Array<Number> */
    @nativeInvoke
    operator fun invoke(ecModel: GlobalModel, finder: ParsedModelFinder, value: String): dynamic /* Number | Array<Number> */
    @nativeInvoke
    operator fun invoke(ecModel: GlobalModel, finder: ParsedModelFinder, value: Date): dynamic /* Number | Array<Number> */
    @nativeInvoke
    operator fun invoke(ecModel: GlobalModel, finder: ParsedModelFinder, value: Array<Any /* Number | OrdinalNumber | String | Date */>): dynamic /* Number | Array<Number> */
}

external interface `L$2` {
    @nativeInvoke
    operator fun invoke(ecModel: GlobalModel, finder: ParsedModelFinder, pixelValue: Number): dynamic /* Number | Array<Number> */
    @nativeInvoke
    operator fun invoke(ecModel: GlobalModel, finder: ParsedModelFinder, pixelValue: Array<Number>): dynamic /* Number | Array<Number> */
}

external interface CoordinateSystemMaster {
    var dimensions: Array<DimensionName>
    var model: ComponentModel__0?
        get() = definedExternally
        set(value) = definedExternally
    var update: ((ecModel: GlobalModel, api: ExtensionAPI) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    val convertToPixel: `L$1`?
        get() = definedExternally
    val convertFromPixel: `L$2`?
        get() = definedExternally
    fun containPoint(point: Array<Number>): Boolean
    var getAxes: (() -> Array<Axis>)?
        get() = definedExternally
        set(value) = definedExternally
    var axisPointerEnabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var getTooltipAxes: ((dim: dynamic /* DimensionName | "auto" */) -> `T$40`)?
        get() = definedExternally
        set(value) = definedExternally
    var getRect: (() -> RectLike)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CoordinateSystem {
    var type: String
    var master: CoordinateSystemMaster?
        get() = definedExternally
        set(value) = definedExternally
    var dimensions: Array<DimensionName>
    var model: ComponentModel__0?
        get() = definedExternally
        set(value) = definedExternally
    fun dataToPoint(data: Number, reserved: Any = definedExternally, out: Array<Number> = definedExternally): Array<Number>
    fun dataToPoint(data: Number): Array<Number>
    fun dataToPoint(data: Number, reserved: Any = definedExternally): Array<Number>
    fun dataToPoint(data: String, reserved: Any = definedExternally, out: Array<Number> = definedExternally): Array<Number>
    fun dataToPoint(data: String): Array<Number>
    fun dataToPoint(data: String, reserved: Any = definedExternally): Array<Number>
    fun dataToPoint(data: Date, reserved: Any = definedExternally, out: Array<Number> = definedExternally): Array<Number>
    fun dataToPoint(data: Date): Array<Number>
    fun dataToPoint(data: Date, reserved: Any = definedExternally): Array<Number>
    fun dataToPoint(data: Array<Any /* Number | OrdinalNumber | String | Date */>, reserved: Any = definedExternally, out: Array<Number> = definedExternally): Array<Number>
    fun dataToPoint(data: Array<Any /* Number | OrdinalNumber | String | Date */>): Array<Number>
    fun dataToPoint(data: Array<Any /* Number | OrdinalNumber | String | Date */>, reserved: Any = definedExternally): Array<Number>
    val pointToData: ((point: Array<Number>, clamp: Boolean) -> dynamic)?
    fun containPoint(point: Array<Number>): Boolean
    var getAxes: (() -> Array<Axis>)?
        get() = definedExternally
        set(value) = definedExternally
    var getAxis: ((dim: DimensionName) -> Axis)?
        get() = definedExternally
        set(value) = definedExternally
    var getBaseAxis: (() -> Axis)?
        get() = definedExternally
        set(value) = definedExternally
    var getOtherAxis: ((baseAxis: Axis) -> Axis)?
        get() = definedExternally
        set(value) = definedExternally
    var clampData: ((data: Array<dynamic /* Number | OrdinalNumber | String | Date */>, out: Array<Number>) -> Array<Number>)?
        get() = definedExternally
        set(value) = definedExternally
    var getRoamTransform: (() -> MatrixArray)?
        get() = definedExternally
        set(value) = definedExternally
    var getArea: ((tolerance: Number) -> CoordinateSystemClipArea)?
        get() = definedExternally
        set(value) = definedExternally
    var getBoundingRect: (() -> BoundingRect)?
        get() = definedExternally
        set(value) = definedExternally
    var getAxesByScale: ((scaleType: String) -> Array<Axis>)?
        get() = definedExternally
        set(value) = definedExternally
    var prepareCustoms: PrepareCustomInfo?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CoordinateSystemHostModel : ComponentModel__0 {
    var coordinateSystem: CoordinateSystemMaster?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CoordinateSystemClipArea {
    fun contain(x: Number, y: Number): Boolean
}

external open class LegendVisualProvider(getDataWithEncodedVisual: () -> SeriesData__0, getRawData: () -> SeriesData__0) {
    open var _getDataWithEncodedVisual: Any
    open var _getRawData: Any
    open fun getAllNames(): Array<String>
    open fun containName(name: String): Boolean
    open fun indexOfName(name: String): Number
    open fun getItemVisual(dataIndex: Number, key: String): Any
}

external fun makeStyleMapper(properties: Array<Array<String>>, ignoreParent: Boolean = definedExternally): (model: Model__0, excludes: Array<String>, includes: Array<String>) -> PathStyleProps

external var SERIES_UNIVERSAL_TRANSITION_PROP: Any

external interface `T$41` {
    var dataIndices: Array<Number>
    var nestestValue: Any
}

external interface `T$42` {
    var data: ArrayLike<Any>
}

external interface `T$43` {
    var data: SeriesData__0
    var type: String? /* "main" | "node" | "edge" */
        get() = definedExternally
        set(value) = definedExternally
}

external open class SeriesModel<Opt : SeriesOption__0>(option: Opt, parentModel: Model__0, ecModel: GlobalModel) : ComponentModel<Opt>, DataHost {
    override var ecModel: GlobalModel
    override var mainType: Any? /* Nothing? & String */
    override var subType: ComponentSubType
    override var componentIndex: Number
    override var id: String
    override var name: String
    open var animatedValue: Array<dynamic /* String? | Number? | Date? */>
    override fun getData(dataType: String /* "main" | "node" | "edge" */): dynamic /* SeriesData__0 | SeriesData__1 */
    open fun getData(): dynamic /* SeriesData__0 | SeriesData__1 */
    open val getShadowDim: (() -> String)?
    open fun preventIncremental(): Boolean
    open fun getTooltipPosition(dataIndex: Number): Array<Number>
    open fun getAxisTooltipData(dim: Array<DimensionName>, value: Number, baseAxis: Axis): `T$41`
    open fun getAxisTooltipData(dim: Array<DimensionName>, value: String, baseAxis: Axis): `T$41`
    open fun getAxisTooltipData(dim: Array<DimensionName>, value: Date, baseAxis: Axis): `T$41`
    open fun getMarkerPosition(value: Array<Any /* Number | OrdinalNumber | String | Date */>, dims: Any = definedExternally, startingAtTick: Boolean = definedExternally): Array<Number>
    open fun getLegendIcon(opt: LegendIconParams): dynamic /* Path__0 & `T$172` | Group */
    open fun brushSelector(dataIndex: Number, data: SeriesData__0, selectors: BrushCommonSelectorsForSeries, area: BrushSelectableArea): Boolean
    open fun enableAriaDecal()
    override var type: String
    override var defaultOption: ComponentOption
    open var seriesIndex: Number
    open var coordinateSystem: CoordinateSystem
    open var dataTask: SeriesTask
    open var pipelineContext: PipelineContext
    open var legendVisualProvider: LegendVisualProvider
    open var visualStyleAccessPath: String
    open var visualDrawType: String /* "fill" | "stroke" */
    open var visualStyleMapper: ReturnType<Any>
    open var ignoreStyleOnData: Boolean
    open var hasSymbolVisual: Boolean
    open var defaultSymbol: String
    open var legendIcon: String
    open var _selectedDataIndicesMap: Any
    open val preventUsingHoverLayer: Boolean
    override fun init(option: Opt, parentModel: Model__0, ecModel: GlobalModel)
    override fun mergeDefaultAndTheme(option: Opt, ecModel: GlobalModel)
    override fun mergeOption(newSeriesOption: Opt, ecModel: GlobalModel)
    open fun fillDataTextStyle(data: ArrayLike<Any>)
    open fun getInitialData(option: Opt, ecModel: GlobalModel): SeriesData__0
    open fun appendData(params: `T$42`)
    open fun getAllData(): Array<`T$43`>
    open fun setData(data: SeriesData__0)
    open fun getEncode(): HashMap<dynamic /* DimensionName | DimensionIndex | String | Array<dynamic /* DimensionName | DimensionIndex | String */> */, String>
    open fun getSourceManager(): SourceManager
    open fun getSource(): Source
    open fun getRawData(): SeriesData__0
    open fun getColorBy(): String /* "series" | "data" */
    open fun isColorBySeries(): Boolean
    open fun getBaseAxis(): Axis
    open fun formatTooltip(dataIndex: Number, multipleSeries: Boolean = definedExternally, dataType: String /* "main" | "node" | "edge" */ = definedExternally): ReturnType<Any>
    override fun isAnimationEnabled(): Boolean
    override fun restoreData()
    open fun getColorFromPalette(name: String, scope: Any, requestColorNum: Number = definedExternally): dynamic /* ColorString | LinearGradientObject | RadialGradientObject | ImagePatternObject | SVGPatternObject */
    open fun coordDimToDataDim(coordDim: DimensionName): Array<DimensionName>
    open fun getProgressive(): dynamic /* Number | Boolean */
    open fun getProgressiveThreshold(): Number
    open fun select(innerDataIndices: Array<Number>, dataType: String /* "main" | "node" | "edge" */ = definedExternally)
    open fun unselect(innerDataIndices: Array<Number>, dataType: String /* "main" | "node" | "edge" */ = definedExternally)
    open fun toggleSelect(innerDataIndices: Array<Number>, dataType: String /* "main" | "node" | "edge" */ = definedExternally)
    open fun getSelectedDataIndices(): Array<Number>
    open fun isSelected(dataIndex: Number, dataType: String /* "main" | "node" | "edge" */ = definedExternally): Boolean
    open fun isUniversalTransitionEnabled(): Boolean
    open var _innerSelect: Any
    open var _initSelectedMapFromData: Any

    companion object {
        var protoInitialize: Unit
        fun registerClass(clz: Constructor): Constructor
    }
}

external open class SeriesModel__0 : SeriesModel<SeriesOption__0>

external object dataCtors {
    val float: dynamic /* ArrayConstructor | Float64ArrayConstructor */
    val int: dynamic /* ArrayConstructor | Int32ArrayConstructor */
    val ordinal: ArrayConstructor
    val number: ArrayConstructor
    val time: dynamic /* ArrayConstructor | Float64ArrayConstructor */
}

external interface DataStoreDimensionDefine {
    var type: Any?
        get() = definedExternally
        set(value) = definedExternally
    var property: String?
        get() = definedExternally
        set(value) = definedExternally
    var ordinalMeta: OrdinalMeta?
        get() = definedExternally
        set(value) = definedExternally
    var ordinalOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$44` {
    var start: Number
    var end: Number
}

external interface `T$45` {
    @nativeGetter
    operator fun get(dimIdx: Number): dynamic /* JsTuple<Number, Number> */
    @nativeSetter
    operator fun set(dimIdx: Number, value: dynamic /* JsTuple<Number, Number> */)
}

external open class DataStore {
    open var _chunks: Any
    open var _provider: Any
    open var _rawExtent: Any
    open var _extent: Any
    open var _indices: Any
    open var _count: Any
    open var _rawCount: Any
    open var _dimensions: Any
    open var _dimValueGetter: Any
    open var _calcDimNameToIdx: Any
    open var defaultDimValueGetter: DimValueGetter
    open fun initData(provider: DataProvider, inputDimensions: Array<DataStoreDimensionDefine>, dimValueGetter: DimValueGetter = definedExternally)
    open fun getProvider(): DataProvider
    open fun getSource(): Source
    open fun ensureCalculationDimension(dimName: DimensionName, type: Any): DimensionIndex
    open fun collectOrdinalMeta(dimIdx: Number, ordinalMeta: OrdinalMeta)
    open fun getOrdinalMeta(dimIdx: Number): OrdinalMeta
    open fun getDimensionProperty(dimIndex: DimensionIndex): String
    open fun appendData(data: ArrayLike<Any>): Array<Number>
    open fun appendValues(values: Array<Array<Any>>, minFillLen: Number = definedExternally): `T$44`
    open var _initDataFromProvider: Any
    open fun count(): Number
    open fun get(dim: DimensionIndex, idx: Number): dynamic /* Number | OrdinalNumber | String */
    open fun getValues(idx: Number): Array<dynamic /* Number | OrdinalNumber | String */>
    open fun getValues(dimensions: Array<DimensionIndex>, idx: Number = definedExternally): Array<dynamic /* Number | OrdinalNumber | String */>
    open fun getValues(dimensions: Array<DimensionIndex>): Array<dynamic /* Number | OrdinalNumber | String */>
    open fun getByRawIndex(dim: DimensionIndex, rawIdx: Number): dynamic /* Number | OrdinalNumber | String */
    open fun getSum(dim: DimensionIndex): Number
    open fun getMedian(dim: DimensionIndex): Number
    open fun indexOfRawIndex(rawIndex: Number): Number
    open fun indicesOfNearest(dim: DimensionIndex, value: Number, maxDistance: Number = definedExternally): Array<Number>
    open fun getIndices(): ArrayLike<Number>
    open fun filter(dims: Array<DimensionIndex>, cb: FilterCb): DataStore
    open fun selectRange(range: `T$45`): DataStore
    open fun map(dims: Array<DimensionIndex>, cb: MapCb): DataStore
    open fun modify(dims: Array<DimensionIndex>, cb: MapCb)
    open var _updateDims: Any
    open fun lttbDownSample(valueDimension: DimensionIndex, rate: Number): DataStore
    open fun downSample(dimension: DimensionIndex, rate: Number, sampleValue: (frameValues: ArrayLike<Any /* Number | OrdinalNumber | String */>) -> Any, sampleIndex: (frameValues: ArrayLike<Any /* Number | OrdinalNumber | String */>, value: Any /* Number | OrdinalNumber */) -> Number): DataStore
    open fun each(dims: Array<DimensionIndex>, cb: EachCb)
    open fun getDataExtent(dim: DimensionIndex): dynamic /* JsTuple<Number, Number> */
    open var getRawIndex: (idx: Number) -> Number
    open fun getRawDataItem(idx: Number): dynamic /* String? | Number? | Date? | Dictionary<dynamic /* String? | Number? | Date? */>? | Array<dynamic /* String? | Number? | Date? */>? | OptionDataItemObject<dynamic /* String? | Number? | Date? */>? */
    open fun clone(clonedDims: Array<DimensionIndex> = definedExternally, ignoreIndices: Boolean = definedExternally): DataStore
    open var _copyCommonProps: Any
    open var _cloneIndices: Any
    open var _getRawIdxIdentity: Any
    open var _getRawIdx: Any
    open var _updateGetRawIdx: Any

    companion object {
        var internalField: Any
    }
}

external open class SeriesDimensionDefine {
    open var type: DimensionType
    open var name: String
    open var displayName: String
    open var tooltip: Boolean
    open var storeDimIndex: Number
    open var coordDim: String
    open var coordDimIndex: Number
    open var otherDims: DataVisualDimensions
    open var isExtraCoord: Boolean
    open var isCalculationCoord: Boolean
    open var defaultTooltip: Boolean
    open var ordinalMeta: OrdinalMeta
    open var createInvertedIndices: Boolean
    constructor(opt: Any? = definedExternally)
    constructor()
    constructor(opt: SeriesDimensionDefine? = definedExternally)
}

external interface `T$46` {
    var source: Source
    var dimensions: Array<SeriesDimensionDefine>
    var fullDimensionCount: Number
    var dimensionOmitted: Boolean
}

external interface `T$47` {
    var dimensions: Array<DataStoreDimensionDefine>
    var hash: String
}

external open class SeriesDataSchema(opt: `T$46`) {
    open val dimensions: Array<SeriesDimensionDefine>
    open val source: Source
    open var _fullDimCount: Any
    open var _dimNameMap: Any
    open var _dimOmitted: Any
    open fun isDimensionOmitted(): Boolean
    open var _updateDimOmitted: Any
    open fun getSourceDimensionIndex(dimName: DimensionName): DimensionIndex
    open fun getSourceDimension(dimIndex: DimensionIndex): DimensionDefinition
    open fun makeStoreSchema(): `T$47`
    open fun makeOutputDimensionNames(): Array<DimensionName>
    open fun appendCalculationDimension(dimDef: SeriesDimensionDefine)
}

external open class SourceManager {
    open var _sourceHost: Any
    open var _sourceList: Any
    open var _storeList: Any
    open var _upstreamSignList: Any
    open var _versionSignBase: Any
    open var _dirty: Any
    constructor(sourceHost: DatasetModel__0)
    constructor(sourceHost: SeriesModel__0)
    open fun dirty()
    open var _setLocalSource: Any
    open var _getVersionSign: Any
    open fun prepareSource()
    open var _createSource: Any
    open var _applyTransform: Any
    open var _isDirty: Any
    open fun getSource(sourceIndex: Number = definedExternally): Source
    open fun getSharedDataStore(seriesDimRequest: SeriesDataSchema): DataStore
    open var _innerGetDataStore: Any
    open var _getUpstreamSourceManagers: Any
    open var _getSourceMetaRawOption: Any
}

external interface DatasetOption : ComponentOption, SeriesEncodeOptionMixin {
    override var mainType: String? /* "dataset" */
        get() = definedExternally
        set(value) = definedExternally
    override var seriesLayoutBy: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var sourceHeader: dynamic /* Boolean? | "auto" | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var source: dynamic /* OptionSourceDataOriginal<dynamic /* String? | Number? | Date? */, dynamic /* VAL | Array<VAL> | OptionDataItemObject<VAL> */>? | OptionSourceDataObjectRows<dynamic /* String? | Number? | Date? */>? | OptionSourceDataArrayRows<dynamic /* String? | Number? | Date? */>? | OptionSourceDataKeyedColumns<dynamic /* String? | Number? | Date? */>? | OptionSourceDataTypedArray? */
        get() = definedExternally
        set(value) = definedExternally
    var fromDatasetIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fromDatasetId: String?
        get() = definedExternally
        set(value) = definedExternally
    var transform: dynamic /* DataTransformOption? | PipedDataTransformOption? */
        get() = definedExternally
        set(value) = definedExternally
    var fromTransformResult: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external open class DatasetModel<Opts : DatasetOption>(option: Opts, parentModel: Model__0, ecModel: GlobalModel) : ComponentModel<Opts> {
    override var type: String
    open var _sourceManager: Any
    override fun init(option: Opts, parentModel: Model__0, ecModel: GlobalModel)
    override fun mergeOption(newOption: Opts, ecModel: GlobalModel)
    open fun optionUpdated()
    open fun getSourceManager(): SourceManager

    companion object {
        var type: String
        var defaultOption: DatasetOption
    }
}

external open class DatasetModel__0 : DatasetModel<DatasetOption>

external interface SourceMetaRawOption {
    var seriesLayoutBy: Any
    var sourceHeader: dynamic /* Boolean | "auto" | Number */
        get() = definedExternally
        set(value) = definedExternally
    var dimensions: Array<dynamic /* DimensionName | DimensionDefinition */>
}

external interface Source : SourceImpl

external interface `T$48` {
    var data: dynamic /* OptionSourceDataOriginal<dynamic /* String? | Number? | Date? */, dynamic /* VAL | Array<VAL> | OptionDataItemObject<VAL> */> | OptionSourceDataObjectRows<dynamic /* String? | Number? | Date? */> | OptionSourceDataArrayRows<dynamic /* String? | Number? | Date? */> | OptionSourceDataKeyedColumns<dynamic /* String? | Number? | Date? */> | OptionSourceDataTypedArray */
        get() = definedExternally
        set(value) = definedExternally
    var sourceFormat: Any
    var seriesLayoutBy: Any?
        get() = definedExternally
        set(value) = definedExternally
    var dimensionsDefine: Array<DimensionDefinition>?
        get() = definedExternally
        set(value) = definedExternally
    var startIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dimensionsDetectedCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var metaRawOption: SourceMetaRawOption?
        get() = definedExternally
        set(value) = definedExternally
    var encodeDefine: HashMap<dynamic /* DimensionName | DimensionIndex | String | Array<dynamic /* DimensionName | DimensionIndex | String */> */, DimensionName>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class SourceImpl(fields: `T$48`) {
    open val data: dynamic /* OptionSourceDataOriginal<dynamic /* String? | Number? | Date? */, dynamic /* VAL | Array<VAL> | OptionDataItemObject<VAL> */> | OptionSourceDataObjectRows<dynamic /* String? | Number? | Date? */> | OptionSourceDataArrayRows<dynamic /* String? | Number? | Date? */> | OptionSourceDataKeyedColumns<dynamic /* String? | Number? | Date? */> | OptionSourceDataTypedArray */
    open val sourceFormat: Any
    open val seriesLayoutBy: Any
    open val dimensionsDefine: Array<DimensionDefinition>
    open val startIndex: Number
    open val dimensionsDetectedCount: Number
    open val metaRawOption: SourceMetaRawOption
}

external interface DataProvider {
    var pure: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var persistent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    fun getSource(): Source
    fun count(): Number
    fun getItem(idx: Number, out: String? = definedExternally): dynamic /* String? | Number? | Date? | Dictionary<dynamic /* String? | Number? | Date? */>? | Array<dynamic /* String? | Number? | Date? */>? | OptionDataItemObject<dynamic /* String? | Number? | Date? */>? */
    fun getItem(idx: Number): dynamic /* String? | Number? | Date? | Dictionary<dynamic /* String? | Number? | Date? */>? | Array<dynamic /* String? | Number? | Date? */>? | OptionDataItemObject<dynamic /* String? | Number? | Date? */>? */
    fun getItem(idx: Number, out: Number? = definedExternally): dynamic /* String? | Number? | Date? | Dictionary<dynamic /* String? | Number? | Date? */>? | Array<dynamic /* String? | Number? | Date? */>? | OptionDataItemObject<dynamic /* String? | Number? | Date? */>? */
    fun getItem(idx: Number, out: Date? = definedExternally): dynamic /* String? | Number? | Date? | Dictionary<dynamic /* String? | Number? | Date? */>? | Array<dynamic /* String? | Number? | Date? */>? | OptionDataItemObject<dynamic /* String? | Number? | Date? */>? */
    fun getItem(idx: Number, out: Dictionary<Any? /* String? | Number? | Date? */>? = definedExternally): dynamic /* String? | Number? | Date? | Dictionary<dynamic /* String? | Number? | Date? */>? | Array<dynamic /* String? | Number? | Date? */>? | OptionDataItemObject<dynamic /* String? | Number? | Date? */>? */
    fun getItem(idx: Number, out: Array<Any? /* String? | Number? | Date? */>? = definedExternally): dynamic /* String? | Number? | Date? | Dictionary<dynamic /* String? | Number? | Date? */>? | Array<dynamic /* String? | Number? | Date? */>? | OptionDataItemObject<dynamic /* String? | Number? | Date? */>? */
    fun getItem(idx: Number, out: OptionDataItemObject<Any? /* String? | Number? | Date? */>? = definedExternally): dynamic /* String? | Number? | Date? | Dictionary<dynamic /* String? | Number? | Date? */>? | Array<dynamic /* String? | Number? | Date? */>? | OptionDataItemObject<dynamic /* String? | Number? | Date? */>? */
    val fillStorage: ((start: Number, end: Number, out: Array<`ArrayLike$1`<dynamic /* Number | OrdinalNumber | String */>>, extent: Array<Array<Number>>) -> Unit)?
    val appendData: ((newData: `ArrayLike$1`<dynamic /* String? | Number? | Date? | Dictionary<dynamic /* String? | Number? | Date? */>? | Array<dynamic /* String? | Number? | Date? */>? | OptionDataItemObject<dynamic /* String? | Number? | Date? */>? */>) -> Unit)?
    val clean: (() -> Unit)?
}

external interface DimensionSummaryEncode {
    var defaultedLabel: Array<DimensionName>
    var defaultedTooltip: Array<DimensionName>
    @nativeGetter
    operator fun get(coordOrVisualDimName: String): Array<DimensionName>?
    @nativeSetter
    operator fun set(coordOrVisualDimName: String, value: Array<DimensionName>)
}

external interface `T$49` {
    @nativeGetter
    operator fun get(coordDim: String): DimensionName?
    @nativeSetter
    operator fun set(coordDim: String, value: DimensionName)
}

external interface DimensionSummary {
    var encode: DimensionSummaryEncode
    var userOutput: DimensionUserOuput
    var dataDimsOnCoord: Array<DimensionName>
    var dataDimIndicesOnCoord: Array<DimensionIndex>
    var encodeFirstDimNotExtra: `T$49`
}

external interface DimensionUserOuputEncode {
    @nativeGetter
    operator fun get(coordOrVisualDimName: String): Array<DimensionIndex>?
    @nativeSetter
    operator fun set(coordOrVisualDimName: String, value: Array<DimensionIndex>)
}

external interface `T$50` {
    var fullDimensions: Array<DimensionName>
    var encode: DimensionUserOuputEncode
}

external open class DimensionUserOuput(encode: DimensionUserOuputEncode, dimRequest: SeriesDataSchema = definedExternally) {
    open var _encode: Any
    open var _cachedDimNames: Any
    open var _schema: Any
    open fun get(): `T$50`
    open var _getFullDimensionNames: Any
}

external open class Graph(directed: Boolean = definedExternally) {
    open var type: String /* "graph" */
    open val nodes: Array<GraphNode>
    open val edges: Array<GraphEdge>
    open var data: SeriesData__0
    open var edgeData: SeriesData__0
    open var _directed: Any
    open var _nodesMap: Any
    open var _edgesMap: Any
    open fun isDirected(): Boolean
    open fun addNode(id: String, dataIndex: Number = definedExternally): GraphNode
    open fun addNode(id: String): GraphNode
    open fun addNode(id: Number, dataIndex: Number = definedExternally): GraphNode
    open fun addNode(id: Number): GraphNode
    open fun getNodeByIndex(dataIndex: Number): GraphNode
    open fun getNodeById(id: String): GraphNode
    open fun addEdge(n1: GraphNode, n2: GraphNode, dataIndex: Number = definedExternally): GraphEdge
    open fun addEdge(n1: GraphNode, n2: GraphNode): GraphEdge
    open fun addEdge(n1: GraphNode, n2: Number, dataIndex: Number = definedExternally): GraphEdge
    open fun addEdge(n1: GraphNode, n2: Number): GraphEdge
    open fun addEdge(n1: GraphNode, n2: String, dataIndex: Number = definedExternally): GraphEdge
    open fun addEdge(n1: GraphNode, n2: String): GraphEdge
    open fun addEdge(n1: Number, n2: GraphNode, dataIndex: Number = definedExternally): GraphEdge
    open fun addEdge(n1: Number, n2: GraphNode): GraphEdge
    open fun addEdge(n1: Number, n2: Number, dataIndex: Number = definedExternally): GraphEdge
    open fun addEdge(n1: Number, n2: Number): GraphEdge
    open fun addEdge(n1: Number, n2: String, dataIndex: Number = definedExternally): GraphEdge
    open fun addEdge(n1: Number, n2: String): GraphEdge
    open fun addEdge(n1: String, n2: GraphNode, dataIndex: Number = definedExternally): GraphEdge
    open fun addEdge(n1: String, n2: GraphNode): GraphEdge
    open fun addEdge(n1: String, n2: Number, dataIndex: Number = definedExternally): GraphEdge
    open fun addEdge(n1: String, n2: Number): GraphEdge
    open fun addEdge(n1: String, n2: String, dataIndex: Number = definedExternally): GraphEdge
    open fun addEdge(n1: String, n2: String): GraphEdge
    open fun getEdgeByIndex(dataIndex: Number): GraphEdge
    open fun getEdge(n1: String, n2: String): GraphEdge
    open fun getEdge(n1: String, n2: GraphNode): GraphEdge
    open fun getEdge(n1: GraphNode, n2: String): GraphEdge
    open fun getEdge(n1: GraphNode, n2: GraphNode): GraphEdge
    open fun <Ctx> eachNode(cb: (self: Ctx, node: GraphNode, idx: Number) -> Unit, context: Ctx = definedExternally)
    open fun <Ctx> eachEdge(cb: (self: Ctx, edge: GraphEdge, idx: Number) -> Unit, context: Ctx = definedExternally)
    open fun <Ctx> breadthFirstTraverse(cb: (self: Ctx, node: GraphNode, fromNode: GraphNode) -> Any, startNode: GraphNode, direction: String /* "none" | "in" | "out" */, context: Ctx = definedExternally)
    open fun <Ctx> breadthFirstTraverse(cb: (self: Ctx, node: GraphNode, fromNode: GraphNode) -> Any, startNode: GraphNode, direction: String /* "none" | "in" | "out" */)
    open fun <Ctx> breadthFirstTraverse(cb: (self: Ctx, node: GraphNode, fromNode: GraphNode) -> Any, startNode: String, direction: String /* "none" | "in" | "out" */, context: Ctx = definedExternally)
    open fun <Ctx> breadthFirstTraverse(cb: (self: Ctx, node: GraphNode, fromNode: GraphNode) -> Any, startNode: String, direction: String /* "none" | "in" | "out" */)
    open fun update()
    open fun clone(): Graph
}

external interface GraphDataProxyMixin {
    fun getValue(dimension: DimensionName = definedExternally): dynamic /* Number | OrdinalNumber | String */
    fun getValue(): dynamic /* Number | OrdinalNumber | String */
    fun getValue(dimension: DimensionIndex = definedExternally): dynamic /* Number | OrdinalNumber | String */
    fun setVisual(key: String, value: Any = definedExternally)
    fun setVisual(key: String)
    fun setVisual(key: Dictionary<Any>, value: Any = definedExternally)
    fun setVisual(key: Dictionary<Any>)
    fun getVisual(key: String): Any
    fun setLayout(layout: Any, merge: Boolean = definedExternally)
    fun getLayout(): Any
    fun getGraphicEl(): Element__0
    fun getRawIndex(): Number
}

external interface `T$51` {
    var node: Array<Number>
    var edge: Array<Number>
}

external interface `T$52` {
    var node: Array<Number>
    var edge: Array<Number>
}

external open class GraphEdge(n1: GraphNode, n2: GraphNode, dataIndex: Number = definedExternally) : GraphDataProxyMixin {
    override fun getValue(dimension: DimensionName): dynamic /* Number | OrdinalNumber | String */
    override fun getValue(): dynamic /* Number | OrdinalNumber | String */
    override fun getValue(dimension: DimensionIndex): dynamic /* Number | OrdinalNumber | String */
    override fun setVisual(key: String, value: Any)
    override fun setVisual(key: String)
    override fun setVisual(key: Dictionary<Any>, value: Any)
    override fun setVisual(key: Dictionary<Any>)
    override fun getVisual(key: String): Any
    override fun setLayout(layout: Any, merge: Boolean)
    override fun getLayout(): Any
    override fun getGraphicEl(): Element__0
    override fun getRawIndex(): Number
    open var node1: GraphNode
    open var node2: GraphNode
    open var dataIndex: Number
    open var hostGraph: Graph
    open fun <T> getModel(): Model<T>
    open fun <S : Any> getModel(path: S): Model<Any>
    open fun getAdjacentDataIndices(): `T$51`
    open fun getTrajectoryDataIndices(): `T$52`
}

external interface `T$53` {
    var node: Array<Number>
    var edge: Array<Number>
}

external interface `T$54` {
    var node: Array<Number>
    var edge: Array<Number>
}

external open class GraphNode(id: String = definedExternally, dataIndex: Number = definedExternally) : GraphDataProxyMixin {
    override fun getValue(dimension: DimensionName): dynamic /* Number | OrdinalNumber | String */
    override fun getValue(): dynamic /* Number | OrdinalNumber | String */
    override fun getValue(dimension: DimensionIndex): dynamic /* Number | OrdinalNumber | String */
    override fun setVisual(key: String, value: Any)
    override fun setVisual(key: String)
    override fun setVisual(key: Dictionary<Any>, value: Any)
    override fun setVisual(key: Dictionary<Any>)
    override fun getVisual(key: String): Any
    override fun setLayout(layout: Any, merge: Boolean)
    override fun getLayout(): Any
    override fun getGraphicEl(): Element__0
    override fun getRawIndex(): Number
    open var id: String
    open var inEdges: Array<GraphEdge>
    open var outEdges: Array<GraphEdge>
    open var edges: Array<GraphEdge>
    open var hostGraph: Graph
    open var dataIndex: Number
    open var __visited: Boolean
    open fun degree(): Number
    open fun inDegree(): Number
    open fun outDegree(): Number
    open fun <T> getModel(): Model<T>
    open fun <S : Any> getModel(path: S): Model<Any>
    open fun getAdjacentDataIndices(): `T$53`
    open fun getTrajectoryDataIndices(): `T$54`
}

external interface TreeTraverseOption {
    var order: String? /* "preorder" | "postorder" */
        get() = definedExternally
        set(value) = definedExternally
    var attr: String? /* "children" | "viewChildren" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface TreeNodeOption : OptionDataItemObject<dynamic /* String? | Number? | Date? */> {
    var children: Array<TreeNodeOption>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class TreeNode(name: String, hostTree: Tree__1<Model__0>) {
    open var name: String
    open var depth: Number
    open var height: Number
    open var parentNode: TreeNode
    open var dataIndex: Number
    open var children: Array<TreeNode>
    open var viewChildren: Array<TreeNode>
    open var isExpand: Boolean
    open val hostTree: Tree__1<Model__0>
    open fun isRemoved(): Boolean
    open fun <Ctx> eachNode(options: String /* "preorder" | "postorder" */, cb: TreeTraverseCallback<Ctx>, context: Ctx = definedExternally)
    open fun <Ctx> eachNode(options: String /* "preorder" | "postorder" */, cb: TreeTraverseCallback<Ctx>)
    open fun <Ctx> eachNode(options: TreeTraverseOption, cb: TreeTraverseCallback<Ctx>, context: Ctx = definedExternally)
    open fun <Ctx> eachNode(options: TreeTraverseOption, cb: TreeTraverseCallback<Ctx>)
    open fun <Ctx> eachNode(cb: TreeTraverseCallback<Ctx>, context: Ctx = definedExternally)
    open fun <Ctx> eachNode(cb: TreeTraverseCallback<Ctx>)
    open fun updateDepthAndHeight(depth: Number)
    open fun getNodeById(id: String): TreeNode
    open fun contains(node: TreeNode): Boolean
    open fun getAncestors(includeSelf: Boolean = definedExternally): Array<TreeNode>
    open fun getAncestorsIndices(): Array<Number>
    open fun getDescendantIndices(): Array<Number>
    open fun getValue(dimension: DimensionName = definedExternally): dynamic /* Number | OrdinalNumber | String */
    open fun getValue(): dynamic /* Number | OrdinalNumber | String */
    open fun getValue(dimension: DimensionIndex = definedExternally): dynamic /* Number | OrdinalNumber | String */
    open fun setLayout(layout: Any, merge: Boolean = definedExternally)
    open fun getLayout(): Any
    open fun <T> getModel(): Model<T>
    open fun getLevelModel(): Model__0
    open fun setVisual(key: String, value: Any)
    open fun setVisual(obj: Dictionary<Any>)
    open fun getVisual(key: String): Any
    open fun getRawIndex(): Number
    open fun getId(): String
    open fun getChildIndex(): Number
    open fun isAncestorOf(node: TreeNode): Boolean
    open fun isDescendantOf(node: TreeNode): Boolean
}

external open class Tree<HostModel : Model__0, LevelOption>(hostModel: HostModel) {
    open var type: String /* "tree" */
    open var root: TreeNode
    open var data: SeriesData__0
    open var hostModel: HostModel
    open var levelModels: Array<Model<LevelOption>>
    open var _nodes: Any
    open fun <Ctx> eachNode(options: String /* "preorder" | "postorder" */, cb: TreeTraverseCallback<Ctx>, context: Ctx = definedExternally)
    open fun <Ctx> eachNode(options: String /* "preorder" | "postorder" */, cb: TreeTraverseCallback<Ctx>)
    open fun <Ctx> eachNode(options: TreeTraverseOption, cb: TreeTraverseCallback<Ctx>, context: Ctx = definedExternally)
    open fun <Ctx> eachNode(options: TreeTraverseOption, cb: TreeTraverseCallback<Ctx>)
    open fun <Ctx> eachNode(cb: TreeTraverseCallback<Ctx>, context: Ctx = definedExternally)
    open fun <Ctx> eachNode(cb: TreeTraverseCallback<Ctx>)
    open fun getNodeByDataIndex(dataIndex: Number): TreeNode
    open fun getNodeById(name: String): TreeNode
    open fun update()
    open fun clearLayouts()

    companion object {
        fun <T : TreeNodeOption, HostModel : Model__0> createTree(dataRoot: T, hostModel: HostModel, beforeLink: (data: SeriesData__0) -> Unit = definedExternally): Tree<HostModel, Any>
    }
}

external open class Tree__1<HostModel : Model__0> : Tree<HostModel, Any>

external open class Tree__0 : Tree<Model__0, Any>

external interface `T$55`<T> {
    var inRange: T?
        get() = definedExternally
        set(value) = definedExternally
    var outOfRange: T?
        get() = definedExternally
        set(value) = definedExternally
}

external interface VisualMapOption<T : VisualOptionBase> : ComponentOption, BoxLayoutOptionMixin, BorderOptionMixin {
    override var mainType: String? /* "visualMap" */
        get() = definedExternally
        set(value) = definedExternally
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var align: String?
        get() = definedExternally
        set(value) = definedExternally
    var realtime: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var seriesIndex: dynamic /* "all" | Array<Number>? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var min: Number?
        get() = definedExternally
        set(value) = definedExternally
    var max: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dimension: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inRange: T?
        get() = definedExternally
        set(value) = definedExternally
    var outOfRange: T?
        get() = definedExternally
        set(value) = definedExternally
    var controller: `T$55`<Any?>?
        get() = definedExternally
        set(value) = definedExternally
    var target: `T$55`<Any?>?
        get() = definedExternally
        set(value) = definedExternally
    var itemWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var itemHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var inverse: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var orient: String? /* "horizontal" | "vertical" */
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var contentColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var inactiveColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var padding: dynamic /* Array<Number>? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var textGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var precision: Number?
        get() = definedExternally
        set(value) = definedExternally
    var color: Array<ColorString>?
        get() = definedExternally
        set(value) = definedExternally
    var formatter: dynamic /* String? | LabelFormatter? */
        get() = definedExternally
        set(value) = definedExternally
    var text: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var textStyle: LabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var categories: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface VisualMapOption__0 : VisualMapOption<VisualOptionBase>

external interface `T$56` {
    var value: Number
    var color: ColorString
}

external interface VisualMeta {
    var stops: Array<`T$56`>
    var outerColors: Array<ColorString>
    var dimension: DimensionIndex?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DefaultDataVisual {
    var style: PathStyleProps
    var drawType: String /* "fill" | "stroke" */
    var symbol: String?
        get() = definedExternally
        set(value) = definedExternally
    var symbolSize: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolRotate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var symbolKeepAspect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var symbolOffset: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var liftZ: Number?
        get() = definedExternally
        set(value) = definedExternally
    var legendIcon: String?
        get() = definedExternally
        set(value) = definedExternally
    var legendLineStyle: dynamic /* typealias LineStyleProps = dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var visualMeta: Array<VisualMeta>?
        get() = definedExternally
        set(value) = definedExternally
    var colorFromPalette: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var decal: DecalObject?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DataCalculationInfo<SERIES_MODEL> {
    var stackedDimension: DimensionName
    var stackedByDimension: DimensionName
    var isStackedByIndex: Boolean
    var stackedOverDimension: DimensionName
    var stackResultDimension: DimensionName
    var stackedOnSeries: SERIES_MODEL?
        get() = definedExternally
        set(value) = definedExternally
}

external open class SeriesData<HostModel /* : Model__0 */, Visual : DefaultDataVisual> {
    open fun getLinkedData(dataType: String /* "main" | "node" | "edge" */ = definedExternally): SeriesData__0
    open fun getLinkedDataAll(): Array<`T$43`>
    open val type: Any = definedExternally /* "list" */
    open val dimensions: Array<SeriesDimensionName>
    open var _dimInfos: Any
    open var _dimOmitted: Any
    open var _schema: Any
    open var _dimIdxToName: Any
    open val hostModel: HostModel
    open var dataType: String /* "main" | "node" | "edge" */
    open var graph: Graph
    open var tree: Tree__0
    open var _store: Any
    open var _nameList: Any
    open var _idList: Any
    open var _visual: Any
    open var _layout: Any
    open var _itemVisuals: Any
    open var _itemLayouts: Any
    open var _graphicEls: Any
    open var _approximateExtent: Any
    open var _dimSummary: Any
    open var _invertedIndicesMap: Any
    open var _calculationInfo: Any
    open var userOutput: DimensionUserOuput
    open var hasItemOption: Boolean
    open var _nameRepeatCount: Any
    open var _nameDimIdx: Any
    open var _idDimIdx: Any
    open var __wrappedMethods: Any
    open var TRANSFERABLE_METHODS: dynamic /* JsTuple<String, String, String, String> */
    open var CHANGABLE_METHODS: dynamic /* JsTuple<String, String> */
    open var DOWNSAMPLE_METHODS: dynamic /* JsTuple<String, String> */
    constructor(dimensionsInput: SeriesDataSchema, hostModel: HostModel)
    constructor(dimensionsInput: Array<Any? /* String? | Any? | SeriesDimensionDefine? */>, hostModel: HostModel)
    open fun getDimension(dim: dynamic /* typealias SeriesDimensionLoose = dynamic */): DimensionName
    open fun getDimensionIndex(dim: DimensionName): DimensionIndex
    open fun getDimensionIndex(dim: DimensionIndex): DimensionIndex
    open var _recognizeDimIndex: Any
    open var _getStoreDimIndex: Any
    open fun getDimensionInfo(dim: dynamic /* typealias SeriesDimensionLoose = dynamic */): SeriesDimensionDefine
    open var _getDimInfo: Any
    open var _initGetDimensionInfo: Any
    open fun getDimensionsOnCoord(): Array<SeriesDimensionName>
    open fun mapDimension(coordDim: SeriesDimensionName): SeriesDimensionName
    open fun mapDimension(coordDim: SeriesDimensionName, idx: Number): SeriesDimensionName
    open fun mapDimensionsAll(coordDim: SeriesDimensionName): Array<SeriesDimensionName>
    open fun getStore(): DataStore
    open fun initData(data: Source, nameList: Array<String> = definedExternally, dimValueGetter: DimValueGetter = definedExternally)
    open fun initData(data: Source)
    open fun initData(data: Source, nameList: Array<String> = definedExternally)
    open fun initData(data: OptionSourceDataOriginal<Any? /* String? | Number? | Date? */, Any? /* VAL | Array<VAL> | OptionDataItemObject<VAL> */>, nameList: Array<String> = definedExternally, dimValueGetter: DimValueGetter = definedExternally)
    open fun initData(data: OptionSourceDataOriginal<Any? /* String? | Number? | Date? */, Any? /* VAL | Array<VAL> | OptionDataItemObject<VAL> */>)
    open fun initData(data: OptionSourceDataOriginal<Any? /* String? | Number? | Date? */, Any? /* VAL | Array<VAL> | OptionDataItemObject<VAL> */>, nameList: Array<String> = definedExternally)
    open fun initData(data: OptionSourceDataObjectRows<Any? /* String? | Number? | Date? */>, nameList: Array<String> = definedExternally, dimValueGetter: DimValueGetter = definedExternally)
    open fun initData(data: OptionSourceDataObjectRows<Any? /* String? | Number? | Date? */>)
    open fun initData(data: OptionSourceDataObjectRows<Any? /* String? | Number? | Date? */>, nameList: Array<String> = definedExternally)
    open fun initData(data: OptionSourceDataArrayRows<Any? /* String? | Number? | Date? */>, nameList: Array<String> = definedExternally, dimValueGetter: DimValueGetter = definedExternally)
    open fun initData(data: OptionSourceDataArrayRows<Any? /* String? | Number? | Date? */>)
    open fun initData(data: OptionSourceDataArrayRows<Any? /* String? | Number? | Date? */>, nameList: Array<String> = definedExternally)
    open fun initData(data: OptionSourceDataKeyedColumns<Any? /* String? | Number? | Date? */>, nameList: Array<String> = definedExternally, dimValueGetter: DimValueGetter = definedExternally)
    open fun initData(data: OptionSourceDataKeyedColumns<Any? /* String? | Number? | Date? */>)
    open fun initData(data: OptionSourceDataKeyedColumns<Any? /* String? | Number? | Date? */>, nameList: Array<String> = definedExternally)
    open fun initData(data: OptionSourceDataTypedArray, nameList: Array<String> = definedExternally, dimValueGetter: DimValueGetter = definedExternally)
    open fun initData(data: OptionSourceDataTypedArray)
    open fun initData(data: OptionSourceDataTypedArray, nameList: Array<String> = definedExternally)
    open fun initData(data: DataStore, nameList: Array<String> = definedExternally, dimValueGetter: DimValueGetter = definedExternally)
    open fun initData(data: DataStore)
    open fun initData(data: DataStore, nameList: Array<String> = definedExternally)
    open fun initData(data: DataProvider, nameList: Array<String> = definedExternally, dimValueGetter: DimValueGetter = definedExternally)
    open fun initData(data: DataProvider)
    open fun initData(data: DataProvider, nameList: Array<String> = definedExternally)
    open fun appendData(data: `ArrayLike$1`<Any>)
    open fun appendValues(values: Array<Array<Any>>, names: Array<String> = definedExternally)
    open var _updateOrdinalMeta: Any
    open var _shouldMakeIdFromName: Any
    open var _doInit: Any
    open fun getApproximateExtent(dim: dynamic /* typealias SeriesDimensionLoose = dynamic */): dynamic /* JsTuple<Number, Number> */
    open fun setApproximateExtent(extent: Any /* JsTuple<Number, Number> */, dim: dynamic /* typealias SeriesDimensionLoose = dynamic */)
    open fun <CALC_INFO_KEY : String> getCalculationInfo(key: CALC_INFO_KEY): Any
    open fun setCalculationInfo(key: DataCalculationInfo<HostModel>)
    open fun <CALC_INFO_KEY : String> setCalculationInfo(key: CALC_INFO_KEY, value: Any)
    open fun getName(idx: Number): String
    open var _getCategory: Any
    open fun getId(idx: Number): String
    open fun count(): Number
    open fun get(dim: SeriesDimensionName, idx: Number): dynamic /* Number | OrdinalNumber | String */
    open fun getByRawIndex(dim: SeriesDimensionName, rawIdx: Number): dynamic /* Number | OrdinalNumber | String */
    open fun getIndices(): ArrayLike<Number>
    open fun getDataExtent(dim: DimensionName): dynamic /* JsTuple<Number, Number> */
    open fun getDataExtent(dim: DimensionIndex): dynamic /* JsTuple<Number, Number> */
    open fun getSum(dim: DimensionName): Number
    open fun getSum(dim: DimensionIndex): Number
    open fun getMedian(dim: DimensionName): Number
    open fun getMedian(dim: DimensionIndex): Number
    open fun getValues(idx: Number): Array<dynamic /* Number | OrdinalNumber | String */>
    open fun getValues(dimensions: Array<DimensionName>, idx: Number): Array<dynamic /* Number | OrdinalNumber | String */>
    open fun hasValue(idx: Number): Boolean
    open fun indexOfName(name: String): Number
    open fun getRawIndex(idx: Number): Number
    open fun indexOfRawIndex(rawIndex: Number): Number
    open fun rawIndexOf(dim: SeriesDimensionName, value: OrdinalNumber): Number
    open fun indicesOfNearest(dim: DimensionName, value: Number, maxDistance: Number = definedExternally): Array<Number>
    open fun indicesOfNearest(dim: DimensionName, value: Number): Array<Number>
    open fun indicesOfNearest(dim: DimensionIndex, value: Number, maxDistance: Number = definedExternally): Array<Number>
    open fun indicesOfNearest(dim: DimensionIndex, value: Number): Array<Number>
    open fun <Ctx> each(cb: EachCb0<Ctx>, ctx: Ctx = definedExternally, ctxCompat: Ctx = definedExternally)
    open fun <Ctx> each(cb: EachCb0<Ctx>)
    open fun <Ctx> each(cb: EachCb0<Ctx>, ctx: Ctx = definedExternally)
    open fun <Ctx> each(dims: DimensionName, cb: EachCb1<Ctx>, ctx: Ctx = definedExternally)
    open fun <Ctx> each(dims: DimensionName, cb: EachCb1<Ctx>)
    open fun <Ctx> each(dims: DimensionIndex, cb: EachCb1<Ctx>, ctx: Ctx = definedExternally)
    open fun <Ctx> each(dims: DimensionIndex, cb: EachCb1<Ctx>)
    open fun <Ctx> each(dims: Any /* JsTuple<Any> */, cb: EachCb1<Ctx>, ctx: Ctx = definedExternally)
    open fun <Ctx> each(dims: Any /* JsTuple<Any> */, cb: EachCb1<Ctx>)
    open fun <Ctx> each(dims: Any /* JsTuple<Any, Any> */, cb: EachCb2<Ctx>, ctx: Ctx = definedExternally)
    open fun <Ctx> each(dims: Any /* JsTuple<Any, Any> */, cb: EachCb2<Ctx>)
    open fun <Ctx> each(dims: DimensionName, cb: `EachCb$1`<Ctx>, ctx: Ctx = definedExternally)
    open fun <Ctx> each(dims: DimensionName, cb: `EachCb$1`<Ctx>)
    open fun <Ctx> each(dims: DimensionIndex, cb: `EachCb$1`<Ctx>, ctx: Ctx = definedExternally)
    open fun <Ctx> each(dims: DimensionIndex, cb: `EachCb$1`<Ctx>)
    open fun <Ctx> each(dims: Array<Any /* DimensionName | DimensionIndex | String */>, cb: `EachCb$1`<Ctx>, ctx: Ctx = definedExternally)
    open fun <Ctx> each(dims: Array<Any /* DimensionName | DimensionIndex | String */>, cb: `EachCb$1`<Ctx>)
    open fun <Ctx> filterSelf(cb: FilterCb0<Ctx>, ctx: Ctx = definedExternally, ctxCompat: Ctx = definedExternally): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(cb: FilterCb0<Ctx>): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(cb: FilterCb0<Ctx>, ctx: Ctx = definedExternally): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(dims: DimensionName, cb: FilterCb1<Ctx>, ctx: Ctx = definedExternally): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(dims: DimensionName, cb: FilterCb1<Ctx>): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(dims: DimensionIndex, cb: FilterCb1<Ctx>, ctx: Ctx = definedExternally): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(dims: DimensionIndex, cb: FilterCb1<Ctx>): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(dims: Any /* JsTuple<Any> */, cb: FilterCb1<Ctx>, ctx: Ctx = definedExternally): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(dims: Any /* JsTuple<Any> */, cb: FilterCb1<Ctx>): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(dims: Any /* JsTuple<Any, Any> */, cb: FilterCb2<Ctx>, ctx: Ctx = definedExternally): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(dims: Any /* JsTuple<Any, Any> */, cb: FilterCb2<Ctx>): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(dims: DimensionName, cb: `FilterCb$1`<Ctx>, ctx: Ctx = definedExternally): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(dims: DimensionName, cb: `FilterCb$1`<Ctx>): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(dims: DimensionIndex, cb: `FilterCb$1`<Ctx>, ctx: Ctx = definedExternally): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(dims: DimensionIndex, cb: `FilterCb$1`<Ctx>): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(dims: Array<Any /* DimensionName | DimensionIndex | String */>, cb: `FilterCb$1`<Ctx>, ctx: Ctx = definedExternally): SeriesData<HostModel, Visual> /* this */
    open fun <Ctx> filterSelf(dims: Array<Any /* DimensionName | DimensionIndex | String */>, cb: `FilterCb$1`<Ctx>): SeriesData<HostModel, Visual> /* this */
    open fun selectRange(range: Record<String, Any /* JsTuple<Number, Number> */>): SeriesData__0
    open fun <Ctx, Cb : MapArrayCb0<Ctx>> mapArray(cb: Cb, ctx: Ctx = definedExternally, ctxCompat: Ctx = definedExternally): Array<ReturnType<Cb>>
    open fun <Ctx, Cb : MapArrayCb0<Ctx>> mapArray(cb: Cb): Array<ReturnType<Cb>>
    open fun <Ctx, Cb : MapArrayCb0<Ctx>> mapArray(cb: Cb, ctx: Ctx = definedExternally): Array<ReturnType<Cb>>
    open fun <Ctx, Cb : MapArrayCb1<Ctx>> mapArray(dims: DimensionName, cb: Cb, ctx: Ctx = definedExternally, ctxCompat: Ctx = definedExternally): Array<ReturnType<Cb>>
    open fun <Ctx, Cb : MapArrayCb1<Ctx>> mapArray(dims: DimensionName, cb: Cb): Array<ReturnType<Cb>>
    open fun <Ctx, Cb : MapArrayCb1<Ctx>> mapArray(dims: DimensionName, cb: Cb, ctx: Ctx = definedExternally): Array<ReturnType<Cb>>
    open fun <Ctx, Cb : MapArrayCb1<Ctx>> mapArray(dims: DimensionIndex, cb: Cb, ctx: Ctx = definedExternally, ctxCompat: Ctx = definedExternally): Array<ReturnType<Cb>>
    open fun <Ctx, Cb : MapArrayCb1<Ctx>> mapArray(dims: DimensionIndex, cb: Cb): Array<ReturnType<Cb>>
    open fun <Ctx, Cb : MapArrayCb1<Ctx>> mapArray(dims: DimensionIndex, cb: Cb, ctx: Ctx = definedExternally): Array<ReturnType<Cb>>
    open fun <Ctx, Cb : MapArrayCb1<Ctx>> mapArray(dims: Any /* JsTuple<Any> | JsTuple<Any, Any> */, cb: Cb, ctx: Ctx = definedExternally, ctxCompat: Ctx = definedExternally): Array<ReturnType<Cb>>
    open fun <Ctx, Cb : MapArrayCb1<Ctx>> mapArray(dims: Any /* JsTuple<Any> | JsTuple<Any, Any> */, cb: Cb): Array<ReturnType<Cb>>
    open fun <Ctx, Cb : MapArrayCb1<Ctx>> mapArray(dims: Any /* JsTuple<Any> | JsTuple<Any, Any> */, cb: Cb, ctx: Ctx = definedExternally): Array<ReturnType<Cb>>
    open fun <Ctx, Cb : MapArrayCb<Ctx>> mapArray(dims: Array<Any /* DimensionName | DimensionIndex | String */>, cb: Cb, ctx: Ctx = definedExternally, ctxCompat: Ctx = definedExternally): Array<ReturnType<Cb>>
    open fun <Ctx, Cb : MapArrayCb<Ctx>> mapArray(dims: Array<Any /* DimensionName | DimensionIndex | String */>, cb: Cb): Array<ReturnType<Cb>>
    open fun <Ctx, Cb : MapArrayCb<Ctx>> mapArray(dims: Array<Any /* DimensionName | DimensionIndex | String */>, cb: Cb, ctx: Ctx = definedExternally): Array<ReturnType<Cb>>
    open fun <Ctx> map(dims: DimensionName, cb: MapCb1<Ctx>, ctx: Ctx = definedExternally, ctxCompat: Ctx = definedExternally): SeriesData__1<HostModel>
    open fun <Ctx> map(dims: DimensionName, cb: MapCb1<Ctx>): SeriesData__1<HostModel>
    open fun <Ctx> map(dims: DimensionName, cb: MapCb1<Ctx>, ctx: Ctx = definedExternally): SeriesData__1<HostModel>
    open fun <Ctx> map(dims: DimensionIndex, cb: MapCb1<Ctx>, ctx: Ctx = definedExternally, ctxCompat: Ctx = definedExternally): SeriesData__1<HostModel>
    open fun <Ctx> map(dims: DimensionIndex, cb: MapCb1<Ctx>): SeriesData__1<HostModel>
    open fun <Ctx> map(dims: DimensionIndex, cb: MapCb1<Ctx>, ctx: Ctx = definedExternally): SeriesData__1<HostModel>
    open fun <Ctx> map(dims: Any /* JsTuple<Any> */, cb: MapCb1<Ctx>, ctx: Ctx = definedExternally, ctxCompat: Ctx = definedExternally): SeriesData__1<HostModel>
    open fun <Ctx> map(dims: Any /* JsTuple<Any> */, cb: MapCb1<Ctx>): SeriesData__1<HostModel>
    open fun <Ctx> map(dims: Any /* JsTuple<Any> */, cb: MapCb1<Ctx>, ctx: Ctx = definedExternally): SeriesData__1<HostModel>
    open fun <Ctx> map(dims: Any /* JsTuple<Any, Any> */, cb: MapCb2<Ctx>, ctx: Ctx = definedExternally, ctxCompat: Ctx = definedExternally): SeriesData__1<HostModel>
    open fun <Ctx> map(dims: Any /* JsTuple<Any, Any> */, cb: MapCb2<Ctx>): SeriesData__1<HostModel>
    open fun <Ctx> map(dims: Any /* JsTuple<Any, Any> */, cb: MapCb2<Ctx>, ctx: Ctx = definedExternally): SeriesData__1<HostModel>
    open fun <Ctx> modify(dims: DimensionName, cb: MapCb1<Ctx>, ctx: Ctx = definedExternally, ctxCompat: Ctx = definedExternally)
    open fun <Ctx> modify(dims: DimensionName, cb: MapCb1<Ctx>)
    open fun <Ctx> modify(dims: DimensionName, cb: MapCb1<Ctx>, ctx: Ctx = definedExternally)
    open fun <Ctx> modify(dims: DimensionIndex, cb: MapCb1<Ctx>, ctx: Ctx = definedExternally, ctxCompat: Ctx = definedExternally)
    open fun <Ctx> modify(dims: DimensionIndex, cb: MapCb1<Ctx>)
    open fun <Ctx> modify(dims: DimensionIndex, cb: MapCb1<Ctx>, ctx: Ctx = definedExternally)
    open fun <Ctx> modify(dims: Any /* JsTuple<Any> */, cb: MapCb1<Ctx>, ctx: Ctx = definedExternally, ctxCompat: Ctx = definedExternally)
    open fun <Ctx> modify(dims: Any /* JsTuple<Any> */, cb: MapCb1<Ctx>)
    open fun <Ctx> modify(dims: Any /* JsTuple<Any> */, cb: MapCb1<Ctx>, ctx: Ctx = definedExternally)
    open fun <Ctx> modify(dims: Any /* JsTuple<Any, Any> */, cb: MapCb2<Ctx>, ctx: Ctx = definedExternally, ctxCompat: Ctx = definedExternally)
    open fun <Ctx> modify(dims: Any /* JsTuple<Any, Any> */, cb: MapCb2<Ctx>)
    open fun <Ctx> modify(dims: Any /* JsTuple<Any, Any> */, cb: MapCb2<Ctx>, ctx: Ctx = definedExternally)
    open fun downSample(dimension: DimensionName, rate: Number, sampleValue: (frameValues: `ArrayLike$1`<Any /* Number | OrdinalNumber | String */>) -> Any, sampleIndex: (frameValues: `ArrayLike$1`<Any /* Number | OrdinalNumber | String */>, value: Any /* Number | OrdinalNumber */) -> Number): SeriesData__1<HostModel>
    open fun downSample(dimension: DimensionIndex, rate: Number, sampleValue: (frameValues: `ArrayLike$1`<Any /* Number | OrdinalNumber | String */>) -> Any, sampleIndex: (frameValues: `ArrayLike$1`<Any /* Number | OrdinalNumber | String */>, value: Any /* Number | OrdinalNumber */) -> Number): SeriesData__1<HostModel>
    open fun lttbDownSample(valueDimension: DimensionName, rate: Number): SeriesData__1<HostModel>
    open fun lttbDownSample(valueDimension: DimensionIndex, rate: Number): SeriesData__1<HostModel>
    open fun getRawDataItem(idx: Number): dynamic /* String? | Number? | Date? | Dictionary<dynamic /* String? | Number? | Date? */>? | Array<dynamic /* String? | Number? | Date? */>? | OptionDataItemObject<dynamic /* String? | Number? | Date? */>? */
    open fun <ItemOpts : Any> getItemModel(idx: Number): Model<ItemOpts>
    open fun diff(otherList: SeriesData__0): DataDiffer__0
    open fun <K : Any> getVisual(key: K): Any
    open fun <K : Any> setVisual(key: K, param_val: Any)
    open fun setVisual(kvObj: Partial<Visual>)
    open fun <K : Any> getItemVisual(idx: Number, key: K): Any
    open fun hasItemVisual(): Boolean
    open fun <K : Any> ensureUniqueItemVisual(idx: Number, key: K): Any
    open fun <K : Any> setItemVisual(idx: Number, key: K, value: Any)
    open fun setItemVisual(idx: Number, kvObject: Partial<Visual>)
    open fun clearAllVisual()
    open fun setLayout(key: String, param_val: Any)
    open fun setLayout(kvObj: Dictionary<Any>)
    open fun getLayout(key: String): Any
    open fun getItemLayout(idx: Number): Any
    open fun <M> setItemLayout(idx: Number, layout: Any, merge: M = definedExternally)
    open fun clearItemLayouts()
    open fun setItemGraphicEl(idx: Number, el: Element__0)
    open fun getItemGraphicEl(idx: Number): Element__0
    open fun <Ctx> eachItemGraphicEl(cb: (self: Ctx, el: Element__0, idx: Number) -> Unit, context: Ctx = definedExternally)
    open fun cloneShallow(list: SeriesData__1<HostModel> = definedExternally): SeriesData__1<HostModel>
    open fun wrapMethod(methodName: Any, injectFunction: (args: Any) -> Any)

    companion object {
        var internalField: Any
    }
}

external open class SeriesData__0 : SeriesData<Model__0, DefaultDataVisual>

external open class SeriesData__1<HostModel /* : Model__0*/> : SeriesData<HostModel, DefaultDataVisual>

external interface ModelFinderObject {
    var seriesIndex: dynamic /* Number? | Array<Number>? | "all" | "none" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var seriesId: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var seriesName: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var geoIndex: dynamic /* Number? | Array<Number>? | "all" | "none" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var geoId: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var geoName: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var bmapIndex: dynamic /* Number? | Array<Number>? | "all" | "none" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var bmapId: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var bmapName: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var xAxisIndex: dynamic /* Number? | Array<Number>? | "all" | "none" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var xAxisId: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var xAxisName: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisIndex: dynamic /* Number? | Array<Number>? | "all" | "none" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisId: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisName: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var gridIndex: dynamic /* Number? | Array<Number>? | "all" | "none" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var gridId: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var gridName: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var dataIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dataIndexInside: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ParsedModelFinder {
    @nativeGetter
    operator fun get(key: String): dynamic /* ComponentModel__0? | Array<ComponentModel__0>? */
    @nativeSetter
    operator fun set(key: String, value: ComponentModel__0?)
    @nativeSetter
    operator fun set(key: String, value: Array<ComponentModel__0>?)
}

external interface QueryReferringOpt {
    var useDefault: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enableAll: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var enableNone: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$57` {
    var models: Array<ComponentModel__0>
    var specified: Boolean
}

external interface `T$58` {
    var left: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var top: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var right: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var bottom: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var width: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
    var height: dynamic /* String | Number */
        get() = definedExternally
        set(value) = definedExternally
}

external open class ComponentModel<Opt : ComponentOption>(option: Opt, parentModel: Model__0, ecModel: GlobalModel) : Model<Opt> {
    open var type: ComponentFullType
    open var id: String
    open var name: String
    open var mainType: Any? /* Nothing? & String */
    open var subType: ComponentSubType
    open var componentIndex: Number
    open var defaultOption: ComponentOption
    override var ecModel: GlobalModel
    open val uid: String
    open var preventAutoZ: Boolean
    open var __viewId: String
    open var __requireNewView: Boolean
    open fun init(option: Opt, parentModel: Model__0, ecModel: GlobalModel)
    open fun mergeDefaultAndTheme(option: Opt, ecModel: GlobalModel)
    override fun mergeOption(option: Opt, ecModel: GlobalModel)
    open fun optionUpdated(newCptOption: Opt, isInit: Boolean)
    open fun getDefaultOption(): Opt
    open fun getReferringComponents(mainType: Nothing? /* Nothing? & String */, opt: QueryReferringOpt): `T$57`
    open fun getBoxLayoutParams(): `T$58`
    open fun getZLevelKey(): String
    open fun setZLevel(zlevel: Number)

    companion object {
        var dependencies: Array<String>
        var layoutMode: dynamic /* ComponentLayoutMode | "box" */
        var protoInitialize: Unit
        var registerClass: (clz: Constructor) -> Constructor
        var hasClass: (componentType: ComponentFullType) -> Boolean
        var registerSubTypeDefaulter: (componentType: String, defaulter: SubTypeDefaulter) -> Unit
    }
}

external open class ComponentModel__0 : ComponentModel<ComponentOption>

external interface AnimateOrSetPropsOption {
    var dataIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cb: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var during: ((percent: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var removeOpt: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    var isFrom: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: Number = definedExternally, cb: () -> Unit = definedExternally, during: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: Number = definedExternally)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: Number = definedExternally, cb: () -> Unit = definedExternally)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: Number = definedExternally, cb: (percent: Number) -> Unit = definedExternally, during: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: Number = definedExternally, cb: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: () -> Unit = definedExternally, cb: () -> Unit = definedExternally, during: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: () -> Unit = definedExternally)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: () -> Unit = definedExternally, cb: () -> Unit = definedExternally)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: () -> Unit = definedExternally, cb: (percent: Number) -> Unit = definedExternally, during: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: () -> Unit = definedExternally, cb: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: AnimateOrSetPropsOption = definedExternally, cb: () -> Unit = definedExternally, during: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: AnimateOrSetPropsOption = definedExternally)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: AnimateOrSetPropsOption = definedExternally, cb: () -> Unit = definedExternally)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: AnimateOrSetPropsOption = definedExternally, cb: (percent: Number) -> Unit = definedExternally, during: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> updateProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: AnimateOrSetPropsOption = definedExternally, cb: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: Number = definedExternally, cb: () -> Unit = definedExternally, during: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: Number = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: Number = definedExternally, cb: () -> Unit = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: Number = definedExternally, cb: (percent: Number) -> Unit = definedExternally, during: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: Number = definedExternally, cb: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: () -> Unit = definedExternally, cb: () -> Unit = definedExternally, during: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: () -> Unit = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: () -> Unit = definedExternally, cb: () -> Unit = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: () -> Unit = definedExternally, cb: (percent: Number) -> Unit = definedExternally, during: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: () -> Unit = definedExternally, cb: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: AnimateOrSetPropsOption = definedExternally, cb: () -> Unit = definedExternally, during: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: AnimateOrSetPropsOption = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: AnimateOrSetPropsOption = definedExternally, cb: () -> Unit = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: AnimateOrSetPropsOption = definedExternally, cb: (percent: Number) -> Unit = definedExternally, during: (percent: Number) -> Unit = definedExternally)

external fun <Props : ElementProps> initProps(el: Element<Props>, props: Props, animatableModel: Model<AnimationOptionMixin> = definedExternally, dataIndex: AnimateOrSetPropsOption = definedExternally, cb: (percent: Number) -> Unit = definedExternally)

external fun extendShape(opts: Any): ExtendShapeReturn

external var extendPathFromString: Any

external fun extendPath(pathData: String, opts: Any): SVGPathCtor

external fun registerShape(name: String, ShapeClass: Any)

external fun getShapeClass(name: String): Any

external fun makePath(pathData: String, opts: Any, rect: ZRRectLike, layout: String /* "center" | "cover" */ = definedExternally): `SVGPath$1`

external fun makeImage(imageUrl: String, rect: ZRRectLike, layout: String /* "center" | "cover" */ = definedExternally): ZRImage

external var `mergePath$1`: Any

external fun resizePath(path: `SVGPath$1`, rect: ZRRectLike)

external fun getTransform(target: Transformable, ancestor: Transformable = definedExternally): MatrixArray

external fun clipPointsByRect(points: Array<VectorArray>, rect: ZRRectLike): Array<Array<Number>>

external fun clipRectByRect(targetRect: ZRRectLike, rect: ZRRectLike): ZRRectLike?

external fun createIcon(iconStr: String, opt: dynamic /* typealias Omit = dynamic */ = definedExternally, rect: ZRRectLike = definedExternally): dynamic /* SVGPath$1 | ZRImage */

external fun getTextRect(text: Any, font: Any = definedExternally, align: Any = definedExternally, verticalAlign: Any = definedExternally, padding: Any = definedExternally, rich: Any = definedExternally, truncate: Boolean = definedExternally, lineHeight: Number = definedExternally): BoundingRect

external fun addCommas(x: String): String

external fun addCommas(x: Number): String

external fun toCamelCase(str: String, upperCaseFirst: Boolean = definedExternally): String

external var `normalizeCssArray$1`: Any

external interface TplFormatterParam : Dictionary<Any> {

}

external fun formatTpl(tpl: String, paramsList: TplFormatterParam, encode: Boolean = definedExternally): String

external fun formatTpl(tpl: String, paramsList: TplFormatterParam): String

external fun formatTpl(tpl: String, paramsList: Array<TplFormatterParam>, encode: Boolean = definedExternally): String

external fun formatTpl(tpl: String, paramsList: Array<TplFormatterParam>): String

external interface RichTextTooltipMarker {
    var renderMode: String /* "html" | "richText" */
    var content: String
    var style: Dictionary<Any>
}

external interface GetTooltipMarkerOpt {
    var color: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var extraCssText: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: String? /* "item" | "subItem" */
        get() = definedExternally
        set(value) = definedExternally
    var renderMode: String? /* "html" | "richText" */
        get() = definedExternally
        set(value) = definedExternally
    var markerId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external fun getTooltipMarker(color: ColorString, extraCssText: String = definedExternally): dynamic /* String | RichTextTooltipMarker */

external fun getTooltipMarker(color: ColorString): dynamic /* String | RichTextTooltipMarker */

external fun getTooltipMarker(opt: GetTooltipMarkerOpt): dynamic /* String | RichTextTooltipMarker */

external fun formatTime(tpl: String, value: Any, isUTC: Boolean = definedExternally): String

external fun capitalFirst(str: String): String

external interface MapperParamAxisInfo {
    var axisIndex: Number
    var axisName: String
    var axisId: String
    var axisDim: String
}

external interface `L$3` {
    @nativeInvoke
    operator fun invoke(sourceVal: Number, sourceAxisInfo: MapperParamAxisInfo, targetAxisInfo: MapperParamAxisInfo): dynamic /* Number | OrdinalNumber | String | Date */
    @nativeInvoke
    operator fun invoke(sourceVal: String, sourceAxisInfo: MapperParamAxisInfo, targetAxisInfo: MapperParamAxisInfo): dynamic /* Number | OrdinalNumber | String | Date */
    @nativeInvoke
    operator fun invoke(sourceVal: Date, sourceAxisInfo: MapperParamAxisInfo, targetAxisInfo: MapperParamAxisInfo): dynamic /* Number | OrdinalNumber | String | Date */
}

external interface AxisPointerLink {
    var xAxisIndex: dynamic /* Array<Number>? | "all" */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisIndex: dynamic /* Array<Number>? | "all" */
        get() = definedExternally
        set(value) = definedExternally
    var xAxisId: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var yAxisId: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var xAxisName: dynamic /* Array<String>? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisName: dynamic /* Array<String>? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var radiusAxisIndex: dynamic /* Array<Number>? | "all" */
        get() = definedExternally
        set(value) = definedExternally
    var angleAxisIndex: dynamic /* Array<Number>? | "all" */
        get() = definedExternally
        set(value) = definedExternally
    var radiusAxisId: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var angleAxisId: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var radiusAxisName: dynamic /* Array<String>? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var angleAxisName: dynamic /* Array<String>? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var singleAxisIndex: dynamic /* Array<Number>? | "all" */
        get() = definedExternally
        set(value) = definedExternally
    var singleAxisId: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var singleAxisName: dynamic /* Array<String>? | String? */
        get() = definedExternally
        set(value) = definedExternally
    val mapper: `L$3`?
        get() = definedExternally
}

external interface AxisPointerOption : ComponentOption /*, Omit<CommonAxisPointerOption, String /* "type" */>*/ {
    override var mainType: String? /* "axisPointer" */
        get() = definedExternally
        set(value) = definedExternally
    override var type: String? /* "line" | "shadow" | "cross" | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var link: Array<AxisPointerLink>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TooltipOption : CommonTooltipOption<dynamic /* CallbackDataParams | Array<CallbackDataParams> */>, ComponentOption {
    override var mainType: String? /* "tooltip" */
        get() = definedExternally
        set(value) = definedExternally
    var axisPointer: AxisPointerOption? /* AxisPointerOption? & `T$60`? */
        get() = definedExternally
        set(value) = definedExternally
    var showContent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var trigger: String? /* "item" | "axis" | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var displayMode: String? /* "single" | "multipleByCoordSys" */
        get() = definedExternally
        set(value) = definedExternally
    var renderMode: String? /* "auto" | "html" | "richText" */
        get() = definedExternally
        set(value) = definedExternally
    var appendToBody: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var appendTo: dynamic /* ((chartContainer: HTMLElement) -> HTMLElement?)? | String? | HTMLElement? */
        get() = definedExternally
        set(value) = definedExternally
    var className: String?
        get() = definedExternally
        set(value) = definedExternally
    var order: String? /* "valueAsc" | "valueDesc" | "seriesAsc" | "seriesDesc" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface TooltipMarkupBlock {
    var sortParam: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TooltipMarkupSection : TooltipMarkupBlock {
    var type: String /* "section" */
    var header: Any?
        get() = definedExternally
        set(value) = definedExternally
    var noHeader: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var blocks: Array<dynamic /* TooltipMarkupSection | TooltipMarkupNameValueBlock */>?
        get() = definedExternally
        set(value) = definedExternally
    var sortBlocks: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var valueFormatter: ((value: dynamic /* String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */, dataIndex: Number) -> String)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TooltipMarkupNameValueBlock : TooltipMarkupBlock {
    var type: String /* "nameValue" */
    var markerType: String? /* "item" | "subItem" */
        get() = definedExternally
        set(value) = definedExternally
    var markerColor: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* Any? | Array<Any>? */
        get() = definedExternally
        set(value) = definedExternally
    var valueType: dynamic /* DimensionType? | Array<DimensionType>? */
        get() = definedExternally
        set(value) = definedExternally
    var noName: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var noValue: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var dataIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var valueFormatter: ((value: dynamic /* String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */, dataIndex: Number) -> String)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$61` {
    var interpolatedValue: dynamic /* Number | OrdinalNumber | String | Array<dynamic /* Number | OrdinalNumber | String */> */
        get() = definedExternally
        set(value) = definedExternally
}

external open class DataFormatMixin : DataHost {
    override fun getData(dataType: String /* "main" | "node" | "edge" */): SeriesData__0
    open var ecModel: GlobalModel
    open var mainType: Any? /* Nothing? & String */
    open var subType: ComponentSubType
    open var componentIndex: Number
    open var id: String
    open var name: String
    open var animatedValue: Array<dynamic /* String? | Number? | Date? */>
    open fun getDataParams(dataIndex: Number, dataType: String /* "main" | "node" | "edge" */ = definedExternally): CallbackDataParams
    open fun getFormattedLabel(dataIndex: Number, status: String /* "normal" | "emphasis" | "blur" | "select" */ = definedExternally, dataType: String /* "main" | "node" | "edge" */ = definedExternally, labelDimIndex: Number = definedExternally, formatter: String = definedExternally, extendParams: `T$61` = definedExternally): String
    open fun getFormattedLabel(dataIndex: Number): String
    open fun getFormattedLabel(dataIndex: Number, status: String /* "normal" | "emphasis" | "blur" | "select" */ = definedExternally): String
    open fun getFormattedLabel(dataIndex: Number, status: String /* "normal" | "emphasis" | "blur" | "select" */ = definedExternally, dataType: String /* "main" | "node" | "edge" */ = definedExternally): String
    open fun getFormattedLabel(dataIndex: Number, status: String /* "normal" | "emphasis" | "blur" | "select" */ = definedExternally, dataType: String /* "main" | "node" | "edge" */ = definedExternally, labelDimIndex: Number = definedExternally): String
    open fun getFormattedLabel(dataIndex: Number, status: String /* "normal" | "emphasis" | "blur" | "select" */ = definedExternally, dataType: String /* "main" | "node" | "edge" */ = definedExternally, labelDimIndex: Number = definedExternally, formatter: String = definedExternally): String
    open fun getFormattedLabel(dataIndex: Number, status: String /* "normal" | "emphasis" | "blur" | "select" */ = definedExternally, dataType: String /* "main" | "node" | "edge" */ = definedExternally, labelDimIndex: Number = definedExternally, formatter: (params: Any?) -> String = definedExternally, extendParams: `T$61` = definedExternally): String
    open fun getFormattedLabel(dataIndex: Number, status: String /* "normal" | "emphasis" | "blur" | "select" */ = definedExternally, dataType: String /* "main" | "node" | "edge" */ = definedExternally, labelDimIndex: Number = definedExternally, formatter: (params: Any?) -> String = definedExternally): String
    open fun getRawValue(idx: Number, dataType: String /* "main" | "node" | "edge" */ = definedExternally): Any
    open fun formatTooltip(dataIndex: Number, multipleSeries: Boolean = definedExternally, dataType: String = definedExternally): dynamic /* String | TooltipMarkupSection | TooltipMarkupNameValueBlock */
}
external interface DataHost {
    fun getData(dataType: String /* "main" | "node" | "edge" */ = definedExternally): SeriesData__0
}

external abstract class DataModel : Model<Any>, DataHost/*, DataFormatMixin */ {
    fun getDataParams(dataIndex: Number, dataType: String /* "main" | "node" | "edge" */ = definedExternally, el: Element__0 = definedExternally): CallbackDataParams = definedExternally
    override var ecModel: GlobalModel = definedExternally
}

external interface PayloadItem {
    var excludeSeriesId: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var animation: PayloadAnimationPart?
        get() = definedExternally
        set(value) = definedExternally
    @nativeGetter
    operator fun get(other: String): Any?
    @nativeSetter
    operator fun set(other: String, value: Any)
}

external interface Payload : PayloadItem {
    var type: String
    var escapeConnect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var batch: Array<PayloadItem>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface HighlightPayload : Payload {
    override var type: String /* "highlight" */
    var notBlur: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DownplayPayload : Payload {
    override var type: String /* "downplay" */
    var notBlur: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PayloadAnimationPart {
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var easing: dynamic /* Any | easingFunc? */
        get() = definedExternally
        set(value) = definedExternally
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$62` {
    var seriesIndex: Number
    var dataType: String? /* "main" | "node" | "edge" */
        get() = definedExternally
        set(value) = definedExternally
    var dataIndex: Array<Number>
}

external interface SelectChangedPayload : Payload {
    override var type: String /* "selectchanged" */
    var isFromClick: Boolean
    var fromAction: String /* "select" | "unselect" | "toggleSelected" */
    var fromActionPayload: Payload
    var selected: Array<`T$62`>
}

external interface `T$63` {
    var mainType: String
    var index: Number
}

external interface ViewRootGroup : Group {
    var __ecComponentInfo: `T$63`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ECElementEvent : ECEventData, CallbackDataParams {
    var type: String /* "click" | "dblclick" | "mousewheel" | "mouseout" | "mouseover" | "mouseup" | "mousedown" | "mousemove" | "contextmenu" | "drag" | "dragstart" | "dragend" | "dragenter" | "dragleave" | "dragover" | "drop" | "globalout" */
    var event: ElementEvent?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ECActionEvent : ECEventData {
    var type: String
    var componentType: String?
        get() = definedExternally
        set(value) = definedExternally
    var componentIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var seriesIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var escapeConnect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var batch: ECEventData?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ECEventData {
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}

external interface EventQueryItem {
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}

external interface ActionInfo {
    var type: String
    var event: String?
        get() = definedExternally
        set(value) = definedExternally
    var update: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ActionHandler {
    @nativeInvoke
    operator fun invoke(payload: Payload, ecModel: GlobalModel, api: ExtensionAPI): dynamic /* Unit | ECEventData */
}

external interface OptionPreprocessor {
    @nativeInvoke
    operator fun invoke(option: `T$178` /* `T$178` & AnimationOptionMixin & ColorPaletteOptionMixin */, isTheme: Boolean)
}

external interface PostUpdater {
    @nativeInvoke
    operator fun invoke(ecModel: GlobalModel, api: ExtensionAPI)
}

external interface StageHandlerReset {
    @nativeInvoke
    operator fun invoke(seriesModel: SeriesModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload = definedExternally): dynamic /* StageHandlerProgressExecutor | Array<StageHandlerProgressExecutor> | Unit */
}

external interface StageHandlerOverallReset {
    @nativeInvoke
    operator fun invoke(ecModel: GlobalModel, api: ExtensionAPI, payload: Payload = definedExternally)
}

external interface StageHandler {
    var createOnAllSeries: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var seriesType: String?
        get() = definedExternally
        set(value) = definedExternally
    var getTargetSeries: ((ecModel: GlobalModel, api: ExtensionAPI) -> HashMap__1<SeriesModel__0>)?
        get() = definedExternally
        set(value) = definedExternally
    var performRawSeries: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var plan: StageHandlerPlan?
        get() = definedExternally
        set(value) = definedExternally
    var overallReset: StageHandlerOverallReset?
        get() = definedExternally
        set(value) = definedExternally
    var reset: StageHandlerReset?
        get() = definedExternally
        set(value) = definedExternally
}

external interface StageHandlerInternal : StageHandler {
    var uid: String
    var visualType: String? /* "layout" | "visual" */
        get() = definedExternally
        set(value) = definedExternally
    var __prio: Number
    var __raw: dynamic /* StageHandler | StageHandlerOverallReset */
        get() = definedExternally
        set(value) = definedExternally
    var isVisual: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var isLayout: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface StageHandlerProgressExecutor {
    var dataEach: ((data: SeriesData__0, idx: Number) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
    var progress: ((params: StageHandlerProgressParams, data: SeriesData__0) -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface StageHandlerPlan {
    @nativeInvoke
    operator fun invoke(seriesModel: SeriesModel__0, ecModel: GlobalModel, api: ExtensionAPI, payload: Payload = definedExternally): dynamic /* typealias StageHandlerPlanReturn = dynamic */
}

external interface LoadingEffectCreator {
    @nativeInvoke
    operator fun invoke(api: ExtensionAPI, cfg: Any?): LoadingEffect
}

external interface LoadingEffect : Element__0 {
    var resize: () -> Unit
}

external interface OrdinalSortInfo {
    var ordinalNumbers: Array<OrdinalNumber>
}

external interface ScaleTick {
    var level: Number?
        get() = definedExternally
        set(value) = definedExternally
    var value: Number
}

external interface DataVisualDimensions {
    var tooltip: dynamic /* DimensionIndex? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var label: DimensionIndex?
        get() = definedExternally
        set(value) = definedExternally
    var itemName: DimensionIndex?
        get() = definedExternally
        set(value) = definedExternally
    var itemId: DimensionIndex?
        get() = definedExternally
        set(value) = definedExternally
    var itemGroupId: DimensionIndex?
        get() = definedExternally
        set(value) = definedExternally
    var itemChildGroupId: DimensionIndex?
        get() = definedExternally
        set(value) = definedExternally
    var seriesName: DimensionIndex?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DimensionDefinition {
    var type: Any?
        get() = definedExternally
        set(value) = definedExternally
    var name: DimensionName?
        get() = definedExternally
        set(value) = definedExternally
    var displayName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external var SOURCE_FORMAT_ORIGINAL: String /* "original" */

external var SOURCE_FORMAT_ARRAY_ROWS: String /* "arrayRows" */

external var SOURCE_FORMAT_OBJECT_ROWS: String /* "objectRows" */

external var SOURCE_FORMAT_KEYED_COLUMNS: String /* "keyedColumns" */

external var SOURCE_FORMAT_TYPED_ARRAY: String /* "typedArray" */

external var SOURCE_FORMAT_UNKNOWN: String /* "unknown" */

external var SERIES_LAYOUT_BY_COLUMN: String /* "column" */

external var SERIES_LAYOUT_BY_ROW: String /* "row" */

external interface `T$178` {
    var baseOption: Any?
        get() = definedExternally
        set(value) = definedExternally
    var options: Any?
        get() = definedExternally
        set(value) = definedExternally
    var media: Any?
        get() = definedExternally
        set(value) = definedExternally
    var timeline: dynamic /* ComponentOption? | Array<ComponentOption>? */
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var darkMode: dynamic /* Boolean? | "auto" */
        get() = definedExternally
        set(value) = definedExternally
    var textStyle: dynamic /* typealias Pick = dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var useUTC: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    @nativeGetter
    operator fun get(key: String): dynamic /* ComponentOption? | Array<ComponentOption>? | Dictionary<Any>? | Any? */
    @nativeSetter
    operator fun set(key: String, value: ComponentOption)
    @nativeSetter
    operator fun set(key: String, value: Array<ComponentOption>)
    @nativeSetter
    operator fun set(key: String, value: Dictionary<Any>)
    @nativeSetter
    operator fun set(key: String, value: Any)
    var stateAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ECUnitOption

external interface ECBasicOption : ECUnitOption {
    var baseOption: `T$178`? /* `T$178`? & AnimationOptionMixin? & ColorPaletteOptionMixin? */
        get() = definedExternally
        set(value) = definedExternally
    var timeline: dynamic /* ComponentOption? | Array<ComponentOption>? */
        get() = definedExternally
        set(value) = definedExternally
    var options: Array<Any /* `T$178` & AnimationOptionMixin & ColorPaletteOptionMixin */>?
        get() = definedExternally
        set(value) = definedExternally
    var media: Array<MediaUnit>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionDataItemObject<T> {
    var id: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var name: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var groupId: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var childGroupId: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* Array<T>? | T? */
        get() = definedExternally
        set(value) = definedExternally
    var selected: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphEdgeItemObject<VAL> : OptionDataItemObject<VAL> {
    var source: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var target: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionEncodeVisualDimensions {
    var tooltip: dynamic /* DimensionName? | DimensionIndex? | String? | Array<dynamic /* DimensionName | DimensionIndex | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* DimensionName? | DimensionIndex? | String? | Array<dynamic /* DimensionName | DimensionIndex | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var itemName: dynamic /* DimensionName? | DimensionIndex? | String? | Array<dynamic /* DimensionName | DimensionIndex | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var itemId: dynamic /* DimensionName? | DimensionIndex? | String? | Array<dynamic /* DimensionName | DimensionIndex | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var seriesName: dynamic /* DimensionName? | DimensionIndex? | String? | Array<dynamic /* DimensionName | DimensionIndex | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var itemGroupId: dynamic /* DimensionName? | DimensionIndex? | String? | Array<dynamic /* DimensionName | DimensionIndex | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var childGroupdId: dynamic /* DimensionName? | DimensionIndex? | String? | Array<dynamic /* DimensionName | DimensionIndex | String */>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface OptionEncode : OptionEncodeVisualDimensions {
    @nativeGetter
    operator fun get(coordDim: String): dynamic /* DimensionName? | DimensionIndex? | String? | Array<dynamic /* DimensionName | DimensionIndex | String */>? */
    @nativeSetter
    operator fun set(coordDim: String, value: Any?)
//    @nativeSetter
//    operator fun set(coordDim: String, value: DimensionIndex?)
//    @nativeSetter
//    operator fun set(coordDim: String, value: String?)
//    @nativeSetter
//    operator fun set(coordDim: String, value: Array<dynamic /* DimensionName | DimensionIndex | String */>?)
}

external interface CallbackDataParams {
    @nativeGetter
    operator fun get(key: String): Array<String>?
    @nativeSetter
    operator fun set(key: String, value: Array<String>)
    var componentType: String
    var componentSubType: String
    var componentIndex: Number
    var seriesType: String?
        get() = definedExternally
        set(value) = definedExternally
    var seriesIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var seriesId: String?
        get() = definedExternally
        set(value) = definedExternally
    var seriesName: String?
        get() = definedExternally
        set(value) = definedExternally
    var name: String
    var dataIndex: Number
    var data: dynamic /* String? | Number? | Date? | Dictionary<dynamic /* String? | Number? | Date? */>? | Array<dynamic /* String? | Number? | Date? */>? | OptionDataItemObject<dynamic /* String? | Number? | Date? */>? */
        get() = definedExternally
        set(value) = definedExternally
    var dataType: String? /* "main" | "node" | "edge" */
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* String? | Number? | Date? | Dictionary<dynamic /* String? | Number? | Date? */>? | Array<dynamic /* String? | Number? | Date? */>? | OptionDataItemObject<dynamic /* String? | Number? | Date? */>? */
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var borderColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var dimensionNames: Array<DimensionName>?
        get() = definedExternally
        set(value) = definedExternally
    var encode: DimensionUserOuputEncode?
        get() = definedExternally
        set(value) = definedExternally
    var marker: dynamic /* String? | RichTextTooltipMarker? */
        get() = definedExternally
        set(value) = definedExternally
    var status: String? /* "normal" | "emphasis" | "blur" | "select" */
        get() = definedExternally
        set(value) = definedExternally
    var dimensionIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var percent: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DecalObject {
    var symbol: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var symbolKeepAspect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var dashArrayX: dynamic /* Number? | Array<dynamic /* Number | Array<Number> */>? */
        get() = definedExternally
        set(value) = definedExternally
    var dashArrayY: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var rotation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxTileWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxTileHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MediaQuery {
    var minWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minAspectRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxAspectRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MediaUnit {
    var query: MediaQuery?
        get() = definedExternally
        set(value) = definedExternally
    var option: `T$178` /* `T$178` & AnimationOptionMixin & ColorPaletteOptionMixin */
}

external interface ComponentLayoutMode {
    var type: String? /* "box" */
        get() = definedExternally
        set(value) = definedExternally
    var ignoreSize: dynamic /* Boolean? | Array<Boolean>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ColorPaletteOptionMixin {
    var color: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? | Array<dynamic /* ColorString | LinearGradientObject | RadialGradientObject | ImagePatternObject | SVGPatternObject */>? */
        get() = definedExternally
        set(value) = definedExternally
    var colorLayer: Array<Array<dynamic /* ColorString | LinearGradientObject | RadialGradientObject | ImagePatternObject | SVGPatternObject */>>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BoxLayoutOptionMixin {
    var width: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var height: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var top: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var right: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var bottom: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var left: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface CircleLayoutOptionMixin {
    var center: Array<dynamic /* Number | String */>?
        get() = definedExternally
        set(value) = definedExternally
    var radius: dynamic /* Array<dynamic /* Number | String */>? | Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ShadowOptionMixin {
    var shadowBlur: Number?
        get() = definedExternally
        set(value) = definedExternally
    var shadowColor: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var shadowOffsetX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var shadowOffsetY: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BorderOptionMixin {
    var borderColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var borderWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var borderType: dynamic /* "solid" | "dotted" | "dashed" | Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var borderCap: String? /* "butt" | "round" | "square" */
        get() = definedExternally
        set(value) = definedExternally
    var borderJoin: String? /* "bevel" | "miter" | "round" */
        get() = definedExternally
        set(value) = definedExternally
    var borderDashOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var borderMiterLimit: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SunburstColorByMixin {
    var colorBy: String? /* "series" | "data" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface AnimationDelayCallbackParam {
    var count: Number
    var index: Number
}

external interface `AnimationOption$1` {
    var duration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var easing: dynamic /* Any | easingFunc? */
        get() = definedExternally
        set(value) = definedExternally
    var delay: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AnimationOptionMixin {
    var animation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var animationThreshold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var animationDuration: dynamic /* Number? | AnimationDurationCallback? */
        get() = definedExternally
        set(value) = definedExternally
    var animationEasing: dynamic /* Any | easingFunc? */
        get() = definedExternally
        set(value) = definedExternally
    var animationDelay: dynamic /* Number? | AnimationDelayCallback? */
        get() = definedExternally
        set(value) = definedExternally
    var animationDurationUpdate: dynamic /* Number? | AnimationDurationCallback? */
        get() = definedExternally
        set(value) = definedExternally
    var animationEasingUpdate: dynamic /* Any | easingFunc? */
        get() = definedExternally
        set(value) = definedExternally
    var animationDelayUpdate: dynamic /* Number? | AnimationDelayCallback? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$64` {
    var min: Number?
        get() = definedExternally
        set(value) = definedExternally
    var max: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RoamOptionMixin {
    var roam: dynamic /* Boolean? | "pan" | "move" | "zoom" | "scale" */
        get() = definedExternally
        set(value) = definedExternally
    var center: Array<dynamic /* Number | String */>?
        get() = definedExternally
        set(value) = definedExternally
    var zoom: Number?
        get() = definedExternally
        set(value) = definedExternally
    var scaleLimit: `T$64`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SymbolOptionMixin<T> {
    var symbol: dynamic /* String? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolSize: dynamic /* Number? | Array<Number>? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolRotate: dynamic /* Number? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolKeepAspect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var symbolOffset: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? | Any? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SymbolOptionMixin__0 : SymbolOptionMixin<Any>

external interface ItemStyleOption<TCbParams> : ShadowOptionMixin, BorderOptionMixin {
    var color: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? | Any? */
        get() = definedExternally
        set(value) = definedExternally
    var opacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var decal: dynamic /* DecalObject? | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var borderRadius: dynamic /* Array<dynamic /* Number | String */>? | Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ItemStyleOption__0 : ItemStyleOption<Any>

external interface LineStyleOption<Clr> : ShadowOptionMixin {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var color: Clr?
        get() = definedExternally
        set(value) = definedExternally
    var opacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var type: dynamic /* "solid" | "dotted" | "dashed" | Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var cap: String? /* "butt" | "round" | "square" */
        get() = definedExternally
        set(value) = definedExternally
    var join: String? /* "bevel" | "miter" | "round" */
        get() = definedExternally
        set(value) = definedExternally
    var dashOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var miterLimit: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LineStyleOption__0 : LineStyleOption<dynamic /* ColorString | LinearGradientObject | RadialGradientObject | ImagePatternObject | SVGPatternObject */>

external interface AreaStyleOption<Clr> : ShadowOptionMixin {
    var color: Clr?
        get() = definedExternally
        set(value) = definedExternally
    var opacity: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AreaStyleOption__0 : AreaStyleOption<dynamic /* ColorString | LinearGradientObject | RadialGradientObject | ImagePatternObject | SVGPatternObject */>

external interface VisualOptionUnit {
    var symbol: String?
        get() = definedExternally
        set(value) = definedExternally
    var symbolSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var color: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var colorAlpha: Number?
        get() = definedExternally
        set(value) = definedExternally
    var opacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var colorLightness: Number?
        get() = definedExternally
        set(value) = definedExternally
    var colorSaturation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var colorHue: Number?
        get() = definedExternally
        set(value) = definedExternally
    var decal: DecalObject?
        get() = definedExternally
        set(value) = definedExternally
    var liftZ: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TextCommonOption : ShadowOptionMixin {
    var color: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontStyle: String? /* "normal" | "italic" | "oblique" */
        get() = definedExternally
        set(value) = definedExternally
    var fontWeight: dynamic /* "normal" | "bold" | "bolder" | "lighter" | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var fontFamily: String?
        get() = definedExternally
        set(value) = definedExternally
    var fontSize: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var align: String? /* "left" | "center" | "right" */
        get() = definedExternally
        set(value) = definedExternally
    var verticalAlign: String? /* "top" | "middle" | "bottom" */
        get() = definedExternally
        set(value) = definedExternally
    var baseline: String? /* "top" | "middle" | "bottom" */
        get() = definedExternally
        set(value) = definedExternally
    var opacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* ColorString? | `T$3`? */
        get() = definedExternally
        set(value) = definedExternally
    var borderColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var borderWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var borderType: dynamic /* "solid" | "dotted" | "dashed" | Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var borderDashOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var borderRadius: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var padding: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var width: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var textBorderColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var textBorderWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var textBorderType: dynamic /* "solid" | "dotted" | "dashed" | Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var textBorderDashOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var textShadowBlur: Number?
        get() = definedExternally
        set(value) = definedExternally
    var textShadowColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var textShadowOffsetX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var textShadowOffsetY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tag: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LabelFormatterCallback<T> {
    @nativeInvoke
    operator fun invoke(params: T): String
}

external interface LabelOption : TextCommonOption {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var position: dynamic /* "left" | "right" | "top" | "bottom" | "inside" | "insideLeft" | "insideRight" | "insideTop" | "insideBottom" | "insideTopLeft" | "insideTopRight" | "insideBottomLeft" | "insideBottomRight" | Array<dynamic /* Number | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var distance: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rotate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var offset: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var minMargin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var overflow: String? /* "break" | "breakAll" | "truncate" | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var ellipsis: String?
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var precision: dynamic /* Number? | "auto" */
        get() = definedExternally
        set(value) = definedExternally
    var valueAnimation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rich: Dictionary<TextCommonOption>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SeriesLabelOption<T : CallbackDataParams> : LabelOption {
    var formatter: dynamic /* String? | LabelFormatterCallback<T>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SeriesLabelOption__0 : SeriesLabelOption<CallbackDataParams>

external interface LineLabelOption /*: Omit<LabelOption, String /* "distance" | "position" */>*/ {
    var position: String? /* "start" | "middle" | "end" | "insideStart" | "insideStartTop" | "insideStartBottom" | "insideMiddle" | "insideMiddleTop" | "insideMiddleBottom" | "insideEnd" | "insideEndTop" | "insideEndBottom" */
        get() = definedExternally
        set(value) = definedExternally
    var distance: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface LabelLineOption {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showAbove: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var length: Number?
        get() = definedExternally
        set(value) = definedExternally
    var length2: Number?
        get() = definedExternally
        set(value) = definedExternally
    var smooth: dynamic /* Boolean? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var minTurnAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SeriesLineLabelOption : LineLabelOption {
    var formatter: dynamic /* String? | LabelFormatterCallback<CallbackDataParams>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface LabelLayoutOptionCallbackParams {
    var dataIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dataType: String? /* "main" | "node" | "edge" */
        get() = definedExternally
        set(value) = definedExternally
    var seriesIndex: Number
    var text: String
    var align: ZRTextAlign
    var verticalAlign: ZRTextVerticalAlign
    var rect: RectLike
    var labelRect: RectLike
    var labelLinePoints: Array<Array<Number>>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LabelLayoutOption {
    var moveOverlap: String? /* "shiftX" | "shiftY" | "shuffleX" | "shuffleY" */
        get() = definedExternally
        set(value) = definedExternally
    var hideOverlap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var draggable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var x: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var y: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var dx: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dy: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rotate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var align: ZRTextAlign?
        get() = definedExternally
        set(value) = definedExternally
    var verticalAlign: ZRTextVerticalAlign?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fontSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var labelLinePoints: Array<Array<Number>>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TooltipFormatterCallback<T> {
    @nativeInvoke
    operator fun invoke(params: T, asyncTicket: String): dynamic /* String | HTMLElement | Array<HTMLElement> */
    @nativeInvoke
    operator fun invoke(params: T, asyncTicket: String, callback: (cbTicket: String, htmlOrDomNodes: Any /* String | HTMLElement | Array<HTMLElement> */) -> Unit): dynamic /* String | HTMLElement | Array<HTMLElement> */
}

external interface `T$65` {
    var contentSize: dynamic /* JsTuple<Number, Number> */
        get() = definedExternally
        set(value) = definedExternally
    var viewSize: dynamic /* JsTuple<Number, Number> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface TooltipPositionCallback {
    @nativeInvoke
    operator fun invoke(point: Any /* JsTuple<Number, Number> */, params: CallbackDataParams, el: HTMLDivElement?, rect: RectLike?, size: `T$65`): dynamic /* Array<dynamic /* Number | String */> | "inside" | "top" | "left" | "right" | "bottom" | typealias TooltipBoxLayoutOption = dynamic */
    @nativeInvoke
    operator fun invoke(point: Any /* JsTuple<Number, Number> */, params: CallbackDataParams, el: ZRText?, rect: RectLike?, size: `T$65`): dynamic /* Array<dynamic /* Number | String */> | "inside" | "top" | "left" | "right" | "bottom" | typealias TooltipBoxLayoutOption = dynamic */
    @nativeInvoke
    operator fun invoke(point: Any /* JsTuple<Number, Number> */, params: Array<CallbackDataParams>, el: HTMLDivElement?, rect: RectLike?, size: `T$65`): dynamic /* Array<dynamic /* Number | String */> | "inside" | "top" | "left" | "right" | "bottom" | typealias TooltipBoxLayoutOption = dynamic */
    @nativeInvoke
    operator fun invoke(point: Any /* JsTuple<Number, Number> */, params: Array<CallbackDataParams>, el: ZRText?, rect: RectLike?, size: `T$65`): dynamic /* Array<dynamic /* Number | String */> | "inside" | "top" | "left" | "right" | "bottom" | typealias TooltipBoxLayoutOption = dynamic */
}

external interface CommonTooltipOption<FormatterParams> {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var triggerOn: String? /* "mousemove" | "click" | "none" | "mousemove|click" */
        get() = definedExternally
        set(value) = definedExternally
    var alwaysShowContent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var formatter: dynamic /* String? | TooltipFormatterCallback<FormatterParams>? */
        get() = definedExternally
        set(value) = definedExternally
    var valueFormatter: ((value: dynamic /* String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */, dataIndex: Number) -> String)?
        get() = definedExternally
        set(value) = definedExternally
    var position: dynamic /* Array<dynamic /* Number | String */>? | "inside" | "top" | "left" | "right" | "bottom" | TooltipPositionCallback? | typealias TooltipBoxLayoutOption = dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var confine: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var align: String? /* "left" | "center" | "right" */
        get() = definedExternally
        set(value) = definedExternally
    var verticalAlign: String? /* "top" | "middle" | "bottom" */
        get() = definedExternally
        set(value) = definedExternally
    var showDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var hideDelay: Number?
        get() = definedExternally
        set(value) = definedExternally
    var transitionDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var enterable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var borderColor: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var borderRadius: Number?
        get() = definedExternally
        set(value) = definedExternally
    var borderWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var shadowBlur: Number?
        get() = definedExternally
        set(value) = definedExternally
    var shadowColor: String?
        get() = definedExternally
        set(value) = definedExternally
    var shadowOffsetX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var shadowOffsetY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var padding: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var extraCssText: String?
        get() = definedExternally
        set(value) = definedExternally
    var textStyle: dynamic /* typealias Pick = dynamic */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$180` {
    @nativeGetter
    operator fun get(key: String): Array<String>?
    @nativeSetter
    operator fun set(key: String, value: Array<String>)
    var componentType: String
    var name: String
}

external interface LabelFormatterParams {
    var value: dynamic /* Number | OrdinalNumber | String | Date */
        get() = definedExternally
        set(value) = definedExternally
    var axisDimension: String
    var axisIndex: Number
    var seriesData: Array<CallbackDataParams>
}

external interface `T$68` {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var icon: String?
        get() = definedExternally
        set(value) = definedExternally
    var size: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var margin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var color: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var throttle: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$69` {
    var seriesIndex: Number
    var dataIndex: Number
    var dataIndexInside: Number
}

external interface CommonAxisPointerOption {
    var show: dynamic /* Boolean? | "auto" */
        get() = definedExternally
        set(value) = definedExternally
    var z: Number?
        get() = definedExternally
        set(value) = definedExternally
    var zlevel: Number?
        get() = definedExternally
        set(value) = definedExternally
    var triggerOn: String? /* "click" | "mousemove" | "none" | "mousemove|click" */
        get() = definedExternally
        set(value) = definedExternally
    var type: String? /* "line" | "shadow" | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var snap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var triggerTooltip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var triggerEmphasis: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* Number? | OrdinalNumber? | String? | Date? */
        get() = definedExternally
        set(value) = definedExternally
    var status: String? /* "show" | "hide" */
        get() = definedExternally
        set(value) = definedExternally
    var label: LabelOption? /* LabelOption? & `T$67`? */
        get() = definedExternally
        set(value) = definedExternally
    var animation: dynamic /* Boolean? | "auto" */
        get() = definedExternally
        set(value) = definedExternally
    var animationDurationUpdate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var animationEasingUpdate: dynamic /* typealias ZREasing = dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var shadowStyle: AreaStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var handle: `T$68`? /* `T$68`? & ShadowOptionMixin? */
        get() = definedExternally
        set(value) = definedExternally
    var seriesDataIndices: Array<`T$69`>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ComponentOption {
    var mainType: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var name: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var z: Number?
        get() = definedExternally
        set(value) = definedExternally
    var zlevel: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DefaultStatesMixin {
    var emphasis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var select: Any?
        get() = definedExternally
        set(value) = definedExternally
    var blur: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DefaultStatesMixinEmphasis {
    var focus: String? /* "none" | "self" | "series" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface StatesMixinBase {
    var emphasis: Any?
        get() = definedExternally
        set(value) = definedExternally
    var select: Any?
        get() = definedExternally
        set(value) = definedExternally
    var blur: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface StatesOptionMixin<StateOption, StatesMixin/* : StatesMixinBase*/> {
    var emphasis: StateOption? /* StateOption? & dynamic & `T$70`? */
        get() = definedExternally
        set(value) = definedExternally
    var select: StateOption? /* StateOption? & dynamic & `T$71`? */
        get() = definedExternally
        set(value) = definedExternally
    var blur: StateOption? /* StateOption? & dynamic */
        get() = definedExternally
        set(value) = definedExternally
}

external interface UniversalTransitionOption {
    var enabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var delay: ((index: Number, count: Number) -> Number)?
        get() = definedExternally
        set(value) = definedExternally
    var divideShape: String? /* "clone" | "split" */
        get() = definedExternally
        set(value) = definedExternally
    var seriesKey: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SeriesOption<StateOption, StatesMixin /* : StatesMixinBase */> : ComponentOption, AnimationOptionMixin, ColorPaletteOptionMixin, StatesOptionMixin<StateOption, StatesMixin> {
    override var mainType: String? /* "series" */
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var blendMode: String?
        get() = definedExternally
        set(value) = definedExternally
    var cursor: String?
        get() = definedExternally
        set(value) = definedExternally
    var dataGroupId: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var data: Any?
        get() = definedExternally
        set(value) = definedExternally
    var colorBy: String? /* "series" | "data" */
        get() = definedExternally
        set(value) = definedExternally
    var legendHoverLink: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var progressive: dynamic /* Number? | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var progressiveThreshold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var progressiveChunkMode: String? /* "mod" */
        get() = definedExternally
        set(value) = definedExternally
    var coordinateSystem: String?
        get() = definedExternally
        set(value) = definedExternally
    var hoverLayerThreshold: Number?
        get() = definedExternally
        set(value) = definedExternally
    var seriesLayoutBy: Any? /* "column" | "row" */
        get() = definedExternally
        set(value) = definedExternally
    var labelLine: LabelLineOption?
        get() = definedExternally
        set(value) = definedExternally
    var labelLayout: dynamic /* LabelLayoutOption? | LabelLayoutOptionCallback? */
        get() = definedExternally
        set(value) = definedExternally
    var stateAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    var universalTransition: dynamic /* Boolean? | UniversalTransitionOption? */
        get() = definedExternally
        set(value) = definedExternally
    var selectedMap: dynamic /* Dictionary<Boolean>? | "all" */
        get() = definedExternally
        set(value) = definedExternally
    var selectedMode: dynamic /* "single" | "multiple" | "series" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SeriesOption__0 : SeriesOption<Any, DefaultStatesMixin>

external interface SeriesOption__1<StateOption> : SeriesOption<StateOption, DefaultStatesMixin>

external interface SeriesOnCartesianOptionMixin {
    var xAxisIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var yAxisIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var xAxisId: String?
        get() = definedExternally
        set(value) = definedExternally
    var yAxisId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SeriesOnPolarOptionMixin {
    var polarIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var polarId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SeriesOnSingleOptionMixin {
    var singleAxisIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var singleAxisId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SeriesOnGeoOptionMixin {
    var geoIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var geoId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SeriesOnCalendarOptionMixin {
    var calendarIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var calendarId: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SeriesLargeOptionMixin {
    var large: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var largeThreshold: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SeriesStackOptionMixin {
    var stack: String?
        get() = definedExternally
        set(value) = definedExternally
    var stackStrategy: String? /* "samesign" | "all" | "positive" | "negative" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SeriesSamplingOptionMixin {
    var sampling: dynamic /* "none" | "average" | "min" | "max" | "minmax" | "sum" | "lttb" | SamplingFunc? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SeriesEncodeOptionMixin {
    var datasetIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var datasetId: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var seriesLayoutBy: Any?
        get() = definedExternally
        set(value) = definedExternally
    var sourceHeader: dynamic /* Boolean? | "auto" | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var dimensions: Array<dynamic /* DimensionName | DimensionDefinition */>?
        get() = definedExternally
        set(value) = definedExternally
    var encode: OptionEncode?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$72` {
    var withTitle: String?
        get() = definedExternally
        set(value) = definedExternally
    var withoutTitle: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$73` {
    var prefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var withName: String?
        get() = definedExternally
        set(value) = definedExternally
    var withoutName: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$74` {
    var middle: String?
        get() = definedExternally
        set(value) = definedExternally
    var end: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$75` {
    var prefix: String?
        get() = definedExternally
        set(value) = definedExternally
    var withName: String?
        get() = definedExternally
        set(value) = definedExternally
    var withoutName: String?
        get() = definedExternally
        set(value) = definedExternally
    var separator: `T$74`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$76` {
    var maxCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var single: `T$73`?
        get() = definedExternally
        set(value) = definedExternally
    var multiple: `T$75`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$77` {
    var maxCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var allData: String?
        get() = definedExternally
        set(value) = definedExternally
    var partialData: String?
        get() = definedExternally
        set(value) = definedExternally
    var withName: String?
        get() = definedExternally
        set(value) = definedExternally
    var withoutName: String?
        get() = definedExternally
        set(value) = definedExternally
    var separator: `T$74`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AriaLabelOption {
    var enabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var description: String?
        get() = definedExternally
        set(value) = definedExternally
    var general: `T$72`?
        get() = definedExternally
        set(value) = definedExternally
    var series: `T$76`?
        get() = definedExternally
        set(value) = definedExternally
    var data: `T$77`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$78` {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var decals: dynamic /* DecalObject? | Array<DecalObject>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface AriaOption : AriaLabelOption {
    var mainType: String? /* "aria" */
        get() = definedExternally
        set(value) = definedExternally
    override var enabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var label: AriaLabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var decal: `T$78`?
        get() = definedExternally
        set(value) = definedExternally
}

external open class AreaStyleMixin {
    open fun getAreaStyle(self: Model__0, excludes: Array<Nothing?> = definedExternally, includes: Array<Nothing?> = definedExternally): dynamic /* typealias AreaStyleProps = dynamic */
}

external open class TextStyleMixin {
    open fun getTextColor(self: Model__0, isEmphasis: Boolean = definedExternally): ColorString
    open fun getFont(self: Model<dynamic /* typealias LabelFontOption = dynamic */>): String
    open fun getTextRect(self: Model<dynamic /* typealias Pick = dynamic */> /* Model<dynamic /* typealias Pick = dynamic */> & TextStyleMixin */, text: String): BoundingRect
}

external open class Model<Opt>(option: Opt = definedExternally, parentModel: Model__0 = definedExternally, ecModel: GlobalModel = definedExternally) : LineStyleMixin {
    override fun getLineStyle(self: Model__0, excludes: Array<Nothing?>): dynamic /* typealias LineStyleProps = dynamic */
    open fun getItemStyle(self: Model__0, excludes: Array<Nothing?> = definedExternally, includes: Array<Nothing?> = definedExternally): dynamic /* typealias ItemStyleProps = dynamic */
    open fun getTextColor(self: Model__0, isEmphasis: Boolean = definedExternally): ColorString
    open fun getFont(self: Model<dynamic /* typealias LabelFontOption = dynamic */>): String
    open fun getTextRect(self: Model<dynamic /* typealias Pick = dynamic */> /* Model<dynamic /* typealias Pick = dynamic */> & TextStyleMixin */, text: String): BoundingRect
    open fun getAreaStyle(self: Model__0, excludes: Array<Nothing?> = definedExternally, includes: Array<Nothing?> = definedExternally): dynamic /* typealias AreaStyleProps = dynamic */
    open var parentModel: Model__0
    open var ecModel: GlobalModel
    open var option: Opt
    open fun init(option: Opt, parentModel: Model__0 = definedExternally, ecModel: GlobalModel = definedExternally, vararg rest: Any)
    open fun mergeOption(option: Opt, ecModel: GlobalModel = definedExternally)
    open fun <R : Any> get(path: R, ignoreParent: Boolean = definedExternally): Any
    open fun <R : Any> get(path: R): Any
    open fun get(path: Any /* JsTuple<R> | JsTuple<R, S> | JsTuple<R, S, T> */, ignoreParent: Boolean = definedExternally): Any
    open fun get(path: Any /* JsTuple<R> | JsTuple<R, S> | JsTuple<R, S, T> */): Any
    open fun <R : Any> getShallow(key: R, ignoreParent: Boolean = definedExternally): Any
    open fun <R : Any> getModel(path: R, parentModel: Model__0 = definedExternally): Model<Any>
    open fun <R : Any> getModel(path: R): Model<Any>
    open fun getModel(path: Any /* JsTuple<R> | JsTuple<R, S> | JsTuple<Ra> | JsTuple<Rb, S> | JsTuple<R, S, T> */, parentModel: Model__0 = definedExternally): dynamic /* Model */
    open fun getModel(path: Any /* JsTuple<R> | JsTuple<R, S> | JsTuple<Ra> | JsTuple<Rb, S> | JsTuple<R, S, T> */): dynamic /* Model */
    open fun isEmpty(): Boolean
    open fun restoreData()
    open fun clone(): Model<Opt>
    open fun parsePath(path: String): Array<String>
    open fun parsePath(path: Array<String>): Array<String>
    open fun resolveParentPath(path: Array<String>): Array<String>
    open fun isAnimationEnabled(): Boolean
    open var _doGet: Any
}

external open class Model__0 : Model<ModelOption>

external open class OptionManager(api: ExtensionAPI) {
    open var _api: Any
    open var _timelineOptions: Any
    open var _mediaList: Any
    open var _mediaDefault: Any
    open var _currentMediaIndices: Any
    open var _optionBackup: Any
    open var _newBaseOption: Any
    open fun setOption(rawOption: ECBasicOption, optionPreprocessorFuncs: Array<OptionPreprocessor>, opt: InnerSetOptionOpts)
    open fun mountOption(isRecreate: Boolean): `T$178` /* `T$178` & AnimationOptionMixin & ColorPaletteOptionMixin */
    open fun getTimelineOption(ecModel: GlobalModel): `T$178` /* `T$178` & AnimationOptionMixin & ColorPaletteOptionMixin */
    open fun getMediaOption(ecModel: GlobalModel): Array<`T$178` /* `T$178` & AnimationOptionMixin & ColorPaletteOptionMixin */>
}

external interface `T$79` {
    var month: Array<String>
    var monthAbbr: Array<String>
    var dayOfWeek: Array<String>
    var dayOfWeekAbbr: Array<String>
}

external interface `T$80` {
    var all: String
    var inverse: String
}

external interface `T$81` {
    var selector: `T$80`
}

external interface `T$82` {
    var rect: String
    var polygon: String
    var lineX: String
    var lineY: String
    var keep: String
    var clear: String
}

external interface `T$83` {
    var title: `T$82`
}

external interface `T$84` {
    var title: String
    var lang: Array<String>
}

external interface `T$85` {
    var zoom: String
    var back: String
}

external interface `T$86` {
    var title: `T$85`
}

external interface `T$87` {
    var line: String
    var bar: String
    var stack: String
    var tiled: String
}

external interface `T$88` {
    var title: `T$87`
}

external interface `T$89` {
    var title: String
}

external interface `T$90` {
    var title: String
    var lang: Array<String>
}

external interface `T$91` {
    var brush: `T$83`
    var dataView: `T$84`
    var dataZoom: `T$86`
    var magicType: `T$88`
    var restore: `T$89`
    var saveAsImage: `T$90`
}

external interface `T$92` {
    var pie: String
    var bar: String
    var line: String
    var scatter: String
    var effectScatter: String
    var radar: String
    var tree: String
    var treemap: String
    var boxplot: String
    var candlestick: String
    var k: String
    var heatmap: String
    var map: String
    var parallel: String
    var lines: String
    var graph: String
    var sankey: String
    var funnel: String
    var gauge: String
    var pictorialBar: String
    var themeRiver: String
    var sunburst: String
    var custom: String
    var chart: String
}

external interface `T$93` {
    var typeNames: `T$92`
}

external interface `T$94` {
    var withTitle: String
    var withoutTitle: String
}

external interface `T$95` {
    var prefix: String
    var withName: String
    var withoutName: String
}

external interface `T$96` {
    var middle: String
    var end: String
}

external interface `T$97` {
    var prefix: String
    var withName: String
    var withoutName: String
    var separator: `T$96`
}

external interface `T$98` {
    var single: `T$95`
    var multiple: `T$97`
}

external interface `T$99` {
    var allData: String
    var partialData: String
    var withName: String
    var withoutName: String
    var separator: `T$96`
}

external interface `T$100` {
    var general: `T$94`
    var series: `T$98`
    var data: `T$99`
}

external object _default {
    var time: `T$79`
    var legend: `T$81`
    var toolbox: `T$91`
    var series: `T$93`
    var aria: `T$100`
}

external fun registerLocale(locale: String, localeObj: LocaleOption)

external interface GlobalModelSetOptionOpts {
    var replaceMerge: dynamic /* Nothing? & String | Array<Nothing? /* Nothing? & String */> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface InnerSetOptionOpts {
    var replaceMergeMainTypeMap: HashMap<Boolean, String>
}

external interface `T$101` {
    @nativeGetter
    operator fun get(k: String): dynamic /* Number? | Array<Number>? | String? | Array<String>? */
    @nativeSetter
    operator fun set(k: String, value: Number)
    @nativeSetter
    operator fun set(k: String, value: Array<Number>)
    @nativeSetter
    operator fun set(k: String, value: String)
    @nativeSetter
    operator fun set(k: String, value: Array<String>)
}

external interface QueryConditionKindA {
    var mainType: Any? /* Nothing? & String */
    var subType: ComponentSubType?
        get() = definedExternally
        set(value) = definedExternally
    var query: `T$101`?
        get() = definedExternally
        set(value) = definedExternally
    var filter: ((cmpt: ComponentModel__0) -> Boolean)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface QueryConditionKindB {
    var mainType: Any? /* Nothing? & String */
    var subType: ComponentSubType?
        get() = definedExternally
        set(value) = definedExternally
    var index: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var id: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var name: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface EachComponentAllCallback {
    @nativeInvoke
    operator fun invoke(mainType: String, model: ComponentModel__0, componentIndex: Number)
}

external interface EachComponentInMainTypeCallback {
    @nativeInvoke
    operator fun invoke(model: ComponentModel__0, componentIndex: Number)
}

external open class GlobalModel : Model<`T$178` /* `T$178` & AnimationOptionMixin & ColorPaletteOptionMixin */> {
    override var option: `T$178` /* `T$178` & AnimationOptionMixin & ColorPaletteOptionMixin */
    open var _theme: Any
    open var _locale: Any
    open var _optionManager: Any
    open var _componentsMap: Any
    open var _componentsCount: Any
    open var _seriesIndices: Any
    open var _seriesIndicesMap: Any
    open var _payload: Any
    open var scheduler: Scheduler
    open var ssr: Boolean
    open fun init(option: ECBasicOption, parentModel: Model__0, ecModel: GlobalModel, theme: Any?, locale: Any?, optionManager: OptionManager)
    open fun setOption(option: ECBasicOption, opts: GlobalModelSetOptionOpts = definedExternally, optionPreprocessorFuncs: Array<OptionPreprocessor> = definedExternally)
    open fun resetOption(type: String /* "recreate" | "timeline" | "media" */, opt: dynamic /* typealias Pick = dynamic */ = definedExternally): Boolean
    open var _resetOption: Any
    open fun mergeOption(option: `T$178` /* `T$178` & AnimationOptionMixin & ColorPaletteOptionMixin */)
    open var _mergeOption: Any
    open fun getOption(): `T$178` /* `T$178` & AnimationOptionMixin & ColorPaletteOptionMixin */
    open fun getTheme(): Model__0
    open fun getLocaleModel(): Model<LocaleOption>
    open fun setUpdatePayload(payload: Payload)
    open fun getUpdatePayload(): Payload
    open fun getComponent(mainType: Nothing? /* Nothing? & String */, idx: Number = definedExternally): ComponentModel__0
    open fun queryComponents(condition: QueryConditionKindB): Array<ComponentModel__0>
    open fun findComponents(condition: QueryConditionKindA): Array<ComponentModel__0>
    open fun <T> eachComponent(cb: EachComponentAllCallback, context: T = definedExternally)
    open fun eachComponent(cb: EachComponentAllCallback)
    open fun <T> eachComponent(mainType: String, cb: EachComponentInMainTypeCallback, context: T = definedExternally)
    open fun eachComponent(mainType: String, cb: EachComponentInMainTypeCallback)
    open fun <T> eachComponent(mainType: QueryConditionKindA, cb: EachComponentInMainTypeCallback, context: T = definedExternally)
    open fun eachComponent(mainType: QueryConditionKindA, cb: EachComponentInMainTypeCallback)
    open fun getSeriesByName(name: String): Array<SeriesModel__0>
    open fun getSeriesByName(name: Number): Array<SeriesModel__0>
    open fun getSeriesByIndex(seriesIndex: Number): SeriesModel__0
    open fun getSeriesByType(subType: ComponentSubType): Array<SeriesModel__0>
    open fun getSeries(): Array<SeriesModel__0>
    open fun getSeriesCount(): Number
    open fun <T> eachSeries(cb: (self: T, series: SeriesModel__0, rawSeriesIndex: Number) -> Unit, context: T = definedExternally)
    open fun <T> eachRawSeries(cb: (self: T, series: SeriesModel__0, rawSeriesIndex: Number) -> Unit, context: T = definedExternally)
    open fun <T> eachSeriesByType(subType: ComponentSubType, cb: (self: T, series: SeriesModel__0, rawSeriesIndex: Number) -> Unit, context: T = definedExternally)
    open fun <T> eachRawSeriesByType(subType: ComponentSubType, cb: (self: T, series: SeriesModel__0, rawSeriesIndex: Number) -> Unit, context: T = definedExternally)
    open fun isSeriesFiltered(seriesModel: SeriesModel__0): Boolean
    open fun getCurrentSeriesIndices(): Array<Number>
    open fun <T> filterSeries(cb: (self: T, series: SeriesModel__0, rawSeriesIndex: Number) -> Boolean, context: T = definedExternally)
    open fun restoreData(payload: Payload = definedExternally)

    companion object {
        var internalField: Any
    }
}

external interface UpdateLifecycleTransitionSeriesFinder {
    var seriesIndex: dynamic /* Number? | Array<Number>? | "all" | "none" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var seriesId: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var dimension: dynamic /* DimensionName | DimensionIndex | String */
        get() = definedExternally
        set(value) = definedExternally
}

external interface UpdateLifecycleTransitionItem {
    var from: dynamic /* UpdateLifecycleTransitionSeriesFinder? | Array<UpdateLifecycleTransitionSeriesFinder>? */
        get() = definedExternally
        set(value) = definedExternally
    var to: dynamic /* UpdateLifecycleTransitionSeriesFinder | Array<UpdateLifecycleTransitionSeriesFinder> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface UpdateLifecycleParams {
    var updatedSeries: Array<SeriesModel__0>?
        get() = definedExternally
        set(value) = definedExternally
    var optionChanged: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var seriesTransition: dynamic /* UpdateLifecycleTransitionItem? | Array<UpdateLifecycleTransitionItem>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface LifecycleEvents {
    @nativeGetter
    operator fun get(key: String): dynamic? /* JsTuple<GlobalModel, ExtensionAPI, UpdateLifecycleParams> */
    @nativeSetter
    operator fun set(key: String, value: dynamic /* JsTuple<GlobalModel, ExtensionAPI, UpdateLifecycleParams> */)
    var afterinit: dynamic /* JsTuple<EChartsType> */
        get() = definedExternally
        set(value) = definedExternally
    var afterupdate: dynamic /* JsTuple<GlobalModel, ExtensionAPI> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$102` {
    var regions: Array<GeoJSONRegion>
    var boundingRect: BoundingRect
    var regionsMap: HashMap<GeoJSONRegion, dynamic /* String | Number */>
}

external interface `T$103` {
    var geoJson: dynamic /* GeoJSON | GeoJSONCompressed */
        get() = definedExternally
        set(value) = definedExternally
    var geoJSON: dynamic /* GeoJSON | GeoJSONCompressed */
        get() = definedExternally
        set(value) = definedExternally
    var specialAreas: GeoSpecialAreas
}

external abstract class GeoJSONResource : GeoResource {
    constructor(mapName: String, geoJSON: String, specialAreas: GeoSpecialAreas)
    constructor(mapName: String, geoJSON: GeoJSON, specialAreas: GeoSpecialAreas)
    constructor(mapName: String, geoJSON: GeoJSONCompressed, specialAreas: GeoSpecialAreas)
    open var _geoJSON: Any
    open var _specialAreas: Any
    open var _mapName: Any
    open var _parsedMap: Any
    override fun load(nameMap: NameMap, nameProperty: String): `T$102`
    open var _parseToRegions: Any
    open fun getMapForUser(): `T$103`
}

external interface GeoJSONMapInput {
    var geoJSON: dynamic /* String | GeoJSON | GeoJSONCompressed */
        get() = definedExternally
        set(value) = definedExternally
    var specialAreas: GeoSpecialAreas
}

external interface SVGMapInput {
    var svg: dynamic /* String | Document | SVGElement */
        get() = definedExternally
        set(value) = definedExternally
}


external var `version$1`: Any

external object dependencies {
    var zrender: String
}

external object PRIORITY {
    var PROCESSOR: `T$18`
    var VISUAL: `T$19`
}

external var IN_MAIN_PROCESS_KEY: String /* "__flagInMainProcess" */

external var PENDING_UPDATE: String /* "__pendingUpdate" */

external var STATUS_NEEDS_UPDATE_KEY: String /* "__needsUpdateStatus" */

external var CONNECT_STATUS_KEY: String /* "__connectUpdateStatus" */

external interface SetOptionOpts {
    var notMerge: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var lazyUpdate: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var replaceMerge: dynamic /* Nothing? & String? | Array<Nothing? /* Nothing? & String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var transition: dynamic /* typealias SetOptionTransitionOpt = dynamic */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ResizeOpts {
    var width: dynamic /* Number? | "auto" */
        get() = definedExternally
        set(value) = definedExternally
    var height: dynamic /* Number? | "auto" */
        get() = definedExternally
        set(value) = definedExternally
    var animation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PostIniter {
    @nativeInvoke
    operator fun invoke(chart: EChartsType)
}

external interface RenderedEventParam {
    var elapsedTime: Number
}

external interface EChartsInitOpts {
    var locale: dynamic /* String? | LocaleOption? */
        get() = definedExternally
        set(value) = definedExternally
    var renderer: String? /* "canvas" | "svg" */
        get() = definedExternally
        set(value) = definedExternally
    var devicePixelRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var useDirtyRect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var useCoarsePointer: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var pointerSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var ssr: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var width: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var height: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$104` {
    var backgroundColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var pixelRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$105` {
    var useViewBox: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$106` {
    var type: String? /* "png" | "jpeg" | "svg" */
        get() = definedExternally
        set(value) = definedExternally
    var pixelRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var excludeComponents: Array<Nothing? /* Nothing? & String */>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$107` {
    var type: String? /* "png" | "jpeg" | "svg" */
        get() = definedExternally
        set(value) = definedExternally
    var pixelRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var connectedBackgroundColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var excludeComponents: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$108` {
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var flush: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$109` {
    var seriesIndex: Number
    var data: Any
}

external open class ECharts : Eventful<Any /* Any & `T$181` & `T$182` */> {
    constructor(dom: HTMLElement, theme: String = definedExternally, opts: EChartsInitOpts = definedExternally)
    constructor(dom: HTMLElement)
    constructor(dom: HTMLElement, theme: String = definedExternally)
    constructor(dom: HTMLElement, theme: ThemeOption = definedExternally, opts: EChartsInitOpts = definedExternally)
    constructor(dom: HTMLElement, theme: ThemeOption = definedExternally)
    open var id: String
    open var group: String
    open var _ssr: Any
    open var _zr: Any
    open var _dom: Any
    open var _model: Any
    open var _throttledZrFlush: Any
    open var _theme: Any
    open var _locale: Any
    open var _chartsViews: Any
    open var _chartsMap: Any
    open var _componentsViews: Any
    open var _componentsMap: Any
    open var _coordSysMgr: Any
    open var _api: Any
    open var _scheduler: Any
    open var _messageCenter: Any
    open var _pendingActions: Any
    open var _disposed: Any
    open var _loadingFX: Any
    open var _onframe: Any
    open fun getDom(): HTMLElement
    open fun getId(): String
    open fun getZr(): ZRenderType
    open fun isSSR(): Boolean
    open fun <Opt : ECBasicOption> setOption(option: Opt, notMerge: Boolean = definedExternally, lazyUpdate: Boolean = definedExternally)
    open fun <Opt : ECBasicOption> setOption(option: Opt)
    open fun <Opt : ECBasicOption> setOption(option: Opt, notMerge: Boolean = definedExternally)
    open fun <Opt : ECBasicOption> setOption(option: Opt, opts: SetOptionOpts = definedExternally)
    open var setTheme: Any
    open var getModel: Any
    open fun getOption(): ECBasicOption
    open fun getWidth(): Number
    open fun getHeight(): Number
    open fun getDevicePixelRatio(): Number
    open fun getRenderedCanvas(opts: Any = definedExternally): HTMLCanvasElement
    open fun renderToCanvas(opts: `T$104` = definedExternally): HTMLCanvasElement
    open fun renderToSVGString(opts: `T$105` = definedExternally): String
    open fun getSvgDataURL(): String
    open fun getDataURL(opts: `T$106` = definedExternally): String
    open fun getConnectedDataURL(opts: `T$107` = definedExternally): String
    open fun convertToPixel(finder: dynamic /* typealias ModelFinder$1 = dynamic */, value: Number): Number
    open fun convertToPixel(finder: dynamic /* typealias ModelFinder$1 = dynamic */, value: String): Number
    open fun convertToPixel(finder: dynamic /* typealias ModelFinder$1 = dynamic */, value: Date): Number
    open fun convertToPixel(finder: dynamic /* typealias ModelFinder$1 = dynamic */, value: Array<Any /* Number | OrdinalNumber | String | Date */>): Array<Number>
    open fun convertFromPixel(finder: dynamic /* typealias ModelFinder$1 = dynamic */, value: Number): Number
    open fun convertFromPixel(finder: dynamic /* typealias ModelFinder$1 = dynamic */, value: Array<Number>): Array<Number>
    open fun containPixel(finder: dynamic /* typealias ModelFinder$1 = dynamic */, value: Array<Number>): Boolean
    open fun getVisual(finder: dynamic /* typealias ModelFinder$1 = dynamic */, visualType: String): dynamic /* String | Number | Array<Number> | ImagePatternObject | SVGPatternObject | LinearGradientObject | RadialGradientObject */
    open var getViewOfComponentModel: Any
    open var getViewOfSeriesModel: Any
    open var _initEvents: Any
    open fun isDisposed(): Boolean
    open fun clear()
    open fun dispose()
    open fun resize(opts: ResizeOpts = definedExternally)
    open fun showLoading(cfg: Any? = definedExternally)
    open fun showLoading()
    open fun showLoading(name: String = definedExternally, cfg: Any? = definedExternally)
    open fun showLoading(name: String = definedExternally)
    open fun hideLoading()
    open fun makeActionFromEvent(eventObj: ECActionEvent): Payload
    open fun dispatchAction(payload: Payload, opt: Boolean = definedExternally)
    open fun dispatchAction(payload: Payload)
    open fun dispatchAction(payload: Payload, opt: `T$108` = definedExternally)
    open fun updateLabelLayout()
    open fun appendData(params: `T$109`)

    companion object {
        var internalField: Any
    }
}

external fun `init$1`(dom: HTMLElement? = definedExternally, theme: String? = definedExternally, opts: EChartsInitOpts = definedExternally): EChartsType

external fun `init$1`(): EChartsType

external fun `init$1`(dom: HTMLElement? = definedExternally): EChartsType

external fun `init$1`(dom: HTMLElement? = definedExternally, theme: String? = definedExternally): EChartsType

external fun `init$1`(dom: HTMLElement? = definedExternally, theme: Any? = definedExternally, opts: EChartsInitOpts = definedExternally): EChartsType

external fun `init$1`(dom: HTMLElement? = definedExternally, theme: Any? = definedExternally): EChartsType

external fun connect(groupId: String): String

external fun connect(groupId: Array<EChartsType>): String

external fun disconnect(groupId: String)

external var disConnect: Any

external fun `dispose$1`(chart: EChartsType)

external fun `dispose$1`(chart: HTMLElement)

external fun `dispose$1`(chart: String)

external fun getInstanceByDom(dom: HTMLElement): EChartsType?

external fun getInstanceById(key: String): EChartsType?

external fun registerTheme(name: String, theme: ThemeOption)

external fun registerPreprocessor(preprocessorFunc: OptionPreprocessor)

external fun registerProcessor(priority: Number, processor: StageHandler = definedExternally)

external fun registerProcessor(priority: Number)

external fun registerProcessor(priority: Number, processor: StageHandlerOverallReset = definedExternally)

external fun registerProcessor(priority: StageHandler, processor: StageHandler = definedExternally)

external fun registerProcessor(priority: StageHandler)

external fun registerProcessor(priority: StageHandler, processor: StageHandlerOverallReset = definedExternally)

external fun registerProcessor(priority: StageHandlerOverallReset, processor: StageHandler = definedExternally)

external fun registerProcessor(priority: StageHandlerOverallReset)

external fun registerProcessor(priority: StageHandlerOverallReset, processor: StageHandlerOverallReset = definedExternally)

external fun registerPostInit(postInitFunc: PostIniter)

external fun registerPostUpdate(postUpdateFunc: PostUpdater)

external fun <T : String> registerUpdateLifecycle(name: T, cb: (args: Any) -> Unit)

external fun registerAction(type: String, eventName: String, action: ActionHandler)

external fun registerAction(type: String, action: ActionHandler)

external fun registerAction(actionInfo: ActionInfo, action: ActionHandler)

external fun registerCoordinateSystem(type: String, coordSysCreator: CoordinateSystemCreator)

external fun getCoordinateSystemDimensions(type: String): Array<dynamic /* DimensionName | DimensionDefinition */>

external fun registerLayout(priority: Number, layoutTask: StageHandler)

external fun registerLayout(priority: Number, layoutTask: StageHandlerOverallReset)

external fun registerLayout(layoutTask: StageHandler)

external fun registerLayout(layoutTask: StageHandlerOverallReset)

external fun registerVisual(priority: Number, layoutTask: StageHandler)

external fun registerVisual(priority: Number, layoutTask: StageHandlerOverallReset)

external fun registerVisual(layoutTask: StageHandler)

external fun registerVisual(layoutTask: StageHandlerOverallReset)

external fun registerLoading(name: String, loadingFx: LoadingEffectCreator)

external fun setCanvasCreator(creator: () -> HTMLCanvasElement)

external fun registerMap(mapName: Any, geoJson: Any, specialAreas: Any = definedExternally)

external fun getMap(mapName: String): Any

external var registerTransform: Any

external object dataTool {
}

external interface EChartsType : ECharts

external fun parse(colorStr: String, rgbaArr: Array<Number> = definedExternally): Array<Number>

external fun lift(color: String, level: Number): String

external fun toHex(color: String): String

external fun fastLerp(normalizedValue: Number, colors: Array<Array<Number>>, out: Array<Number> = definedExternally): Array<Number>

external var fastMapToColor: Any

external interface LerpFullOutput {
    var color: String
    var leftIndex: Number
    var rightIndex: Number
    var value: Number
}

external fun `lerp$1`(normalizedValue: Number, colors: Array<String>, fullOutput: Boolean): LerpFullOutput

external fun `lerp$1`(normalizedValue: Number, colors: Array<String>): String

external var mapToColor: Any

external fun modifyHSL(color: String, h: Number = definedExternally, s: Number = definedExternally, l: Number = definedExternally): String

external fun modifyAlpha(color: String, alpha: Number = definedExternally): String

external fun stringify(arrColor: Array<Number>, type: String): String

external fun lum(color: String, backgroundLum: Number): Number

external fun random(): String

external fun liftColor(color: GradientObject): GradientObject

external fun liftColor(color: String): String

external var color_d_parse: Any

external var color_d_lift: Any

external var color_d_toHex: Any

external var color_d_fastLerp: Any

external var color_d_fastMapToColor: Any

external var color_d_mapToColor: Any

external var color_d_modifyHSL: Any

external var color_d_modifyAlpha: Any

external var color_d_stringify: Any

external var color_d_lum: Any

external var color_d_random: Any

external var color_d_liftColor: Any

external interface ThrottleController {
    fun clear()
    fun debounceNextCall(debounceDelay: Number)
}

external fun <T : ThrottleFunction> throttle(fn: T, delay: Number = definedExternally, debounce: Boolean = definedExternally): T /* T & ThrottleController */

external interface EnableDataStackDimensionsInput {
    var schema: SeriesDataSchema
    var store: DataStore?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$110` {
    var stackedCoordDimension: String?
        get() = definedExternally
        set(value) = definedExternally
    var byIndex: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external fun enableDataStack(seriesModel: SeriesModel<SeriesOption__0 /* SeriesOption__0 & SeriesStackOptionMixin */>, dimensionsInput: EnableDataStackDimensionsInput, opt: `T$110` = definedExternally): dynamic /* typealias Pick = dynamic */

external fun enableDataStack(seriesModel: SeriesModel<SeriesOption__0 /* SeriesOption__0 & SeriesStackOptionMixin */>, dimensionsInput: EnableDataStackDimensionsInput): dynamic /* typealias Pick = dynamic */

external fun enableDataStack(seriesModel: SeriesModel<SeriesOption__0 /* SeriesOption__0 & SeriesStackOptionMixin */>, dimensionsInput: EnableDataStackDimensionsInputLegacy, opt: `T$110` = definedExternally): dynamic /* typealias Pick = dynamic */

external fun enableDataStack(seriesModel: SeriesModel<SeriesOption__0 /* SeriesOption__0 & SeriesStackOptionMixin */>, dimensionsInput: EnableDataStackDimensionsInputLegacy): dynamic /* typealias Pick = dynamic */

external fun isDimensionStacked(data: SeriesData__0, stackedDim: String): Boolean

external fun getStackedDimension(data: SeriesData__0, targetDim: String): DimensionName

external interface `T$111` {
    var name: String
    var option: CommonTooltipOption<Any> /* CommonTooltipOption<Any> & `T$179` */
}

external interface ECData {
    var dataIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dataModel: DataModel?
        get() = definedExternally
        set(value) = definedExternally
    var eventData: ECEventData?
        get() = definedExternally
        set(value) = definedExternally
    var seriesIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var dataType: String? /* "main" | "node" | "edge" */
        get() = definedExternally
        set(value) = definedExternally
    var focus: dynamic /* "none" | "self" | "series" | ArrayLike<Number>? | Dictionary<ArrayLike<Number>>? */
        get() = definedExternally
        set(value) = definedExternally
    var blurScope: String? /* "coordinateSystem" | "series" | "global" */
        get() = definedExternally
        set(value) = definedExternally
    var ssrType: String? /* "chart" | "legend" */
        get() = definedExternally
        set(value) = definedExternally
    var componentMainType: Any? /* Nothing? & String? */
        get() = definedExternally
        set(value) = definedExternally
    var componentIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var componentHighDownName: String?
        get() = definedExternally
        set(value) = definedExternally
    var tooltipConfig: `T$111`?
        get() = definedExternally
        set(value) = definedExternally
}

external var getECData: (hostObj: Element<ElementProps>) -> ECData

external interface CoordDimensionDefinition : DimensionDefinition {
    var dimsDef: Array<dynamic /* DimensionName | `T$112` */>?
        get() = definedExternally
        set(value) = definedExternally
    var otherDims: DataVisualDimensions?
        get() = definedExternally
        set(value) = definedExternally
    var ordinalMeta: OrdinalMeta?
        get() = definedExternally
        set(value) = definedExternally
    var coordDim: DimensionName?
        get() = definedExternally
        set(value) = definedExternally
    var coordDimIndex: DimensionIndex?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PrepareSeriesDataSchemaParams {
    var coordDimensions: Array<dynamic /* Any | CoordDimensionDefinition */>?
        get() = definedExternally
        set(value) = definedExternally
    var dimensionsDefine: Array<dynamic /* DimensionName | DimensionDefinition */>?
        get() = definedExternally
        set(value) = definedExternally
    var encodeDefine: dynamic /* HashMap<dynamic /* DimensionName | DimensionIndex | String | Array<dynamic /* DimensionName | DimensionIndex | String */> */, DimensionName>? | OptionEncode? */
        get() = definedExternally
        set(value) = definedExternally
    var dimensionsCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var encodeDefaulter: EncodeDefaulter?
        get() = definedExternally
        set(value) = definedExternally
    var generateCoord: String?
        get() = definedExternally
        set(value) = definedExternally
    var generateCoordCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var canOmitUnusedDimensions: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external fun createDimensions(source: Source, opt: PrepareSeriesDataSchemaParams = definedExternally): Array<SeriesDimensionDefine>

external fun createDimensions(source: Source): Array<SeriesDimensionDefine>

external fun createDimensions(source: OptionSourceDataOriginal<Any? /* String? | Number? | Date? */, Any? /* VAL | Array<VAL> | OptionDataItemObject<VAL> */>, opt: PrepareSeriesDataSchemaParams = definedExternally): Array<SeriesDimensionDefine>

external fun createDimensions(source: OptionSourceDataOriginal<Any? /* String? | Number? | Date? */, Any? /* VAL | Array<VAL> | OptionDataItemObject<VAL> */>): Array<SeriesDimensionDefine>

external fun createDimensions(source: OptionSourceDataObjectRows<Any? /* String? | Number? | Date? */>, opt: PrepareSeriesDataSchemaParams = definedExternally): Array<SeriesDimensionDefine>

external fun createDimensions(source: OptionSourceDataObjectRows<Any? /* String? | Number? | Date? */>): Array<SeriesDimensionDefine>

external fun createDimensions(source: OptionSourceDataArrayRows<Any? /* String? | Number? | Date? */>, opt: PrepareSeriesDataSchemaParams = definedExternally): Array<SeriesDimensionDefine>

external fun createDimensions(source: OptionSourceDataArrayRows<Any? /* String? | Number? | Date? */>): Array<SeriesDimensionDefine>

external fun createDimensions(source: OptionSourceDataKeyedColumns<Any? /* String? | Number? | Date? */>, opt: PrepareSeriesDataSchemaParams = definedExternally): Array<SeriesDimensionDefine>

external fun createDimensions(source: OptionSourceDataKeyedColumns<Any? /* String? | Number? | Date? */>): Array<SeriesDimensionDefine>

external fun createDimensions(source: OptionSourceDataTypedArray, opt: PrepareSeriesDataSchemaParams = definedExternally): Array<SeriesDimensionDefine>

external fun createDimensions(source: OptionSourceDataTypedArray): Array<SeriesDimensionDefine>

external fun enableHoverEmphasis(el: Element__0, focus: String /* "none" | "self" | "series" */ = definedExternally, blurScope: String /* "coordinateSystem" | "series" | "global" */ = definedExternally)

external fun enableHoverEmphasis(el: Element__0)

external fun enableHoverEmphasis(el: Element__0, focus: String /* "none" | "self" | "series" */ = definedExternally)

external fun enableHoverEmphasis(el: Element__0, focus: ArrayLike<Number> = definedExternally, blurScope: String /* "coordinateSystem" | "series" | "global" */ = definedExternally)

external fun enableHoverEmphasis(el: Element__0, focus: ArrayLike<Number> = definedExternally)

external fun enableHoverEmphasis(el: Element__0, focus: Dictionary<ArrayLike<Number>> = definedExternally, blurScope: String /* "coordinateSystem" | "series" | "global" */ = definedExternally)

external fun enableHoverEmphasis(el: Element__0, focus: Dictionary<ArrayLike<Number>> = definedExternally)

external fun createList(seriesModel: SeriesModel__0): SeriesData<Model<Any>, DefaultDataVisual>

external object dataStack {
    var isDimensionStacked: Any
    var enableDataStack: Any
    var getStackedDimension: Any
}

external fun createScale(dataExtent: Array<Number>, option: Any?): Scale<Dictionary<Any>>

external fun createScale(dataExtent: Array<Number>, option: AxisBaseModel__0?): Scale<Dictionary<Any>>

external fun mixinAxisModelCommonMethods(Model: Model__0)

external interface `T$113` {
    var state: String? /* "normal" | "emphasis" | "blur" | "select" */
        get() = definedExternally
        set(value) = definedExternally
}

external fun createTextStyle(textStyleModel: Model<TextCommonOption>, opts: `T$113` = definedExternally): TextStyleProps

external var helper_d_getLayoutRect: Any

external var helper_d_getECData: Any

external var helper_d_createList: Any

external var helper_d_dataStack: Any

external var helper_d_createScale: Any

external var helper_d_mixinAxisModelCommonMethods: Any

external var helper_d_createTextStyle: Any

external var helper_d_createDimensions: Any

external var helper_d_createSymbol: Any

external var helper_d_enableHoverEmphasis: Any

external interface `T$114` {
    var width: Number
}

external interface Platform {
    fun createCanvas(): HTMLCanvasElement
    fun measureText(text: String, font: String = definedExternally): `T$114`
    fun loadImage(src: String, onload: () -> Any, onerror: () -> Any): HTMLImageElement
}

external interface PlatformPartial {
    var createCanvas: (() -> HTMLCanvasElement)?
        get() = definedExternally
        set(value) = definedExternally
    var measureText: ((text: String, font: String) -> `T$114`)?
        get() = definedExternally
        set(value) = definedExternally
    var loadImage: ((src: String, onload: () -> dynamic, onerror: () -> dynamic) -> HTMLImageElement)?
        get() = definedExternally
        set(value) = definedExternally
}

external fun setPlatformAPI(newPlatformApis: PlatformPartial)

external fun parseGeoJSON(geoJson: GeoJSON, nameProperty: String): Array<GeoJSONRegion>

external fun parseGeoJSON(geoJson: GeoJSONCompressed, nameProperty: String): Array<GeoJSONRegion>

external fun linearMap(param_val: Number, domain: Array<Number>, range: Array<Number>, clamp: Boolean = definedExternally): Number

external fun round(x: Number, precision: Number = definedExternally): Number

external fun round(x: Number): Number

external fun round(x: String, precision: Number = definedExternally): Number

external fun round(x: String): Number

external fun round(x: Number, precision: Number, returnStr: Boolean): dynamic /* Number | String */

external fun round(x: String, precision: Number, returnStr: Boolean): dynamic /* Number | String */

external fun <T : Array<Number>> asc(arr: T): T

external fun getPrecision(param_val: String): Number

external fun getPrecision(param_val: Number): Number

external fun getPrecisionSafe(param_val: String): Number

external fun getPrecisionSafe(param_val: Number): Number

external fun getPixelPrecision(dataExtent: Any /* JsTuple<Number, Number> */, pixelExtent: Any /* JsTuple<Number, Number> */): Number

external fun getPercentWithPrecision(valueList: Array<Number>, idx: Number, precision: Number): Number

external var MAX_SAFE_INTEGER: Any

external fun remRadian(radian: Number): Number

external fun isRadianAroundZero(param_val: Number): Boolean

external fun parseDate(value: Any): Date

external fun quantity(param_val: Number): Number

external fun quantityExponent(param_val: Number): Number

external fun nice(param_val: Number, round: Boolean = definedExternally): Number

external fun quantile(ascArr: Array<Number>, p: Number): Number

external interface IntervalItem {
    var interval: dynamic /* JsTuple<Number, Number> */
        get() = definedExternally
        set(value) = definedExternally
    var close: dynamic /* JsTuple<Number, Number> */
        get() = definedExternally
        set(value) = definedExternally
}

external fun reformIntervals(list: Array<IntervalItem>): Array<IntervalItem>

external fun numericToNumber(param_val: Any): Number

external fun isNumeric(param_val: Any): Boolean

external var number_d_linearMap: Any

external var number_d_round: Any

external var number_d_asc: Any

external var number_d_getPrecision: Any

external var number_d_getPrecisionSafe: Any

external var number_d_getPixelPrecision: Any

external var number_d_getPercentWithPrecision: Any

external var number_d_MAX_SAFE_INTEGER: Any

external var number_d_remRadian: Any

external var number_d_isRadianAroundZero: Any

external var number_d_parseDate: Any

external var number_d_quantity: Any

external var number_d_quantityExponent: Any

external var number_d_nice: Any

external var number_d_quantile: Any

external var number_d_reformIntervals: Any

external var number_d_isNumeric: Any

external var number_d_numericToNumber: Any

external fun format(time: Any, template: String, isUTC: Boolean, lang: String = definedExternally): String

external fun format(time: Any, template: String, isUTC: Boolean): String

external fun format(time: Any, template: String, isUTC: Boolean, lang: Model<LocaleOption> = definedExternally): String

external var time_d_format: Any

external var graphic_d_extendShape: Any

external var graphic_d_extendPath: Any

external var graphic_d_makePath: Any

external var graphic_d_makeImage: Any

external var graphic_d_resizePath: Any

external var graphic_d_createIcon: Any

external var graphic_d_updateProps: Any

external var graphic_d_initProps: Any

external var graphic_d_getTransform: Any

external var graphic_d_clipPointsByRect: Any

external var graphic_d_clipRectByRect: Any

external var graphic_d_registerShape: Any

external var graphic_d_getShapeClass: Any

external var graphic_d_Group: Any

external var graphic_d_Line: Any

external var graphic_d_Circle: Any

external var graphic_d_Ellipse: Any

external var graphic_d_Sector: Any

external var graphic_d_Ring: Any

external var graphic_d_Polygon: Any

external var graphic_d_Polyline: Any

external var graphic_d_Rect: Any

external var graphic_d_BezierCurve: Any

external var graphic_d_Arc: Any

external var graphic_d_IncrementalDisplayable: Any

external var graphic_d_CompoundPath: Any

external var graphic_d_LinearGradient: Any

external var graphic_d_RadialGradient: Any

external var graphic_d_BoundingRect: Any

external var format_d_addCommas: Any

external var format_d_toCamelCase: Any

external var format_d_encodeHTML: Any

external var format_d_formatTpl: Any

external var format_d_getTooltipMarker: Any

external var format_d_formatTime: Any

external var format_d_capitalFirst: Any

external var format_d_truncateText: Any

external var format_d_getTextRect: Any

external var `util_d$1_map`: Any

external var `util_d$1_each`: Any

external var `util_d$1_indexOf`: Any

external var `util_d$1_inherits`: Any

external var `util_d$1_reduce`: Any

external var `util_d$1_filter`: Any

external var `util_d$1_bind`: Any

external var `util_d$1_curry`: Any

external var `util_d$1_isArray`: Any

external var `util_d$1_isString`: Any

external var `util_d$1_isObject`: Any

external var `util_d$1_isFunction`: Any

external var `util_d$1_extend`: Any

external var `util_d$1_defaults`: Any

external var `util_d$1_clone`: Any

external var `util_d$1_merge`: Any

external open class Browser {
    open var firefox: Boolean
    open var ie: Boolean
    open var edge: Boolean
    open var newEdge: Boolean
    open var weChat: Boolean
    open var version: dynamic /* String | Number */
}

external open class Env {
    open var browser: Browser
    open var node: Boolean
    open var wxa: Boolean
    open var worker: Boolean
    open var svgSupported: Boolean
    open var touchEventsSupported: Boolean
    open var pointerEventsSupported: Boolean
    open var domSupported: Boolean
    open var transformSupported: Boolean
    open var transform3dSupported: Boolean
    open var hasGlobalWindow: Boolean
}

external var env: Env

external fun brushSingle(ctx: CanvasRenderingContext2D, el: Displayable__0)

external fun extendComponentModel(proto: Any?): ComponentModel__0

external fun extendComponentView(proto: Any?): ChartView

external fun extendSeriesModel(proto: Any?): SeriesModel__0

external fun extendChartView(proto: Any?): ChartView

external interface ParallelCoordinateSystemOption : ComponentOption, BoxLayoutOptionMixin {
    override var mainType: String? /* "parallel" */
        get() = definedExternally
        set(value) = definedExternally
    var layout: String? /* "horizontal" | "vertical" */
        get() = definedExternally
        set(value) = definedExternally
    var axisExpandable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var axisExpandCenter: Number?
        get() = definedExternally
        set(value) = definedExternally
    var axisExpandCount: Number?
        get() = definedExternally
        set(value) = definedExternally
    var axisExpandWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var axisExpandTriggerOn: String? /* "click" | "mousemove" */
        get() = definedExternally
        set(value) = definedExternally
    var axisExpandRate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var axisExpandDebounce: Number?
        get() = definedExternally
        set(value) = definedExternally
    var axisExpandSlideTriggerArea: dynamic /* JsTuple<Number, Number, Number> */
        get() = definedExternally
        set(value) = definedExternally
    var axisExpandWindow: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var parallelAxisDefault: dynamic /* ValueAxisBaseOption? | LogAxisBaseOption? | CategoryAxisBaseOption? | TimeAxisBaseOption? | AxisBaseOptionCommon? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$183` {
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var borderWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var borderColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var opacity: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface Dependencies {
    var grid: dynamic /* ValueAxisBaseOption | LogAxisBaseOption | CategoryAxisBaseOption | TimeAxisBaseOption | AxisBaseOptionCommon | ValueAxisBaseOption | LogAxisBaseOption | CategoryAxisBaseOption | TimeAxisBaseOption | AxisBaseOptionCommon | AxisPointerOption */
        get() = definedExternally
        set(value) = definedExternally
    var polar: dynamic /* ValueAxisBaseOption | LogAxisBaseOption | CategoryAxisBaseOption | TimeAxisBaseOption | AxisBaseOptionCommon | ValueAxisBaseOption | LogAxisBaseOption | CategoryAxisBaseOption | TimeAxisBaseOption | AxisBaseOptionCommon */
        get() = definedExternally
        set(value) = definedExternally
    var parallel: dynamic /* ValueAxisBaseOption | LogAxisBaseOption | CategoryAxisBaseOption | TimeAxisBaseOption | AxisBaseOptionCommon */
        get() = definedExternally
        set(value) = definedExternally
}

external interface RadarIndicatorOption {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var text: String?
        get() = definedExternally
        set(value) = definedExternally
    var min: Number?
        get() = definedExternally
        set(value) = definedExternally
    var max: Number?
        get() = definedExternally
        set(value) = definedExternally
    var color: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var axisType: String? /* "value" | "log" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$115` {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var formatter: dynamic /* String? | ((name: String, indicatorOpt: dynamic /* ValueAxisBaseOption | LogAxisBaseOption | CategoryAxisBaseOption | TimeAxisBaseOption | AxisBaseOptionCommon */) -> String)? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface RadarOption : ComponentOption, CircleLayoutOptionMixin {
    override var mainType: String? /* "radar" */
        get() = definedExternally
        set(value) = definedExternally
    var startAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var shape: String? /* "polygon" | "circle" */
        get() = definedExternally
        set(value) = definedExternally
    var axisLine: Any?
        get() = definedExternally
        set(value) = definedExternally
    var axisTick: Any?
        get() = definedExternally
        set(value) = definedExternally
    var axisLabel: Any?
        get() = definedExternally
        set(value) = definedExternally
    var splitLine: Any?
        get() = definedExternally
        set(value) = definedExternally
    var splitArea: Any?
        get() = definedExternally
        set(value) = definedExternally
    var axisName: `T$115`? /* `T$115`? & LabelOption? */
        get() = definedExternally
        set(value) = definedExternally
    var axisNameGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var triggerEvent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var scale: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var splitNumber: Number?
        get() = definedExternally
        set(value) = definedExternally
    var boundaryGap: dynamic /* Boolean? | Any */
        get() = definedExternally
        set(value) = definedExternally
    var indicator: Array<RadarIndicatorOption>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CalendarMonthLabelFormatterCallbackParams {
    var nameMap: String
    var yyyy: String
    var yy: String
    var MM: String
    var M: Number
}

external interface CalendarYearLabelFormatterCallbackParams {
    var nameMap: String
    var start: String
    var end: String
}

external interface `T$116` {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CalendarOption : ComponentOption, BoxLayoutOptionMixin {
    override var mainType: String? /* "calendar" */
        get() = definedExternally
        set(value) = definedExternally
    var cellSize: dynamic /* Number? | "auto" | Array<dynamic /* Number | "auto" */>? */
        get() = definedExternally
        set(value) = definedExternally
    var orient: String? /* "vertical" | "horizontal" */
        get() = definedExternally
        set(value) = definedExternally
    var splitLine: `T$116`?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var range: dynamic /* Date? | String? | Number? | Array<dynamic /* Date | String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var dayLabel: dynamic /* typealias Omit = dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var monthLabel: dynamic /* typealias Omit = dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var yearLabel: dynamic /* typealias Omit = dynamic */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$120` {
    var iconStyle: ItemStyleOption__0? /* ItemStyleOption__0? & `T$188`? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ToolboxFeatureOption {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var title: dynamic /* String? | DictionaryPartial<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var icon: dynamic /* String? | DictionaryPartial<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var iconStyle: ItemStyleOption__0? /* ItemStyleOption__0? & `T$188`? */
        get() = definedExternally
        set(value) = definedExternally
    var emphasis: `T$120`?
        get() = definedExternally
        set(value) = definedExternally
    var iconStatus: DictionaryPartial<String? /* "normal" | "emphasis" | "blur" | "select" */>?
        get() = definedExternally
        set(value) = definedExternally
    var onclick: (() -> Unit)?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ToolboxTooltipFormatterParams {
    @nativeGetter
    operator fun get(key: String): dynamic? /* JsTuple<String, String> */
    @nativeSetter
    operator fun set(key: String, value: dynamic /* JsTuple<String, String> */)
    var componentType: String /* "toolbox" */
    var name: String
    var title: String
}

external interface `T$121` {
    var iconStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ToolboxOption : ComponentOption, BoxLayoutOptionMixin, BorderOptionMixin {
    override var mainType: String? /* "toolbox" */
        get() = definedExternally
        set(value) = definedExternally
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var orient: String? /* "vertical" | "horizontal" */
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var borderRadius: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var padding: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var itemSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var itemGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var showTitle: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var iconStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var emphasis: `T$121`?
        get() = definedExternally
        set(value) = definedExternally
    var textStyle: LabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: CommonTooltipOption<ToolboxTooltipFormatterParams>?
        get() = definedExternally
        set(value) = definedExternally
    var feature: DictionaryPartial<ToolboxFeatureOption>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TitleOption : ComponentOption, BoxLayoutOptionMixin, BorderOptionMixin {
    override var mainType: String? /* "title" */
        get() = definedExternally
        set(value) = definedExternally
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var text: String?
        get() = definedExternally
        set(value) = definedExternally
    var link: String?
        get() = definedExternally
        set(value) = definedExternally
    var target: String? /* "self" | "blank" */
        get() = definedExternally
        set(value) = definedExternally
    var subtext: String?
        get() = definedExternally
        set(value) = definedExternally
    var sublink: String?
        get() = definedExternally
        set(value) = definedExternally
    var subtarget: String? /* "self" | "blank" */
        get() = definedExternally
        set(value) = definedExternally
    var textAlign: ZRTextAlign?
        get() = definedExternally
        set(value) = definedExternally
    var textVerticalAlign: ZRTextVerticalAlign?
        get() = definedExternally
        set(value) = definedExternally
    var textBaseline: ZRTextVerticalAlign?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var padding: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var itemGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var textStyle: LabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var subtextStyle: LabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var triggerEvent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var borderRadius: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface TimelineControlStyle : ItemStyleOption__0 {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showPlayBtn: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showPrevBtn: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showNextBtn: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var itemSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var itemGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var position: String? /* "left" | "right" | "top" | "bottom" */
        get() = definedExternally
        set(value) = definedExternally
    var playIcon: String?
        get() = definedExternally
        set(value) = definedExternally
    var stopIcon: String?
        get() = definedExternally
        set(value) = definedExternally
    var prevIcon: String?
        get() = definedExternally
        set(value) = definedExternally
    var nextIcon: String?
        get() = definedExternally
        set(value) = definedExternally
    var playBtnSize: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var stopBtnSize: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var nextBtnSize: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var prevBtnSize: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface TimelineCheckpointStyle : ItemStyleOption__0, SymbolOptionMixin__0 {
    var animation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var animationDuration: Number?
        get() = definedExternally
        set(value) = definedExternally
    var animationEasing: dynamic /* typealias ZREasing = dynamic */
        get() = definedExternally
        set(value) = definedExternally
}

external interface TimelineLineStyleOption : LineStyleOption__0 {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TimelineLabelOption /*: Omit<LabelOption, String /* "position" */>*/ {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var position: dynamic /* "auto" | "left" | "right" | "top" | "bottom" | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var interval: dynamic /* "auto" | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var formatter: dynamic /* String? | ((value: dynamic /* String | Number */, index: Number) -> String)? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$122` {
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var label: TimelineLabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var checkpointStyle: TimelineCheckpointStyle?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$123` {
    var lineStyle: TimelineLineStyleOption?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var label: TimelineLabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TimelineDataItemOption : SymbolOptionMixin__0 {
    var value: dynamic /* String? | Number? | Date? */
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var label: TimelineLabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var checkpointStyle: TimelineCheckpointStyle?
        get() = definedExternally
        set(value) = definedExternally
    var emphasis: `T$122`?
        get() = definedExternally
        set(value) = definedExternally
    var progress: `T$123`?
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$125` {
    var lineStyle: TimelineLineStyleOption?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var checkpointStyle: TimelineCheckpointStyle?
        get() = definedExternally
        set(value) = definedExternally
    var controlStyle: TimelineControlStyle?
        get() = definedExternally
        set(value) = definedExternally
    var label: TimelineLabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TimelineOption : ComponentOption, BoxLayoutOptionMixin, SymbolOptionMixin__0 {
    override var mainType: String? /* "timeline" */
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var borderColor: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var borderWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: CommonTooltipOption<CallbackDataParams>? /* CommonTooltipOption<CallbackDataParams>? & `T$124`? */
        get() = definedExternally
        set(value) = definedExternally
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var axisType: String? /* "category" | "time" | "value" */
        get() = definedExternally
        set(value) = definedExternally
    var currentIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var autoPlay: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rewind: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var loop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var playInterval: Number?
        get() = definedExternally
        set(value) = definedExternally
    var realtime: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var controlPosition: String? /* "left" | "right" | "top" | "bottom" */
        get() = definedExternally
        set(value) = definedExternally
    var padding: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var orient: String? /* "vertical" | "horizontal" */
        get() = definedExternally
        set(value) = definedExternally
    var inverse: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var replaceMerge: dynamic /* Nothing? & String? | Array<Nothing? /* Nothing? & String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: TimelineLineStyleOption?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var checkpointStyle: TimelineCheckpointStyle?
        get() = definedExternally
        set(value) = definedExternally
    var controlStyle: TimelineControlStyle?
        get() = definedExternally
        set(value) = definedExternally
    var label: TimelineLabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var emphasis: `T$125`?
        get() = definedExternally
        set(value) = definedExternally
    var progress: `T$123`?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<dynamic /* String? | Number? | Date? | TimelineDataItemOption? */>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SliderTimelineOption : TimelineOption

external interface `T$127` {
    var horizontal: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var vertical: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ScrollableLegendOption : LegendOption {
    var scrollDataIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pageButtonItemGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pageButtonGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pageButtonPosition: String? /* "start" | "end" */
        get() = definedExternally
        set(value) = definedExternally
    var pageFormatter: dynamic /* String? | ((param: `T$126`) -> String)? */
        get() = definedExternally
        set(value) = definedExternally
    var pageIcons: `T$127`?
        get() = definedExternally
        set(value) = definedExternally
    var pageIconColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var pageIconInactiveColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var pageIconSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pageTextStyle: LabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var animationDurationUpdate: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DataZoomOption : ComponentOption {
    override var mainType: String? /* "dataZoom" */
        get() = definedExternally
        set(value) = definedExternally
    var orient: String? /* "vertical" | "horizontal" */
        get() = definedExternally
        set(value) = definedExternally
    var xAxisIndex: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var xAxisId: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisIndex: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisId: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var radiusAxisIndex: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var radiusAxisId: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var angleAxisIndex: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var angleAxisId: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var singleAxisIndex: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var singleAxisId: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var filterMode: String? /* "filter" | "weakFilter" | "empty" | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var throttle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var start: Number?
        get() = definedExternally
        set(value) = definedExternally
    var end: Number?
        get() = definedExternally
        set(value) = definedExternally
    var startValue: dynamic /* Number? | String? | Date? */
        get() = definedExternally
        set(value) = definedExternally
    var endValue: dynamic /* Number? | String? | Date? */
        get() = definedExternally
        set(value) = definedExternally
    var minSpan: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxSpan: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minValueSpan: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxValueSpan: Number?
        get() = definedExternally
        set(value) = definedExternally
    var rangeMode: dynamic /* JsTuple<String?, String?> */
        get() = definedExternally
        set(value) = definedExternally
    var realtime: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var textStyle: LabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$128` {
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var areaStyle: AreaStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$129` {
    var handleStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var moveHandleStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SliderDataZoomOption : DataZoomOption, BoxLayoutOptionMixin {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var borderColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var borderRadius: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var dataBackground: `T$128`?
        get() = definedExternally
        set(value) = definedExternally
    var selectedDataBackground: `T$128`?
        get() = definedExternally
        set(value) = definedExternally
    var fillerColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var handleIcon: String?
        get() = definedExternally
        set(value) = definedExternally
    var handleSize: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var handleStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var moveHandleIcon: String?
        get() = definedExternally
        set(value) = definedExternally
    var moveHandleStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var moveHandleSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var labelPrecision: dynamic /* Number? | "auto" */
        get() = definedExternally
        set(value) = definedExternally
    var labelFormatter: dynamic /* String? | ((value: Number, valueStr: String) -> String)? */
        get() = definedExternally
        set(value) = definedExternally
    var showDetail: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showDataShadow: dynamic /* "auto" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var zoomLock: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var textStyle: LabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var brushSelect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var brushStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var emphasis: `T$129`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface InsideDataZoomOption : DataZoomOption {
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var zoomLock: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var zoomOnMouseWheel: dynamic /* Boolean? | "shift" | "ctrl" | "alt" */
        get() = definedExternally
        set(value) = definedExternally
    var moveOnMouseMove: dynamic /* Boolean? | "shift" | "ctrl" | "alt" */
        get() = definedExternally
        set(value) = definedExternally
    var moveOnMouseWheel: dynamic /* Boolean? | "shift" | "ctrl" | "alt" */
        get() = definedExternally
        set(value) = definedExternally
    var preventDefaultMouseMove: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$130` {
    var handleStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ContinousVisualMapOption : VisualMapOption__0 {
    override var align: String? /* "auto" | "left" | "right" | "top" | "bottom" */
        get() = definedExternally
        set(value) = definedExternally
    var calculable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var range: Array<Number>?
        get() = definedExternally
        set(value) = definedExternally
    var hoverLink: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var hoverLinkDataSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var hoverLinkOnHandle: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var handleIcon: String?
        get() = definedExternally
        set(value) = definedExternally
    var handleSize: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var handleStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var indicatorIcon: String?
        get() = definedExternally
        set(value) = definedExternally
    var indicatorSize: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var indicatorStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var emphasis: `T$130`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface VisualPiece : VisualOptionPiecewise {
    var min: Number?
        get() = definedExternally
        set(value) = definedExternally
    var max: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lt: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gt: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lte: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gte: Number?
        get() = definedExternally
        set(value) = definedExternally
    var value: Number?
        get() = definedExternally
        set(value) = definedExternally
    var label: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PiecewiseVisualMapOption : VisualMapOption__0 {
    override var align: String? /* "auto" | "left" | "right" */
        get() = definedExternally
        set(value) = definedExternally
    var minOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var maxOpen: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var itemWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var itemHeight: Number?
        get() = definedExternally
        set(value) = definedExternally
    var itemSymbol: String?
        get() = definedExternally
        set(value) = definedExternally
    var pieces: Array<VisualPiece>?
        get() = definedExternally
        set(value) = definedExternally
    override var categories: Any? // Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var splitNumber: Number?
        get() = definedExternally
        set(value) = definedExternally
    var selected: Dictionary<Boolean>?
        get() = definedExternally
        set(value) = definedExternally
    var selectedMode: dynamic /* "multiple" | "single" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var showLabel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var itemGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var hoverLink: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MarkLineStateOption {
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLineLabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MarkLineDataItemOptionBase : MarkLineStateOption, StatesOptionMixin<MarkLineStateOption, StatesMixinBase> {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MarkLine1DDataItemOption : MarkLineDataItemOptionBase {
    var xAxis: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var yAxis: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var type: String? /* "average" | "min" | "max" | "median" */
        get() = definedExternally
        set(value) = definedExternally
    var valueIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var valueDim: String?
        get() = definedExternally
        set(value) = definedExternally
    var symbol: dynamic /* Array<String>? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolSize: dynamic /* Array<Number>? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolRotate: dynamic /* Array<Number>? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolOffset: dynamic /* Number? | String? | Array<dynamic /* Number | String */>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface MarkLine2DDataItemDimOption : MarkLineDataItemOptionBase, SymbolOptionMixin__0, MarkerPositionOption

external interface MarkLineOption : MarkerOption, MarkLineStateOption, StatesOptionMixin<MarkLineStateOption, StatesMixinBase> {
    override var mainType: String? /* "markLine" */
        get() = definedExternally
        set(value) = definedExternally
    var symbol: dynamic /* Array<String>? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolSize: dynamic /* Array<Number>? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolRotate: dynamic /* Array<Number>? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolOffset: dynamic /* Number? | String? | Array<dynamic /* Number | String */>? */
        get() = definedExternally
        set(value) = definedExternally
    var precision: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var data: Array<dynamic /* MarkLine1DDataItemOption | JsTuple<MarkLine2DDataItemDimOption, MarkLine2DDataItemDimOption> */>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MarkPointStateOption {
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface MarkPointDataItemOption : MarkPointStateOption, StatesOptionMixin<MarkPointStateOption, StatesMixinBase>, SymbolOptionMixin<CallbackDataParams>, MarkerPositionOption {
    var name: String
}

external interface MarkPointOption : MarkerOption, SymbolOptionMixin<CallbackDataParams>, StatesOptionMixin<MarkPointStateOption, StatesMixinBase>, MarkPointStateOption {
    override var mainType: String? /* "markPoint" */
        get() = definedExternally
        set(value) = definedExternally
    var precision: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var data: Array<Any>? // Array<MarkPointDataItemOption>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$131` {
    var focus: String? /* "none" | "self" | "series" */
        get() = definedExternally
        set(value) = definedExternally
    var scale: dynamic /* Boolean? | Number? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface LineStateOptionMixin {
    var emphasis: `T$131`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LineStateOption<TCbParams> {
    var itemStyle: ItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var endLabel: LineEndLabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LineStateOption__0 : LineStateOption<Any>

external interface LineDataItemOption : SymbolOptionMixin__0, LineStateOption__0, StatesOptionMixin<LineStateOption__0, LineStateOptionMixin> {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface LineEndLabelOption : SeriesLabelOption__0 {
    override var valueAnimation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$134` {
    var lineStyle: dynamic /* typealias Omit = dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var areaStyle: AreaStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LineSeriesOption : SeriesOption<LineStateOption<CallbackDataParams>, LineStateOptionMixin /* LineStateOptionMixin & `T$135` */>, LineStateOption<CallbackDataParams>, SeriesOnCartesianOptionMixin, SeriesOnPolarOptionMixin, SeriesStackOptionMixin, SeriesSamplingOptionMixin, SymbolOptionMixin<CallbackDataParams>, SeriesEncodeOptionMixin {
    override var type: String? /* "line" */
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String? /* "cartesian2d" | "polar" */
        get() = definedExternally
        set(value) = definedExternally
    var clip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
    override var endLabel: LineEndLabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var areaStyle: AreaStyleOption__0? /* AreaStyleOption__0? & `T$132`? */
        get() = definedExternally
        set(value) = definedExternally
    var step: dynamic /* Boolean? | "start" | "end" | "middle" */
        get() = definedExternally
        set(value) = definedExternally
    var smooth: dynamic /* Boolean? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var smoothMonotone: String? /* "x" | "y" | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var connectNulls: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showSymbol: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showAllSymbol: dynamic /* "auto" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any?// Array<dynamic /* String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? | LineDataItemOption? */>?
        get() = definedExternally
        set(value) = definedExternally
    var triggerLineEvent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var seriesLayoutBy: Any? // String? /* "column" | "row" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface ScatterStateOption<TCbParams> {
    var itemStyle: ItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ScatterStateOption__0 : ScatterStateOption<Any>

external interface ScatterStatesOptionMixin {
    var emphasis: `T$131`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ScatterDataItemOption : SymbolOptionMixin__0, ScatterStateOption__0, StatesOptionMixin<ScatterStateOption__0, ScatterStatesOptionMixin>, OptionDataItemObject<dynamic /* String? | Number? | Date? */>

external interface ScatterSeriesOption : SeriesOption<ScatterStateOption<CallbackDataParams>, ScatterStatesOptionMixin>, ScatterStateOption<CallbackDataParams>, SeriesOnCartesianOptionMixin, SeriesOnPolarOptionMixin, SeriesOnCalendarOptionMixin, SeriesOnGeoOptionMixin, SeriesOnSingleOptionMixin, SeriesLargeOptionMixin, SeriesStackOptionMixin, SymbolOptionMixin<CallbackDataParams>, SeriesEncodeOptionMixin {
    override var type: String? /* "scatter" */
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String?
        get() = definedExternally
        set(value) = definedExternally
    override var cursor: String?
        get() = definedExternally
        set(value) = definedExternally
    var clip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var seriesLayoutBy: Any? //String? /* "column" | "row" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface PieItemStyleOption<TCbParams> : ItemStyleOption<TCbParams> {
    override var borderRadius: dynamic /* Array<dynamic /* Number | String */>? | Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface PieItemStyleOption__0 : PieItemStyleOption<Any>

external interface PieCallbackDataParams : CallbackDataParams

external interface PieStateOption<TCbParams> {
    var itemStyle: PieItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
    var label: PieLabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var labelLine: PieLabelLineOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PieStateOption__0 : PieStateOption<Any>

external interface PieLabelOption /*: Omit<SeriesLabelOption__0, String /* "rotate" | "position" */>*/ {
    var rotate: dynamic /* Number? | Boolean? | "radial" | "tangential" */
        get() = definedExternally
        set(value) = definedExternally
    var alignTo: String? /* "none" | "labelLine" | "edge" */
        get() = definedExternally
        set(value) = definedExternally
    var edgeDistance: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var margin: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var bleedMargin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var distanceToLabelLine: Number?
        get() = definedExternally
        set(value) = definedExternally
    var position: dynamic /* Any | "outer" | "inner" | "center" | "outside" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface PieLabelLineOption : LabelLineOption {
    var maxSurfaceAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$136` {
    var focus: String? /* "none" | "self" | "series" */
        get() = definedExternally
        set(value) = definedExternally
    var scale: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var scaleSize: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ExtraStateOption {
    var emphasis: `T$136`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PieDataItemOption : OptionDataItemObject<dynamic /* Number | "-" */>, PieStateOption__0, StatesOptionMixin<PieStateOption__0, ExtraStateOption> {
    var cursor: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PieSeriesOption : /* Omit<SeriesOption<PieStateOption<PieCallbackDataParams>, ExtraStateOption>, String /* "labelLine" */>, */  PieStateOption<PieCallbackDataParams>/*, Omit<CircleLayoutOptionMixin, String /* "center" */>*/, BoxLayoutOptionMixin, SeriesEncodeOptionMixin {
    var type: String? /* "pie" */
        get() = definedExternally
        set(value) = definedExternally
    var roseType: String? /* "radius" | "area" */
        get() = definedExternally
        set(value) = definedExternally
    var center: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var clockwise: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var startAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endAngle: dynamic /* Number? | "auto" */
        get() = definedExternally
        set(value) = definedExternally
    var padAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minShowLabelAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var selectedOffset: Number?
        get() = definedExternally
        set(value) = definedExternally
    var avoidLabelOverlap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var percentPrecision: Number?
        get() = definedExternally
        set(value) = definedExternally
    var stillShowZeroSum: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var animationType: String? /* "expansion" | "scale" */
        get() = definedExternally
        set(value) = definedExternally
    var animationTypeUpdate: String? /* "transition" | "expansion" */
        get() = definedExternally
        set(value) = definedExternally
    var showEmptyCircle: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var emptyCircleStyle: PieItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var data: Array<dynamic /* Number | "-" | Array<dynamic /* Number | "-" */> | PieDataItemOption */>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RadarStatesMixin {
    var emphasis: DefaultStatesMixinEmphasis?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RadarSeriesStateOption<TCbParams> {
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var areaStyle: AreaStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface RadarSeriesStateOption__0 : RadarSeriesStateOption<Any>

external interface RadarSeriesDataItemOption : SymbolOptionMixin__0, RadarSeriesStateOption<CallbackDataParams>, StatesOptionMixin<RadarSeriesStateOption<CallbackDataParams>, RadarStatesMixin>, OptionDataItemObject<RadarSeriesDataValue>

external interface RadarSeriesOption : SeriesOption<RadarSeriesStateOption__0, RadarStatesMixin>, RadarSeriesStateOption__0, SymbolOptionMixin<CallbackDataParams>, SeriesEncodeOptionMixin {
    override var type: String? /* "radar" */
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String? /* "radar" */
        get() = definedExternally
        set(value) = definedExternally
    var radarIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var radarId: String?
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? //Array<dynamic /* RadarSeriesDataItemOption | RadarSeriesDataValue */>?
        get() = definedExternally
        set(value) = definedExternally
    override var seriesLayoutBy: Any? // String? /* "column" | "row" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface CurveLineStyleOption : LineStyleOption__0 {
    var curveness: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TreeSeriesStateOption<TCbParams> {
    var itemStyle: ItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: CurveLineStyleOption?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TreeSeriesStateOption__0 : TreeSeriesStateOption<Any>

external interface `T$137` {
    var focus: String? /* "none" | "self" | "series" | "ancestor" | "descendant" | "relative" */
        get() = definedExternally
        set(value) = definedExternally
    var scale: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TreeStatesMixin {
    var emphasis: `T$137`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TreeSeriesNodeItemOption : SymbolOptionMixin<CallbackDataParams>, TreeSeriesStateOption<CallbackDataParams>, StatesOptionMixin<TreeSeriesStateOption<CallbackDataParams>, TreeStatesMixin>, OptionDataItemObject<dynamic /* String? | Number? | Date? */> {
    var children: Array<TreeSeriesNodeItemOption>?
        get() = definedExternally
        set(value) = definedExternally
    var collapsed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var link: String?
        get() = definedExternally
        set(value) = definedExternally
    var target: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TreeSeriesLeavesOption : TreeSeriesStateOption__0, StatesOptionMixin<TreeSeriesStateOption__0, TreeStatesMixin>

external interface TreeSeriesOption : SeriesOption<TreeSeriesStateOption__0, TreeStatesMixin>, TreeSeriesStateOption__0, SymbolOptionMixin<CallbackDataParams>, BoxLayoutOptionMixin, RoamOptionMixin {
    override var type: String? /* "tree" */
        get() = definedExternally
        set(value) = definedExternally
    var layout: String? /* "orthogonal" | "radial" */
        get() = definedExternally
        set(value) = definedExternally
    var edgeShape: String? /* "polyline" | "curve" */
        get() = definedExternally
        set(value) = definedExternally
    var edgeForkPosition: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var nodeScaleRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var orient: String? /* "LR" | "TB" | "RL" | "BT" | "horizontal" | "vertical" */
        get() = definedExternally
        set(value) = definedExternally
    var expandAndCollapse: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var initialTreeDepth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var leaves: TreeSeriesLeavesOption?
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<TreeSeriesNodeItemOption>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BreadcrumbItemStyleOption : ItemStyleOption__0 {
    var textStyle: LabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TreemapSeriesLabelOption : SeriesLabelOption__0 {
    override var formatter: dynamic /* String? | ((params: CallbackDataParams) -> String)? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface TreemapSeriesItemStyleOption<TCbParams> : ItemStyleOption<TCbParams> {
    override var borderRadius: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var colorAlpha: Number?
        get() = definedExternally
        set(value) = definedExternally
    var colorSaturation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var borderColorSaturation: Number?
        get() = definedExternally
        set(value) = definedExternally
    var gapWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TreePathInfo {
    var name: String
    var dataIndex: Number
    var value: dynamic /* Number | Array<Number> */
        get() = definedExternally
        set(value) = definedExternally
}

external interface TreemapSeriesCallbackDataParams : CallbackDataParams {
    var treePathInfo: Array<TreePathInfo>?
        get() = definedExternally
        set(value) = definedExternally
    var treeAncestors: Array<TreePathInfo>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$138` {
    var focus: String? /* "none" | "self" | "series" | "descendant" | "ancestor" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `ExtraStateOption$1` {
    var emphasis: `T$138`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TreemapStateOption<TCbParams> {
    var itemStyle: TreemapSeriesItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
    var label: TreemapSeriesLabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var upperLabel: TreemapSeriesLabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TreemapStateOption__0 : TreemapStateOption<Any>

external interface TreemapSeriesVisualOption {
    var visualDimension: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var colorMappingBy: String? /* "value" | "index" | "id" */
        get() = definedExternally
        set(value) = definedExternally
    var visualMin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var visualMax: Number?
        get() = definedExternally
        set(value) = definedExternally
    var colorAlpha: dynamic /* Array<Number>? | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var colorSaturation: dynamic /* Array<Number>? | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var visibleMin: Number?
        get() = definedExternally
        set(value) = definedExternally
    var childrenVisibleMin: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TreemapSeriesLevelOption : TreemapSeriesVisualOption, TreemapStateOption__0, StatesOptionMixin<TreemapStateOption__0, `ExtraStateOption$1`> {
    var color: dynamic /* Array<ColorString>? | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var decal: dynamic /* Array<DecalObject>? | "none" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface TreemapSeriesNodeItemOption : TreemapSeriesVisualOption, TreemapStateOption__0, StatesOptionMixin<TreemapStateOption__0, `ExtraStateOption$1`> {
    var id: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var name: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var children: Array<TreemapSeriesNodeItemOption>?
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* Array<ColorString>? | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var decal: dynamic /* Array<DecalObject>? | "none" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$139` {
    var disabled: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var focus: String? /* "none" | "self" | "series" */
        get() = definedExternally
        set(value) = definedExternally
    var blurScope: String? /* "coordinateSystem" | "series" | "global" */
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: BreadcrumbItemStyleOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface TreemapSeriesOption : SeriesOption<TreemapStateOption<TreemapSeriesCallbackDataParams>, `ExtraStateOption$1`>, TreemapStateOption<TreemapSeriesCallbackDataParams>, BoxLayoutOptionMixin, RoamOptionMixin, TreemapSeriesVisualOption {
    override var type: String? /* "treemap" */
        get() = definedExternally
        set(value) = definedExternally
    var size: Array<dynamic /* Number | String */>?
        get() = definedExternally
        set(value) = definedExternally
    var sort: dynamic /* Boolean? | "asc" | "desc" */
        get() = definedExternally
        set(value) = definedExternally
    var clipWindow: String? /* "origin" | "fullscreen" */
        get() = definedExternally
        set(value) = definedExternally
    var squareRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var leafDepth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var drillDownIcon: String?
        get() = definedExternally
        set(value) = definedExternally
    var zoomToNodeRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var nodeClick: dynamic /* "zoomToNode" | "link" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var breadcrumb: BoxLayoutOptionMixin? /* BoxLayoutOptionMixin? & `T$140`? */
        get() = definedExternally
        set(value) = definedExternally
    var levels: Array<TreemapSeriesLevelOption>?
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<TreemapSeriesNodeItemOption>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphEdgeLineStyleOption : LineStyleOption__0 {
    var curveness: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphNodeStateOption<TCbParams> {
    var itemStyle: ItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphNodeStateOption__0 : GraphNodeStateOption<Any>

external interface ExtraEmphasisState {
    var focus: String? /* "none" | "self" | "series" | "adjacency" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphNodeStatesMixin {
    var emphasis: ExtraEmphasisState?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphEdgeStatesMixin {
    var emphasis: ExtraEmphasisState?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphNodeItemOption : SymbolOptionMixin__0, GraphNodeStateOption__0, StatesOptionMixin<GraphNodeStateOption__0, GraphNodeStatesMixin> {
    var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */
        get() = definedExternally
        set(value) = definedExternally
    var x: Number?
        get() = definedExternally
        set(value) = definedExternally
    var y: Number?
        get() = definedExternally
        set(value) = definedExternally
    var fixed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var category: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var draggable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var cursor: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphEdgeStateOption {
    var lineStyle: GraphEdgeLineStyleOption?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLineLabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphEdgeItemOption : GraphEdgeStateOption, StatesOptionMixin<GraphEdgeStateOption, GraphEdgeStatesMixin>, GraphEdgeItemObject<dynamic /* Number | "-" */> {
    override var value: Number?
        get() = definedExternally
        set(value) = definedExternally
    var symbol: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolSize: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var ignoreForceLayout: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphCategoryItemOption : SymbolOptionMixin__0, GraphNodeStateOption__0, StatesOptionMixin<GraphNodeStateOption__0, GraphNodeStatesMixin> {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* String? | Number? | Date? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$141` {
    var focus: Any?
        get() = definedExternally
        set(value) = definedExternally
    var scale: dynamic /* Boolean? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var edgeLabel: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$142` {
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var edgeLabel: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$143` {
    var rotateLabel: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$144` {
    var initLayout: String? /* "circular" | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var repulsion: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var gravity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var friction: Number?
        get() = definedExternally
        set(value) = definedExternally
    var edgeLength: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var layoutAnimation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphSeriesOption : SeriesOption<GraphNodeStateOption<CallbackDataParams>, GraphNodeStatesMixin>, SeriesOnCartesianOptionMixin, SeriesOnPolarOptionMixin, SeriesOnCalendarOptionMixin, SeriesOnGeoOptionMixin, SeriesOnSingleOptionMixin, SymbolOptionMixin<CallbackDataParams>, RoamOptionMixin, BoxLayoutOptionMixin {
    override var type: String? /* "graph" */
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String?
        get() = definedExternally
        set(value) = definedExternally
    override var legendHoverLink: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var layout: String? /* "none" | "force" | "circular" */
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<dynamic /* GraphNodeItemOption? | String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */>?
        get() = definedExternally
        set(value) = definedExternally
    var nodes: Array<dynamic /* GraphNodeItemOption? | String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */>?
        get() = definedExternally
        set(value) = definedExternally
    var edges: Array<GraphEdgeItemOption>?
        get() = definedExternally
        set(value) = definedExternally
    var links: Array<GraphEdgeItemOption>?
        get() = definedExternally
        set(value) = definedExternally
    var categories: Array<GraphCategoryItemOption>?
        get() = definedExternally
        set(value) = definedExternally
    var focusNodeAdjacency: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var nodeScaleRatio: Number? /* 0.6 */
        get() = definedExternally
        set(value) = definedExternally
    var draggable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var edgeSymbol: dynamic /* String? | Array<String>? */
        get() = definedExternally
        set(value) = definedExternally
    var edgeSymbolSize: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var edgeLabel: SeriesLineLabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption<CallbackDataParams>?
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: GraphEdgeLineStyleOption?
        get() = definedExternally
        set(value) = definedExternally
    override var emphasis: GraphNodeStateOption<CallbackDataParams>? //`T$141`?
        get() = definedExternally
        set(value) = definedExternally
    override var blur: GraphNodeStateOption<CallbackDataParams>?
        get() = definedExternally
        set(value) = definedExternally
    override var select: GraphNodeStateOption<CallbackDataParams>?
        get() = definedExternally
        set(value) = definedExternally
    var circular: `T$143`?
        get() = definedExternally
        set(value) = definedExternally
    var force: `T$144`?
        get() = definedExternally
        set(value) = definedExternally
    var autoCurveness: dynamic /* Boolean? | Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `LabelFormatter$1` {
    @nativeInvoke
    operator fun invoke(value: Number): String
}

external interface PointerOption {
    var icon: String?
        get() = definedExternally
        set(value) = definedExternally
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showAbove: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var keepAspect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var offsetCenter: Array<dynamic /* Number | String */>?
        get() = definedExternally
        set(value) = definedExternally
    var length: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface AnchorOption {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var showAbove: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var size: Number?
        get() = definedExternally
        set(value) = definedExternally
    var icon: String?
        get() = definedExternally
        set(value) = definedExternally
    var offsetCenter: Array<dynamic /* Number | String */>?
        get() = definedExternally
        set(value) = definedExternally
    var keepAspect: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ProgressOption {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var overlap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var roundCap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var clip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `TitleOption$1` : LabelOption {
    var offsetCenter: Array<dynamic /* Number | String */>?
        get() = definedExternally
        set(value) = definedExternally
    var formatter: dynamic /* LabelFormatter$1? | String? */
        get() = definedExternally
        set(value) = definedExternally
    override var valueAnimation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface DetailOption : LabelOption {
    var offsetCenter: Array<dynamic /* Number | String */>?
        get() = definedExternally
        set(value) = definedExternally
    var formatter: dynamic /* LabelFormatter$1? | String? */
        get() = definedExternally
        set(value) = definedExternally
    override var valueAnimation: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GaugeStatesMixin {
    var emphasis: DefaultStatesMixinEmphasis?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GaugeStateOption<TCbParams> {
    var itemStyle: ItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GaugeStateOption__0 : GaugeStateOption<Any>

external interface GaugeDataItemOption : GaugeStateOption__0, StatesOptionMixin<GaugeStateOption<CallbackDataParams>, GaugeStatesMixin> {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* Number? | "-" */
        get() = definedExternally
        set(value) = definedExternally
    var pointer: PointerOption?
        get() = definedExternally
        set(value) = definedExternally
    var progress: ProgressOption?
        get() = definedExternally
        set(value) = definedExternally
    var title: `TitleOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    var detail: DetailOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$146` {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var roundCap: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: dynamic /* typealias Omit = dynamic */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$147` {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var length: Number?
        get() = definedExternally
        set(value) = definedExternally
    var distance: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$148` {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var splitNumber: Number?
        get() = definedExternally
        set(value) = definedExternally
    var length: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var distance: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GaugeSeriesOption : SeriesOption<GaugeStateOption__0, GaugeStatesMixin>, GaugeStateOption<CallbackDataParams>, CircleLayoutOptionMixin, SeriesEncodeOptionMixin {
    override var type: String? /* "gauge" */
        get() = definedExternally
        set(value) = definedExternally
    override var radius: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var startAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var endAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var clockwise: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var min: Number?
        get() = definedExternally
        set(value) = definedExternally
    var max: Number?
        get() = definedExternally
        set(value) = definedExternally
    var splitNumber: Number?
        get() = definedExternally
        set(value) = definedExternally
    var axisLine: `T$146`?
        get() = definedExternally
        set(value) = definedExternally
    var progress: ProgressOption?
        get() = definedExternally
        set(value) = definedExternally
    var splitLine: `T$147`?
        get() = definedExternally
        set(value) = definedExternally
    var axisTick: `T$148`?
        get() = definedExternally
        set(value) = definedExternally
    var axisLabel: dynamic /* typealias Omit = dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var pointer: PointerOption?
        get() = definedExternally
        set(value) = definedExternally
    var anchor: AnchorOption?
        get() = definedExternally
        set(value) = definedExternally
    var title: `TitleOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    var detail: DetailOption?
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<dynamic /* Number | "-" | GaugeDataItemOption */>?
        get() = definedExternally
        set(value) = definedExternally
    override var seriesLayoutBy: Any? // String? /* "column" | "row" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface FunnelStatesMixin {
    var emphasis: DefaultStatesMixinEmphasis?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FunnelCallbackDataParams : CallbackDataParams

external interface FunnelStateOption<TCbParams> {
    var itemStyle: ItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
    var label: dynamic /* typealias Omit = dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var labelLine: LabelLineOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FunnelStateOption__0 : FunnelStateOption<Any>

external interface FunnelDataItemOption : FunnelStateOption__0, StatesOptionMixin<FunnelStateOption__0, FunnelStatesMixin>, OptionDataItemObject<dynamic /* Number | "-" */>

external interface FunnelSeriesOption : SeriesOption<FunnelStateOption<FunnelCallbackDataParams>, FunnelStatesMixin>, FunnelStateOption<FunnelCallbackDataParams>, BoxLayoutOptionMixin, SeriesEncodeOptionMixin {
    override var type: String? /* "funnel" */
        get() = definedExternally
        set(value) = definedExternally
    var min: Number?
        get() = definedExternally
        set(value) = definedExternally
    var max: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minSize: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var maxSize: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var sort: String? /* "ascending" | "descending" | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var orient: String? /* "vertical" | "horizontal" */
        get() = definedExternally
        set(value) = definedExternally
    var gap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var funnelAlign: String? /* "left" | "center" | "right" | "top" | "middle" | "bottom" */
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<dynamic /* Number | "-" | Array<dynamic /* Number | "-" */> | FunnelDataItemOption */>?
        get() = definedExternally
        set(value) = definedExternally
    override var seriesLayoutBy: Any? // String? /* "column" | "row" */
        get() = definedExternally
        set(value) = definedExternally
    override var labelLine: LabelLineOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ParallelStatesMixin {
    var emphasis: DefaultStatesMixinEmphasis?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ParallelStateOption<TCbParams> {
    var lineStyle: LineStyleOption<dynamic /* Any | ColorString | LinearGradientObject | RadialGradientObject | ImagePatternObject | SVGPatternObject */>?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ParallelStateOption__0 : ParallelStateOption<Any>

external interface ParallelSeriesDataItemOption : ParallelStateOption__0, StatesOptionMixin<ParallelStateOption__0, ParallelStatesMixin> {
    var value: ParallelSeriesDataValue?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ParallelSeriesOption : SeriesOption<ParallelStateOption<CallbackDataParams>, ParallelStatesMixin>, ParallelStateOption<CallbackDataParams>, SeriesEncodeOptionMixin {
    override var type: String? /* "parallel" */
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String?
        get() = definedExternally
        set(value) = definedExternally
    var parallelIndex: Number?
        get() = definedExternally
        set(value) = definedExternally
    var parallelId: String?
        get() = definedExternally
        set(value) = definedExternally
    var inactiveOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var activeOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var smooth: dynamic /* Boolean? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var realtime: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: CommonTooltipOption<CallbackDataParams>? /* CommonTooltipOption<CallbackDataParams>? & `T$25`? */
        get() = definedExternally
        set(value) = definedExternally
    var parallelAxisDefault: dynamic /* ValueAxisBaseOption? | LogAxisBaseOption? | CategoryAxisBaseOption? | TimeAxisBaseOption? | AxisBaseOptionCommon? */
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<dynamic /* ParallelSeriesDataValue | ParallelSeriesDataItemOption */>?
        get() = definedExternally
        set(value) = definedExternally
    override var seriesLayoutBy: Any? // String? /* "column" | "row" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SankeyNodeStateOption<TCbParams> {
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SankeyNodeStateOption__0 : SankeyNodeStateOption<Any>

external interface SankeyEdgeStateOption {
    var lineStyle: SankeyEdgeStyleOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SankeyBothStateOption<TCbParams> : SankeyNodeStateOption<TCbParams>, SankeyEdgeStateOption

external interface SankeyEdgeStyleOption : LineStyleOption__0 {
    var curveness: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$150` {
    var focus: String? /* "none" | "self" | "series" | "adjacency" | "trajectory" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `ExtraStateOption$2` {
    var emphasis: `T$150`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SankeyNodeItemOption : SankeyNodeStateOption__0, StatesOptionMixin<SankeyNodeStateOption__0, `ExtraStateOption$2`>, OptionDataItemObject<dynamic /* String? | Number? | Date? */> {
    override var id: String?
        get() = definedExternally
        set(value) = definedExternally
    var localX: Number?
        get() = definedExternally
        set(value) = definedExternally
    var localY: Number?
        get() = definedExternally
        set(value) = definedExternally
    var depth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var draggable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var focusNodeAdjacency: dynamic /* Boolean? | "inEdges" | "outEdges" | "allEdges" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SankeyEdgeItemOption : SankeyEdgeStateOption, StatesOptionMixin<SankeyEdgeStateOption, `ExtraStateOption$2`>, GraphEdgeItemObject<dynamic /* Number | "-" */> {
    var focusNodeAdjacency: dynamic /* Boolean? | "inEdges" | "outEdges" | "allEdges" */
        get() = definedExternally
        set(value) = definedExternally
    var edgeLabel: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SankeyLevelOption : SankeyNodeStateOption__0, SankeyEdgeStateOption {
    var depth: Number
}

external interface SankeySeriesOption : SeriesOption<SankeyBothStateOption<CallbackDataParams>, `ExtraStateOption$2`>, SankeyBothStateOption<CallbackDataParams>, BoxLayoutOptionMixin {
    override var type: String? /* "sankey" */
        get() = definedExternally
        set(value) = definedExternally
    override var color: Array<ColorString>?
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String? /* "view" */
        get() = definedExternally
        set(value) = definedExternally
    var orient: String? /* "vertical" | "horizontal" */
        get() = definedExternally
        set(value) = definedExternally
    var nodeWidth: Number?
        get() = definedExternally
        set(value) = definedExternally
    var nodeGap: Number?
        get() = definedExternally
        set(value) = definedExternally
    var draggable: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var focusNodeAdjacency: dynamic /* Boolean? | "inEdges" | "outEdges" | "allEdges" */
        get() = definedExternally
        set(value) = definedExternally
    var layoutIterations: Number?
        get() = definedExternally
        set(value) = definedExternally
    var nodeAlign: String? /* "justify" | "left" | "right" */
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<SankeyNodeItemOption>?
        get() = definedExternally
        set(value) = definedExternally
    var nodes: Array<SankeyNodeItemOption>?
        get() = definedExternally
        set(value) = definedExternally
    var edges: Array<SankeyEdgeItemOption>?
        get() = definedExternally
        set(value) = definedExternally
    var links: Array<SankeyEdgeItemOption>?
        get() = definedExternally
        set(value) = definedExternally
    var levels: Array<SankeyLevelOption>?
        get() = definedExternally
        set(value) = definedExternally
    var edgeLabel: SeriesLabelOption__0? /* SeriesLabelOption__0? & `T$151`? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface BoxplotStateOption<TCbParams> {
    var itemStyle: ItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BoxplotStateOption__0 : BoxplotStateOption<Any>

external interface BoxplotDataItemOption : BoxplotStateOption__0, StatesOptionMixin<BoxplotStateOption__0, `ExtraStateOption$3`> {
    var value: BoxplotDataValue
}

external interface `T$152` {
    var focus: String? /* "none" | "self" | "series" */
        get() = definedExternally
        set(value) = definedExternally
    var scale: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `ExtraStateOption$3` {
    var emphasis: `T$152`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface BoxplotSeriesOption : SeriesOption<BoxplotStateOption<CallbackDataParams>, `ExtraStateOption$3`>, BoxplotStateOption<CallbackDataParams>, SeriesOnCartesianOptionMixin, SeriesEncodeOptionMixin {
    override var type: String? /* "boxplot" */
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String? /* "cartesian2d" */
        get() = definedExternally
        set(value) = definedExternally
    var layout: String? /* "vertical" | "horizontal" */
        get() = definedExternally
        set(value) = definedExternally
    var boxWidth: Array<dynamic /* String | Number */>?
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<dynamic /* BoxplotDataValue | BoxplotDataItemOption */>?
        get() = definedExternally
        set(value) = definedExternally
    override var seriesLayoutBy: Any? // String? /* "column" | "row" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface CandlestickItemStyleOption : ItemStyleOption__0 {
    var color0: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var borderColor0: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var borderColorDoji: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface CandlestickStateOption {
    var itemStyle: CandlestickItemStyleOption?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CandlestickDataItemOption : CandlestickStateOption, StatesOptionMixin<CandlestickStateOption, `ExtraStateOption$4`> {
    var value: CandlestickDataValue
}

external interface `ExtraStateOption$4` {
    var emphasis: `T$152`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface CandlestickSeriesOption : SeriesOption<CandlestickStateOption, `ExtraStateOption$4`>, CandlestickStateOption, SeriesOnCartesianOptionMixin, SeriesLargeOptionMixin, SeriesEncodeOptionMixin {
    override var type: String? /* "candlestick" */
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String? /* "cartesian2d" */
        get() = definedExternally
        set(value) = definedExternally
    var layout: String? /* "vertical" | "horizontal" */
        get() = definedExternally
        set(value) = definedExternally
    var clip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var barMaxWidth: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var barMinWidth: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var barWidth: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<dynamic /* CandlestickDataValue | CandlestickDataItemOption */>?
        get() = definedExternally
        set(value) = definedExternally
    override var seriesLayoutBy: Any? // String? /* "column" | "row" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface RippleEffectOption {
    var period: Number?
        get() = definedExternally
        set(value) = definedExternally
    var scale: Number?
        get() = definedExternally
        set(value) = definedExternally
    var brushType: String? /* "fill" | "stroke" */
        get() = definedExternally
        set(value) = definedExternally
    var color: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var number: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SymbolDrawStateOption {
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var label: LabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$153` {
    var emphasis: `T$131`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SymbolDrawItemModelOption : SymbolOptionMixin<Any?>, StatesOptionMixin<SymbolDrawStateOption, `T$153`>, SymbolDrawStateOption {
    var cursor: String?
        get() = definedExternally
        set(value) = definedExternally
    var rippleEffect: RippleEffectOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EffectScatterStatesOptionMixin {
    var emphasis: `T$131`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EffectScatterStateOption<TCbParams> {
    var itemStyle: ItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EffectScatterStateOption__0 : EffectScatterStateOption<Any>

external interface EffectScatterDataItemOption : SymbolOptionMixin__0, EffectScatterStateOption__0, StatesOptionMixin<EffectScatterStateOption__0, EffectScatterStatesOptionMixin> {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */
        get() = definedExternally
        set(value) = definedExternally
    var rippleEffect: RippleEffectOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface EffectScatterSeriesOption : SeriesOption<EffectScatterStateOption<CallbackDataParams>, EffectScatterStatesOptionMixin>, EffectScatterStateOption<CallbackDataParams>, SeriesOnCartesianOptionMixin, SeriesOnPolarOptionMixin, SeriesOnCalendarOptionMixin, SeriesOnGeoOptionMixin, SeriesOnSingleOptionMixin, SymbolOptionMixin<CallbackDataParams>, SeriesEncodeOptionMixin {
    override var type: String? /* "effectScatter" */
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String?
        get() = definedExternally
        set(value) = definedExternally
    var effectType: String? /* "ripple" */
        get() = definedExternally
        set(value) = definedExternally
    var showEffectOn: String? /* "render" | "emphasis" */
        get() = definedExternally
        set(value) = definedExternally
    var clip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var rippleEffect: RippleEffectOption?
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<dynamic /* EffectScatterDataItemOption? | String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */>?
        get() = definedExternally
        set(value) = definedExternally
    override var seriesLayoutBy: Any? // String? /* "column" | "row" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface LineDrawStateOption {
    var lineStyle: LineStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var label: LineLabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$154` {
    var show: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var period: Number?
        get() = definedExternally
        set(value) = definedExternally
    var delay: dynamic /* Number? | ((idx: Number) -> Number)? */
        get() = definedExternally
        set(value) = definedExternally
    var constantSpeed: Number?
        get() = definedExternally
        set(value) = definedExternally
    var symbol: String?
        get() = definedExternally
        set(value) = definedExternally
    var symbolSize: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var loop: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var roundTrip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var trailLength: Number?
        get() = definedExternally
        set(value) = definedExternally
    var color: ColorString?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$155` {
    var focus: String? /* "none" | "self" | "series" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$156` {
    var emphasis: `T$155`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LineDrawModelOption : LineDrawStateOption, StatesOptionMixin<LineDrawStateOption, `T$156`> {
    var effect: `T$154`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LinesLineStyleOption<TClr> : LineStyleOption<TClr> {
    var curveness: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LinesStatesMixin {
    var emphasis: DefaultStatesMixinEmphasis?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LinesStateOption<TCbParams> {
    var lineStyle: LinesLineStyleOption<dynamic /* Any | ColorString | LinearGradientObject | RadialGradientObject | ImagePatternObject | SVGPatternObject */>?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLineLabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LinesStateOption__0 : LinesStateOption<Any>

external interface LinesDataItemOption : LinesStateOption__0, StatesOptionMixin<LinesStateOption__0, LinesStatesMixin> {
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var fromName: String?
        get() = definedExternally
        set(value) = definedExternally
    var toName: String?
        get() = definedExternally
        set(value) = definedExternally
    var symbol: dynamic /* Array<String>? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolSize: dynamic /* Array<Number>? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var coords: LinesCoords?
        get() = definedExternally
        set(value) = definedExternally
    var value: dynamic /* String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */
        get() = definedExternally
        set(value) = definedExternally
    var effect: `T$154`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface LinesSeriesOption : SeriesOption<LinesStateOption__0, LinesStatesMixin>, LinesStateOption<CallbackDataParams>, SeriesOnCartesianOptionMixin, SeriesOnGeoOptionMixin, SeriesOnPolarOptionMixin, SeriesOnCalendarOptionMixin, SeriesLargeOptionMixin {
    override var type: String? /* "lines" */
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String?
        get() = definedExternally
        set(value) = definedExternally
    var symbol: dynamic /* Array<String>? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolSize: dynamic /* Array<Number>? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var effect: `T$154`?
        get() = definedExternally
        set(value) = definedExternally
    var polyline: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var clip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var dimensions: dynamic /* DimensionName? | DimensionDefinition? | Array<dynamic /* DimensionName | DimensionDefinition */>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface HeatmapStateOption<TCbParams> {
    var itemStyle: ItemStyleOption<TCbParams>? /* ItemStyleOption<TCbParams>? & `T$157`? */
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface HeatmapStateOption__0 : HeatmapStateOption<Any>

external interface `FunnelStatesMixin$1` {
    var emphasis: DefaultStatesMixinEmphasis?
        get() = definedExternally
        set(value) = definedExternally
}

external interface HeatmapDataItemOption : HeatmapStateOption__0, StatesOptionMixin<HeatmapStateOption__0, `FunnelStatesMixin$1`> {
    var value: HeatmapDataValue
}

external interface HeatmapSeriesOption : SeriesOption<HeatmapStateOption<CallbackDataParams>, `FunnelStatesMixin$1`>, HeatmapStateOption<CallbackDataParams>, SeriesOnCartesianOptionMixin, SeriesOnGeoOptionMixin, SeriesOnCalendarOptionMixin, SeriesEncodeOptionMixin {
    override var type: String? /* "heatmap" */
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String? /* "cartesian2d" | "geo" | "calendar" */
        get() = definedExternally
        set(value) = definedExternally
    var blurSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var pointSize: Number?
        get() = definedExternally
        set(value) = definedExternally
    var maxOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minOpacity: Number?
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<dynamic /* HeatmapDataItemOption | HeatmapDataValue */>?
        get() = definedExternally
        set(value) = definedExternally
    override var seriesLayoutBy: Any? // String? /* "column" | "row" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface PictorialBarStateOption {
    var itemStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
    var label: SeriesLabelOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PictorialBarSeriesSymbolOption {
    var symbol: String?
        get() = definedExternally
        set(value) = definedExternally
    var symbolSize: dynamic /* Array<dynamic /* Number | String */>? | Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolRotate: Number?
        get() = definedExternally
        set(value) = definedExternally
    var symbolPosition: String? /* "start" | "end" | "center" */
        get() = definedExternally
        set(value) = definedExternally
    var symbolOffset: dynamic /* Array<dynamic /* Number | String */>? | Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolMargin: dynamic /* Array<dynamic /* Number | String */>? | Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolRepeat: dynamic /* Boolean? | Number? | "fixed" */
        get() = definedExternally
        set(value) = definedExternally
    var symbolRepeatDirection: String? /* "start" | "end" */
        get() = definedExternally
        set(value) = definedExternally
    var symbolClip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var symbolBoundingData: dynamic /* Number? | Array<Number>? */
        get() = definedExternally
        set(value) = definedExternally
    var symbolPatternSize: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `ExtraStateOption$5` {
    var emphasis: `T$152`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PictorialBarDataItemOption : PictorialBarSeriesSymbolOption, AnimationOptionMixin, PictorialBarStateOption, StatesOptionMixin<PictorialBarStateOption, `ExtraStateOption$5`>, OptionDataItemObject<dynamic /* String? | Number? | Date? */> {
    var z: Number?
        get() = definedExternally
        set(value) = definedExternally
    var cursor: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface PictorialBarSeriesOption : BaseBarSeriesOption<PictorialBarStateOption, `ExtraStateOption$5`>, PictorialBarStateOption, PictorialBarSeriesSymbolOption, SeriesStackOptionMixin, SeriesEncodeOptionMixin {
    override var type: String? /* "pictorialBar" */
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String? /* "cartesian2d" */
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<dynamic /* PictorialBarDataItemOption? | String? | Number? | Date? | Array<dynamic /* String? | Number? | Date? */>? */>?
        get() = definedExternally
        set(value) = definedExternally
    var clip: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var seriesLayoutBy: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ThemeRiverSeriesLabelOption : SeriesLabelOption__0 {
    var margin: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ThemeRiverStatesMixin {
    var emphasis: DefaultStatesMixinEmphasis?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ThemeRiverStateOption<TCbParams> {
    var label: ThemeRiverSeriesLabelOption?
        get() = definedExternally
        set(value) = definedExternally
    var itemStyle: ItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ThemeRiverSeriesOption : SeriesOption<ThemeRiverStateOption<CallbackDataParams>, ThemeRiverStatesMixin>, ThemeRiverStateOption<CallbackDataParams>, SeriesOnSingleOptionMixin, BoxLayoutOptionMixin {
    override var type: String? /* "themeRiver" */
        get() = definedExternally
        set(value) = definedExternally
    override var color: Array<dynamic /* ColorString | LinearGradientObject | RadialGradientObject | ImagePatternObject | SVGPatternObject */>?
        get() = definedExternally
        set(value) = definedExternally
    override var coordinateSystem: String? /* "singleAxis" */
        get() = definedExternally
        set(value) = definedExternally
    var boundaryGap: Array<dynamic /* String | Number */>?
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<dynamic /* JsTuple<dynamic, dynamic, String> */>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SunburstItemStyleOption<TCbParams> : ItemStyleOption<TCbParams> {
    override var borderRadius: dynamic /* Array<dynamic /* Number | String */>? | Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface SunburstLabelOption /*: Omit<SeriesLabelOption<SunburstDataParams>, String /* "rotate" | "position" */>*/ {
    var rotate: dynamic /* "radial" | "tangential" | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var minAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var silent: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var position: dynamic /* Any | "outside" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$158` {
    var name: String
    var dataIndex: Number
    var value: Any
}

external interface SunburstDataParams : CallbackDataParams {
    var treePathInfo: Array<`T$158`>
}

external interface SunburstStatesMixin {
    var emphasis: `T$138`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SunburstStateOption<TCbParams> {
    var itemStyle: SunburstItemStyleOption<TCbParams>?
        get() = definedExternally
        set(value) = definedExternally
    var label: SunburstLabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SunburstSeriesNodeItemOption : SunburstStateOption<SunburstDataParams>, StatesOptionMixin<SunburstStateOption<SunburstDataParams>, SunburstStatesMixin>, OptionDataItemObject<dynamic /* String? | Number? | Date? */> {
    var nodeClick: dynamic /* "rootToNode" | "link" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var link: String?
        get() = definedExternally
        set(value) = definedExternally
    var target: String?
        get() = definedExternally
        set(value) = definedExternally
    var children: Array<SunburstSeriesNodeItemOption>?
        get() = definedExternally
        set(value) = definedExternally
    var collapsed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var cursor: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface `T$159` {
    var itemStyle: SunburstItemStyleOption<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var label: SunburstLabelOption?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SunburstSeriesLevelOption : SunburstStateOption<SunburstDataParams>, StatesOptionMixin<SunburstStateOption<SunburstDataParams>, SunburstStatesMixin> {
    var radius: Array<dynamic /* Number | String */>?
        get() = definedExternally
        set(value) = definedExternally
    var r: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var r0: dynamic /* Number? | String? */
        get() = definedExternally
        set(value) = definedExternally
    var highlight: `T$159`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface SortParam {
    var dataIndex: Number
    var depth: Number
    var height: Number
    fun getValue(): Number
}

external interface SunburstSeriesOption : SeriesOption<SunburstStateOption<SunburstDataParams>, SunburstStatesMixin>, SunburstStateOption<SunburstDataParams>, SunburstColorByMixin, CircleLayoutOptionMixin {
    override var type: String? /* "sunburst" */
        get() = definedExternally
        set(value) = definedExternally
    var clockwise: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var startAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var minAngle: Number?
        get() = definedExternally
        set(value) = definedExternally
    var stillShowZeroSum: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var nodeClick: dynamic /* "rootToNode" | "link" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var renderLabelForZeroData: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    override var data: Any? // Array<SunburstSeriesNodeItemOption>?
        get() = definedExternally
        set(value) = definedExternally
    var levels: Array<SunburstSeriesLevelOption>?
        get() = definedExternally
        set(value) = definedExternally
    var animationType: String? /* "expansion" | "scale" */
        get() = definedExternally
        set(value) = definedExternally
    var sort: dynamic /* "desc" | "asc" | ((a: SortParam, b: SortParam) -> Number)? */
        get() = definedExternally
        set(value) = definedExternally
    override var colorBy: String? /* "series" | "data" */
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphicComponentBaseElementOption /*: Pick<Element__0, dynamic /* Any | "silent" | "ignore" | "textConfig" | "draggable" | "onclick" | "ondblclick" | "onmousewheel" | "onmouseout" | "onmouseup" | "onmousedown" | "onmousemove" | "oncontextmenu" | "ondrag" | "ondragstart" | "ondragend" | "ondragenter" | "ondragleave" | "ondragover" | "ondrop" */>, Pick<BoxLayoutOptionMixin, String /* "left" | "right" | "top" | "bottom" */>*/ {
    @nativeGetter
    operator fun get(key: String): String? /* "merge" | "replace" | "remove" */
    @nativeSetter
    operator fun set(key: String, value: String? /* "merge" | "replace" | "remove" */)
    var type: String?
        get() = definedExternally
        set(value) = definedExternally
    var id: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var parentId: dynamic /* String? | Number? */
        get() = definedExternally
        set(value) = definedExternally
    var parentOption: dynamic /* GraphicComponentGroupOption? | GraphicComponentZRPathOption? | GraphicComponentImageOption? | GraphicComponentTextOption? */
        get() = definedExternally
        set(value) = definedExternally
    var children: Array<dynamic /* GraphicComponentGroupOption | GraphicComponentZRPathOption | GraphicComponentImageOption | GraphicComponentTextOption */>?
        get() = definedExternally
        set(value) = definedExternally
    var hv: dynamic /* JsTuple<Boolean, Boolean> */
        get() = definedExternally
        set(value) = definedExternally
    var bounding: String? /* "raw" | "all" */
        get() = definedExternally
        set(value) = definedExternally
    var info: GraphicExtraElementInfo?
        get() = definedExternally
        set(value) = definedExternally
    var clipPath: dynamic /* typealias Omit = dynamic | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var textContent: dynamic /* typealias Omit = dynamic */
        get() = definedExternally
        set(value) = definedExternally
    var textConfig: ElementTextConfig?
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: CommonTooltipOption<Any>?
        get() = definedExternally
        set(value) = definedExternally
    var enterAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    var updateAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    var leaveAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphicComponentDisplayableOption : GraphicComponentBaseElementOption /*, Pick<Displayable__0, String /* "zlevel" | "z" | "z2" | "invisible" | "cursor" */>*/ {
    var style: dynamic /* PathStyleProps? | ImageStyleProps? | TSpanStyleProps? | TextStyleProps? */
        get() = definedExternally
        set(value) = definedExternally
    var z2: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphicComponentGroupOption : GraphicComponentBaseElementOption, TransitionOptionMixin<GroupProps> {
    override var type: String? /* "group" */
        get() = definedExternally
        set(value) = definedExternally
    var width: Number?
        get() = definedExternally
        set(value) = definedExternally
    var height: Number?
        get() = definedExternally
        set(value) = definedExternally
    var keyframeAnimation: dynamic /* ElementKeyframeAnimationOption<GroupProps>? | Array<ElementKeyframeAnimationOption<GroupProps>>? */
        get() = definedExternally
        set(value) = definedExternally
    override var enterAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    override var updateAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    override var leaveAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphicComponentZRPathOption : GraphicComponentDisplayableOption, TransitionOptionMixin<PathProps> {
    var shape: Dictionary<Any>? /* Dictionary<Any>? & TransitionOptionMixin<Dictionary<Any>>? */
        get() = definedExternally
        set(value) = definedExternally
    override var style: PathStyleProps? /* PathStyleProps? & TransitionOptionMixin<PathStyleProps>? */
        get() = definedExternally
        set(value) = definedExternally
    var keyframeAnimation: dynamic /* ElementKeyframeAnimationOption<PathProps>? | Array<ElementKeyframeAnimationOption<PathProps>>? */
        get() = definedExternally
        set(value) = definedExternally
    override var enterAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    override var updateAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    override var leaveAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphicComponentImageOption : GraphicComponentDisplayableOption, TransitionOptionMixin<ImageProps> {
    override var type: String? /* "image" */
        get() = definedExternally
        set(value) = definedExternally
    override var style: ImageStyleProps? /* ImageStyleProps? & TransitionOptionMixin<ImageStyleProps>? */
        get() = definedExternally
        set(value) = definedExternally
    var keyframeAnimation: dynamic /* ElementKeyframeAnimationOption<ImageProps>? | Array<ElementKeyframeAnimationOption<ImageProps>>? */
        get() = definedExternally
        set(value) = definedExternally
    override var enterAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    override var updateAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
    override var leaveAnimation: `AnimationOption$1`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphicComponentTextOption :/* Omit<GraphicComponentDisplayableOption, String /* "textContent" | "textConfig" */>,*/ TransitionOptionMixin<TextProps> {
    var type: String? /* "text" */
        get() = definedExternally
        set(value) = definedExternally
    var style: TextStyleProps? /* TextStyleProps? & TransitionOptionMixin<TextStyleProps>? */
        get() = definedExternally
        set(value) = definedExternally
    var keyframeAnimation: dynamic /* ElementKeyframeAnimationOption<TextProps>? | Array<ElementKeyframeAnimationOption<TextProps>>? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface GraphicComponentOption : ComponentOption, AnimationOptionMixin {
    var elements: Array<dynamic /* GraphicComponentGroupOption | GraphicComponentZRPathOption | GraphicComponentImageOption | GraphicComponentTextOption */>?
        get() = definedExternally
        set(value) = definedExternally
}

external var ICON_TYPES: dynamic /* JsTuple<String, String, String, String, String, String> */

external interface ToolboxBrushFeatureOption : ToolboxFeatureOption {
    var type: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    override var icon: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var title: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ToolboxDataViewFeatureOption : ToolboxFeatureOption {
    var readOnly: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var optionToContent: ((option: `T$178` /* `T$178` & AnimationOptionMixin & ColorPaletteOptionMixin */) -> dynamic)?
        get() = definedExternally
        set(value) = definedExternally
    var contentToOption: ((viewMain: HTMLDivElement, oldOption: `T$178` /* `T$178` & AnimationOptionMixin & ColorPaletteOptionMixin */) -> `T$178`)?
        get() = definedExternally
        set(value) = definedExternally
    override var icon: String?
        get() = definedExternally
        set(value) = definedExternally
    override var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var lang: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var textColor: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var textareaColor: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var textareaBorderColor: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var buttonColor: ColorString?
        get() = definedExternally
        set(value) = definedExternally
    var buttonTextColor: ColorString?
        get() = definedExternally
        set(value) = definedExternally
}

external var `ICON_TYPES$1`: dynamic /* JsTuple<String, String> */

external interface ToolboxDataZoomFeatureOption : ToolboxFeatureOption {
    var type: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    override var icon: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var title: Any?
        get() = definedExternally
        set(value) = definedExternally
    var filterMode: String? /* "filter" | "weakFilter" | "empty" | "none" */
        get() = definedExternally
        set(value) = definedExternally
    var xAxisIndex: dynamic /* Number? | Array<Number>? | "all" | "none" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisIndex: dynamic /* Number? | Array<Number>? | "all" | "none" | Boolean? */
        get() = definedExternally
        set(value) = definedExternally
    var xAxisId: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var yAxisId: dynamic /* String? | Number? | Array<dynamic /* String | Number */>? */
        get() = definedExternally
        set(value) = definedExternally
    var brushStyle: ItemStyleOption__0?
        get() = definedExternally
        set(value) = definedExternally
}

external var `ICON_TYPES$2`: dynamic /* JsTuple<String, String, String> */

external var TITLE_TYPES: dynamic /* JsTuple<String, String, String, String> */

external interface `T$160` {
    var line: Number?
        get() = definedExternally
        set(value) = definedExternally
    var bar: Number?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ToolboxMagicTypeFeatureOption : ToolboxFeatureOption {
    var type: Array<Any>?
        get() = definedExternally
        set(value) = definedExternally
    override var icon: Any?
        get() = definedExternally
        set(value) = definedExternally
    override var title: Any?
        get() = definedExternally
        set(value) = definedExternally
    var option: Any?
        get() = definedExternally
        set(value) = definedExternally
    var seriesIndex: `T$160`?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ToolboxRestoreFeatureOption : ToolboxFeatureOption {
    override var icon: String?
        get() = definedExternally
        set(value) = definedExternally
    override var title: String?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ToolboxSaveAsImageFeatureOption : ToolboxFeatureOption {
    override var icon: String?
        get() = definedExternally
        set(value) = definedExternally
    override var title: String?
        get() = definedExternally
        set(value) = definedExternally
    var type: String? /* "png" | "jpeg" */
        get() = definedExternally
        set(value) = definedExternally
    var backgroundColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var connectedBackgroundColor: dynamic /* ColorString? | LinearGradientObject? | RadialGradientObject? | ImagePatternObject? | SVGPatternObject? */
        get() = definedExternally
        set(value) = definedExternally
    var name: String?
        get() = definedExternally
        set(value) = definedExternally
    var excludeComponents: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
    var pixelRatio: Number?
        get() = definedExternally
        set(value) = definedExternally
    var lang: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface ToolboxComponentOption : ToolboxOption

external interface SeriesInjectedOption {
    var markArea: MarkAreaOption?
        get() = definedExternally
        set(value) = definedExternally
    var markLine: MarkLineOption?
        get() = definedExternally
        set(value) = definedExternally
    var markPoint: MarkPointOption?
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: CommonTooltipOption<CallbackDataParams>? /* CommonTooltipOption<CallbackDataParams>? & `T$25`? */
        get() = definedExternally
        set(value) = definedExternally
}

external interface RegisteredSeriesOption {
    var line: LineSeriesOption /* LineSeriesOption & SeriesInjectedOption */
    var bar: BarSeriesOption /* BarSeriesOption & SeriesInjectedOption */
    var scatter: ScatterSeriesOption /* ScatterSeriesOption & SeriesInjectedOption */
    var pie: PieSeriesOption /* PieSeriesOption & SeriesInjectedOption */
    var radar: RadarSeriesOption /* RadarSeriesOption & SeriesInjectedOption */
    var map: MapSeriesOption /* MapSeriesOption & SeriesInjectedOption */
    var tree: TreeSeriesOption /* TreeSeriesOption & SeriesInjectedOption */
    var treemap: TreemapSeriesOption /* TreemapSeriesOption & SeriesInjectedOption */
    var graph: GraphSeriesOption /* GraphSeriesOption & SeriesInjectedOption */
    var gauge: GaugeSeriesOption /* GaugeSeriesOption & SeriesInjectedOption */
    var funnel: FunnelSeriesOption /* FunnelSeriesOption & SeriesInjectedOption */
    var parallel: ParallelSeriesOption /* ParallelSeriesOption & SeriesInjectedOption */
    var sankey: SankeySeriesOption /* SankeySeriesOption & SeriesInjectedOption */
    var boxplot: BoxplotSeriesOption /* BoxplotSeriesOption & SeriesInjectedOption */
    var candlestick: CandlestickSeriesOption /* CandlestickSeriesOption & SeriesInjectedOption */
    var effectScatter: EffectScatterSeriesOption /* EffectScatterSeriesOption & SeriesInjectedOption */
    var lines: LinesSeriesOption /* LinesSeriesOption & SeriesInjectedOption */
    var heatmap: HeatmapSeriesOption /* HeatmapSeriesOption & SeriesInjectedOption */
    var pictorialBar: PictorialBarSeriesOption /* PictorialBarSeriesOption & SeriesInjectedOption */
    var themeRiver: ThemeRiverSeriesOption /* ThemeRiverSeriesOption & SeriesInjectedOption */
    var sunburst: SunburstSeriesOption /* SunburstSeriesOption & SeriesInjectedOption */
    var custom: CustomSeriesOption /* CustomSeriesOption & SeriesInjectedOption */
}

external interface EChartsOption : ECBasicOption {
    var dataset: dynamic /* DatasetOption? | Array<DatasetOption>? */
        get() = definedExternally
        set(value) = definedExternally
    var aria: AriaOption?
        get() = definedExternally
        set(value) = definedExternally
    var title: dynamic /* TitleOption? | Array<TitleOption>? */
        get() = definedExternally
        set(value) = definedExternally
    var grid: dynamic /* GridOption? | Array<GridOption>? */
        get() = definedExternally
        set(value) = definedExternally
    var radar: dynamic /* RadarOption? | Array<RadarOption>? */
        get() = definedExternally
        set(value) = definedExternally
    var polar: dynamic /* PolarOption? | Array<PolarOption>? */
        get() = definedExternally
        set(value) = definedExternally
    var geo: dynamic /* GeoOption? | Array<GeoOption>? */
        get() = definedExternally
        set(value) = definedExternally
    var angleAxis: dynamic /* ValueAxisBaseOption? | LogAxisBaseOption? | CategoryAxisBaseOption? | TimeAxisBaseOption? | AxisBaseOptionCommon? | Array<dynamic /* ValueAxisBaseOption | LogAxisBaseOption | CategoryAxisBaseOption | TimeAxisBaseOption | AxisBaseOptionCommon */>? */
        get() = definedExternally
        set(value) = definedExternally
    var radiusAxis: dynamic /* ValueAxisBaseOption? | LogAxisBaseOption? | CategoryAxisBaseOption? | TimeAxisBaseOption? | AxisBaseOptionCommon? | Array<dynamic /* ValueAxisBaseOption | LogAxisBaseOption | CategoryAxisBaseOption | TimeAxisBaseOption | AxisBaseOptionCommon */>? */
        get() = definedExternally
        set(value) = definedExternally
    var xAxis: dynamic /* ValueAxisBaseOption? | LogAxisBaseOption? | CategoryAxisBaseOption? | TimeAxisBaseOption? | AxisBaseOptionCommon? | Array<dynamic /* ValueAxisBaseOption | LogAxisBaseOption | CategoryAxisBaseOption | TimeAxisBaseOption | AxisBaseOptionCommon */>? */
        get() = definedExternally
        set(value) = definedExternally
    var yAxis: dynamic /* ValueAxisBaseOption? | LogAxisBaseOption? | CategoryAxisBaseOption? | TimeAxisBaseOption? | AxisBaseOptionCommon? | Array<dynamic /* ValueAxisBaseOption | LogAxisBaseOption | CategoryAxisBaseOption | TimeAxisBaseOption | AxisBaseOptionCommon */>? */
        get() = definedExternally
        set(value) = definedExternally
    var singleAxis: dynamic /* ValueAxisBaseOption? | LogAxisBaseOption? | CategoryAxisBaseOption? | TimeAxisBaseOption? | AxisBaseOptionCommon? | Array<dynamic /* ValueAxisBaseOption | LogAxisBaseOption | CategoryAxisBaseOption | TimeAxisBaseOption | AxisBaseOptionCommon */>? */
        get() = definedExternally
        set(value) = definedExternally
    var parallel: dynamic /* ParallelCoordinateSystemOption? | Array<ParallelCoordinateSystemOption>? */
        get() = definedExternally
        set(value) = definedExternally
    var parallelAxis: dynamic /* ValueAxisBaseOption? | LogAxisBaseOption? | CategoryAxisBaseOption? | TimeAxisBaseOption? | AxisBaseOptionCommon? | Array<dynamic /* ValueAxisBaseOption | LogAxisBaseOption | CategoryAxisBaseOption | TimeAxisBaseOption | AxisBaseOptionCommon */>? */
        get() = definedExternally
        set(value) = definedExternally
    var calendar: dynamic /* CalendarOption? | Array<CalendarOption>? */
        get() = definedExternally
        set(value) = definedExternally
    var toolbox: dynamic /* ToolboxComponentOption? | Array<ToolboxComponentOption>? */
        get() = definedExternally
        set(value) = definedExternally
    var tooltip: dynamic /* TooltipOption? | Array<TooltipOption>? */
        get() = definedExternally
        set(value) = definedExternally
    var axisPointer: dynamic /* AxisPointerOption? | Array<AxisPointerOption>? */
        get() = definedExternally
        set(value) = definedExternally
    var brush: dynamic /* BrushOption? | Array<BrushOption>? */
        get() = definedExternally
        set(value) = definedExternally
    override var timeline: dynamic /* TimelineOption? | SliderTimelineOption? */
        get() = definedExternally
        set(value) = definedExternally
    var legend: dynamic /* LegendOption? | ScrollableLegendOption? | Array<dynamic /* LegendOption | ScrollableLegendOption */>? */
        get() = definedExternally
        set(value) = definedExternally
    var dataZoom: dynamic /* SliderDataZoomOption? | InsideDataZoomOption? | Array<dynamic /* SliderDataZoomOption | InsideDataZoomOption */>? */
        get() = definedExternally
        set(value) = definedExternally
    var visualMap: dynamic /* ContinousVisualMapOption? | PiecewiseVisualMapOption? | Array<dynamic /* ContinousVisualMapOption | PiecewiseVisualMapOption */>? */
        get() = definedExternally
        set(value) = definedExternally
    var graphic: dynamic /* GraphicComponentOption? | GraphicComponentGroupOption? | GraphicComponentZRPathOption? | GraphicComponentImageOption? | GraphicComponentTextOption? | Array<dynamic /* GraphicComponentOption | GraphicComponentGroupOption | GraphicComponentZRPathOption | GraphicComponentImageOption | GraphicComponentTextOption */>? */
        get() = definedExternally
        set(value) = definedExternally
    var series: dynamic /* SeriesOption$1? | Array<SeriesOption$1>? */
        get() = definedExternally
        set(value) = definedExternally
    override var options: Array<Any>? // <EChartsOption>?
        get() = definedExternally
        set(value) = definedExternally
}