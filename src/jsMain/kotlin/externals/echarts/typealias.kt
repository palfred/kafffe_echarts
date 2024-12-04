package externals.echarts

import tsstdlib.*

typealias MapToType<T, S> = Any

typealias KeyOfDistributive<T> = Any

typealias WithThisType<Func, This> = (self: This, args: Parameters<Func>) -> ReturnType<Func>

typealias SVGVNodeAttrs = Record<String, dynamic /* String? | Number? | Boolean? */>

typealias Bind1<F, Ctx> = Any

typealias Bind2<F, Ctx, T1> = Any

typealias Bind3<F, Ctx, T1, T2> = Any

typealias Bind4<F, Ctx, T1, T2, T3> = Any

typealias Bind5<F, Ctx, T1, T2, T3, T4> = Any

typealias BindFunc<Ctx> = (self: Ctx, arg: Any) -> Any

typealias Curry1<F, T1> = Any

typealias Curry2<F, T1, T2> = Any

typealias Curry3<F, T1, T2, T3> = Any

typealias Curry4<F, T1, T2, T3, T4> = Any

typealias CurryFunc = (arg: Any) -> Any

typealias SliceParams = Parameters<Any>


typealias util_d_Bind1<F, Ctx> = Bind1<F, Ctx>

typealias util_d_Bind2<F, Ctx, T1> = Bind2<F, Ctx, T1>

typealias util_d_Bind3<F, Ctx, T1, T2> = Bind3<F, Ctx, T1, T2>

typealias util_d_Bind4<F, Ctx, T1, T2, T3> = Bind4<F, Ctx, T1, T2, T3>

typealias util_d_Bind5<F, Ctx, T1, T2, T3, T4> = Bind5<F, Ctx, T1, T2, T3, T4>

typealias util_d_Curry1<F, T1> = Curry1<F, T1>

typealias util_d_Curry2<F, T1, T2> = Curry2<F, T1, T2>

typealias util_d_Curry3<F, T1, T2, T3> = Curry3<F, T1, T2, T3>

typealias util_d_Curry4<F, T1, T2, T3, T4> = Curry4<F, T1, T2, T3, T4>

typealias util_d_HashMap<T, KEY> = HashMap<T, KEY>

typealias EventCallbackSingleParam<EvtParam> = Any

typealias EventCallback<EvtParams> = Any

typealias CbThis<Ctx, Impl> = Any

typealias DefaultEventDefinition = Dictionary<EventCallback<Array<Any>>>

typealias VectorArray = Array<Number>

typealias vector_d_VectorArray = VectorArray

typealias MatrixArray = Array<Number>

typealias matrix_d_MatrixArray = MatrixArray

typealias easingFunc = (percent: Number) -> Number

typealias OnframeCallback = (percent: Number) -> Unit

typealias ondestroyCallback = () -> Unit

typealias onrestartCallback = () -> Unit

typealias DoneCallback = () -> Unit

typealias AbortCallback = () -> Unit

typealias `OnframeCallback$1`<T> = (target: T, percent: Number) -> Unit

typealias PathPropertyType = Any

typealias ElementEventCallback<Ctx, Impl> = (self: `CbThis$1`<Ctx, Impl>, e: ElementEvent) -> dynamic

typealias `CbThis$1`<Ctx, Impl> = Any

typealias ElementCalculateTextPosition = (out: TextPositionCalculationResult, style: ElementTextConfig, rect: RectLike) -> TextPositionCalculationResult

typealias DisplayablePropertyType = Any

typealias ElementSSRData = HashMap__1<Any>

typealias ElementSSRDataGetter<T> = (el: Element__0) -> HashMap__1<T>

typealias zrender_d_ZRenderInitOpt = ZRenderInitOpt

typealias zrender_d_ElementSSRData = ElementSSRData

typealias zrender_d_ElementSSRDataGetter<T> = ElementSSRDataGetter<T>

typealias zrender_d_ZRenderType = ZRenderType

typealias SVGPathOption = Omit<PathProps, String /* "shape" | "buildPath" */>

typealias Constructor = Any

typealias DiffKeyGetter<CTX> = (self: DataDiffer<CTX>, value: Any, index: Number) -> String

typealias DiffCallbackAdd = (newIndex: Number) -> Unit

typealias DiffCallbackUpdate = (newIndex: Number, oldIndex: Number) -> Unit

typealias DiffCallbackRemove = (oldIndex: Number) -> Unit

typealias DiffCallbackUpdateManyToOne = (newIndex: Number, oldIndex: Array<Number>) -> Unit

typealias DiffCallbackUpdateOneToMany = (newIndex: Array<Number>, oldIndex: Number) -> Unit

typealias DiffCallbackUpdateManyToMany = (newIndex: Array<Number>, oldIndex: Array<Number>) -> Unit

typealias PipedDataTransformOption = Array<DataTransformOption>

typealias DataTransformType = String

typealias DataTransformConfig = Any

typealias TaskResetCallback<Ctx> = (self: Task<Ctx>, context: Ctx) -> dynamic

typealias TaskProgressCallback<Ctx> = (self: Task<Ctx>, params: TaskProgressParams, context: Ctx) -> Unit

typealias TaskPlanCallback<Ctx> = (self: Task<Ctx>, context: Ctx) -> dynamic

typealias TaskCountCallback<Ctx> = (self: Task<Ctx>, context: Ctx) -> Number

typealias TaskOnDirtyCallback<Ctx> = (self: Task<Ctx>, context: Ctx) -> Unit

typealias TaskDataIteratorNext = () -> Number

typealias GeneralTask = Task<TaskContext>

typealias SeriesTask = Task<SeriesTaskContext>

typealias AxisLabelValueFormatter = (value: Number, index: Number) -> String

typealias AxisLabelCategoryFormatter = (value: String, index: Number) -> String

typealias EChartsExtensionInstallRegisters = Any

typealias EChartsExtensionInstaller = (ec: EChartsExtensionInstallRegisters) -> Unit

typealias BrushDimensionMinMax = Array<Number>

typealias ExtendPropertyType<T, ET, ST> = Any

typealias BarWidthAndOffset = Dictionary<Dictionary<`T$174`>>

typealias BarGridLayoutResult = Array<Any>

typealias CustomExtraElementInfo = Dictionary<Any>

typealias CreateCustomBuitinPathOption<T> = Any

typealias WrapEncodeDefRet = Dictionary<Array<Number>>

typealias CustomSeriesRenderItem = (params: CustomSeriesRenderItemParams, api: CustomSeriesRenderItemAPI) -> dynamic

typealias PrepareCustomInfo = (coordSys: CoordinateSystem) -> `T$177`

typealias EachCb = (args: Any) -> Unit

typealias FilterCb = (args: Any) -> Boolean

typealias MapCb = (args: Any) -> dynamic

typealias DimValueGetter = (self: DataStore, dataItem: Any, property: String, dataIndex: Number, dimIndex: DimensionIndex) -> dynamic

typealias TreeTraverseCallback<Ctx> = (self: Ctx, node: TreeNode) -> dynamic

typealias VisualOptionBase = Any

typealias LabelFormatter = (min: dynamic /* String? | Number? | Date? */, max: dynamic /* String? | Number? | Date? */) -> String

typealias CtxOrList<Ctx> = Any

typealias EachCb0<Ctx> = (self: CtxOrList<Ctx>, idx: Number) -> Unit

typealias EachCb1<Ctx> = (self: CtxOrList<Ctx>, x: dynamic /* Number | OrdinalNumber | String */, idx: Number) -> Unit

typealias EachCb2<Ctx> = (self: CtxOrList<Ctx>, x: dynamic /* Number | OrdinalNumber | String */, y: dynamic /* Number | OrdinalNumber | String */, idx: Number) -> Unit

typealias `EachCb$1`<Ctx> = (self: CtxOrList<Ctx>, args: Any) -> Unit

typealias FilterCb0<Ctx> = (self: CtxOrList<Ctx>, idx: Number) -> Boolean

typealias FilterCb1<Ctx> = (self: CtxOrList<Ctx>, x: dynamic /* Number | OrdinalNumber | String */, idx: Number) -> Boolean

typealias FilterCb2<Ctx> = (self: CtxOrList<Ctx>, x: dynamic /* Number | OrdinalNumber | String */, y: dynamic /* Number | OrdinalNumber | String */, idx: Number) -> Boolean

typealias `FilterCb$1`<Ctx> = (self: CtxOrList<Ctx>, args: Any) -> Boolean

typealias MapArrayCb0<Ctx> = (self: CtxOrList<Ctx>, idx: Number) -> Any

typealias MapArrayCb1<Ctx> = (self: CtxOrList<Ctx>, x: dynamic /* Number | OrdinalNumber | String */, idx: Number) -> Any

typealias MapArrayCb2<Ctx> = (self: CtxOrList<Ctx>, x: dynamic /* Number | OrdinalNumber | String */, y: dynamic /* Number | OrdinalNumber | String */, idx: Number) -> Any

typealias MapArrayCb<Ctx> = (self: CtxOrList<Ctx>, args: Any) -> Any

typealias MapCb1<Ctx> = (self: CtxOrList<Ctx>, x: dynamic /* Number | OrdinalNumber | String */, idx: Number) -> dynamic

typealias MapCb2<Ctx> = (self: CtxOrList<Ctx>, x: dynamic /* Number | OrdinalNumber | String */, y: dynamic /* Number | OrdinalNumber | String */, idx: Number) -> dynamic

typealias SeriesDimensionName = DimensionName

typealias ExtendShapeReturn = ReturnType<Any>

typealias SVGPathCtor = ReturnType<Any>

typealias `SVGPath$1` = InstanceType<SVGPathCtor>

typealias `TextStyleProps$1` = TextStyleProps


typealias ColorString = String

typealias ZRTextAlign = String

typealias ZRTextVerticalAlign = String

typealias ZRRectLike = RectLike

typealias ComponentFullType = String

typealias ComponentSubType = Any

typealias StageHandlerProgressParams = TaskProgressParams

typealias OrdinalNumber = Number

typealias DimensionIndex = Number

typealias DimensionName = String

typealias DimensionType = Any

typealias OptionSourceDataOriginal<VAL, ORIITEM> = ArrayLike<ORIITEM>

typealias OptionSourceDataObjectRows<VAL> = Array<Dictionary<VAL>>

typealias OptionSourceDataArrayRows<VAL> = Array<Array<VAL>>

typealias OptionSourceDataKeyedColumns<VAL> = Dictionary<ArrayLike<VAL>>

typealias OptionSourceDataTypedArray = ArrayLike<Number>

typealias ModelOption = Any

typealias ThemeOption = Dictionary<Any>

typealias EncodeDefaulter = (source: Source, dimCount: Number) -> OptionEncode

typealias PaletteOptionMixin = ColorPaletteOptionMixin

typealias AnimationDurationCallback = (idx: Number) -> Number

typealias AnimationDelayCallback = (idx: Number, params: AnimationDelayCallbackParam) -> Number

typealias SymbolSizeCallback<T> = (rawValue: Any, params: T) -> dynamic

typealias SymbolCallback<T> = (rawValue: Any, params: T) -> String

typealias SymbolRotateCallback<T> = (rawValue: Any, params: T) -> Number

typealias SymbolOffsetCallback<T> = (rawValue: Any, params: T) -> dynamic

typealias VisualOptionFixed = VisualOptionUnit

typealias VisualOptionPiecewise = VisualOptionUnit

typealias LabelLayoutOptionCallback = (params: LabelLayoutOptionCallbackParams) -> LabelLayoutOption

typealias SamplingFunc = (frame: ArrayLike<Number>) -> Number

typealias LocaleOption = Any

typealias SetOptionTransitionOptItem = UpdateLifecycleTransitionItem

typealias RegisterMapParams = Parameters<Any>

typealias ThrottleFunction = (self: Any, args: Any) -> Unit

typealias EnableDataStackDimensionsInputLegacy = Array<dynamic /* SeriesDimensionDefine | String */>

//typealias graphic_d_Group = Group
//
//typealias graphic_d_Circle = Circle
//
//typealias graphic_d_Ellipse = Ellipse
//
//typealias graphic_d_Sector = Sector
//
//typealias graphic_d_Ring = Ring
//
//
//typealias graphic_d_Polygon = Polygon
//
//typealias graphic_d_Polyline = Polyline
//
//typealias graphic_d_Rect = Rect
//
//typealias graphic_d_Line = Line
//
//typealias graphic_d_BezierCurve = BezierCurve
//
//typealias graphic_d_Arc = Arc
//
//typealias graphic_d_IncrementalDisplayable = IncrementalDisplayable
//
//typealias graphic_d_CompoundPath = CompoundPath
//
//typealias graphic_d_LinearGradient = LinearGradient
//
//typealias graphic_d_RadialGradient = RadialGradient
//
//typealias graphic_d_BoundingRect = BoundingRect

typealias GetMainType<OptionUnion> = Any

typealias ExtractComponentOption<OptionUnion, ExtractMainType> = Any

typealias GetDependency<DependencyOption> = Any

typealias GetDependencies<MainType> = GetDependency<Any>

typealias CheckMainType<OptionUnionMainType> = Any

typealias RadarSeriesDataValue = Array<dynamic /* String? | Number? | Date? */>

typealias HeatmapDataValue = Array<dynamic /* String? | Number? | Date? */>

typealias GraphicExtraElementInfo = Dictionary<Any>

typealias `SeriesOption$1` = Any

typealias ZRText = Any
typealias Nothing = Any

typealias ParallelSeriesDataValue = Array<dynamic /* String? | Number? | Date? */>

typealias BoxplotDataValue = Array<dynamic /* Number | "-" */>

typealias CandlestickDataValue = Array<dynamic /* String? | Number? | Date? */>

typealias LinesCoords = Array<Array<Number>>

