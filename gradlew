<?xml version="1.0" encoding="utf-8"?>
<resources>
    <attr format="reference" name="cardViewStyle"/>
    <color name="cardview_dark_background">#FF424242</color>
    <color name="cardview_light_background">#FFFFFFFF</color>
    <color name="cardview_shadow_end_color">#03000000</color>
    <color name="cardview_shadow_start_color">#37000000</color>
    <declare-styleable name="CardView">
        <!-- Background color for CardView. -->
        <attr format="color" name="cardBackgroundColor"/>
        <!-- Corner radius for CardView. -->
        <attr format="dimension" name="cardCornerRadius"/>
        <!-- Elevation for CardView. -->
        <attr format="dimension" name="cardElevation"/>
        <!-- Maximum Elevation for CardView. -->
        <attr format="dimension" name="cardMaxElevation"/>
        <!-- Add padding in API v21+ as well to have the same measurements with previous versions. -->
        <attr format="boolean" name="cardUseCompatPadding"/>
        <!-- Add padding to CardView on v20 and before to prevent intersections between the Card content and rounded corners. -->
        <attr format="boolean" name="cardPreventCornerOverlap"/>
        <!-- Inner padding between the edges of the Card and children of the CardView. -->
        <attr format="dimension" name="contentPadding"/>
        <!-- Inner padding between the left edge of the Card and children of the CardView. -->
        <attr format="dimension" name="contentPaddingLeft"/>
        <!-- Inner padding between the right edge of the Card and children of the CardView. -->
        <attr format="dimension" name="contentPaddingRight"/>
        <!-- Inner padding between the top edge of the Card and children of the CardView. -->
        <attr format="dimension" name="contentPaddingTop"/>
        <!-- Inner padding between the bottom edge of the Card and children of the CardView. -->
        <attr format="dimension" name="contentPaddingBottom"/>
        <!-- Workaround to read user defined minimum width -->
        <attr name="android:minWidth"/>
        <!-- Workaround to read user defined minimum height -->
        <attr name="android:minHeight"/>
    </declare-styleable>
    <dimen name="cardview_compat_inset_shadow">1dp</dimen>
    <dimen name="cardview_default_elevation">2dp</dimen>
    <dimen name="cardview_default_radius">2dp</dimen>
    <style name="Base.CardView" parent="android:Widget">
        <item name="cardCornerRadius">@dimen/cardview_default_radius</item>
        <item name="cardElevation">@dimen/cardview_default_elevation</item>
        <item name="cardMaxElevation">@dimen/cardview_default_elevation</item>
        <item name="cardUseCompatPadding">false</item>
        <item name="cardPreventCornerOverlap">true</item>
    </style>
    <style name="CardView" parent="Base.CardView">
    </style>
    <style name="CardView.Dark">
        <item name="cardBackgroundColor">@color/cardview_dark_background</item>
    </style>
    <style name="CardView.Light">
        <item name="cardBackgroundColor">@color/cardview_light_background</item>
    </style>
</resources>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               