package com.ifatich.glint.core_ui.tokens

import androidx.compose.ui.graphics.Color

/**
 * Primitive Colors
 * Base color palette used throughout the Glint design system
 */
object PrimitiveColors {
    // Neutral Colors
    val Neutral0 = Color(0xFFFFFFFF)    // White
    val Neutral50 = Color(0xFFFAFAFA)   // Almost white
    val Neutral100 = Color(0xFFF5F5F5)  // Very light gray
    val Neutral200 = Color(0xFFEEEEEE)  // Light gray
    val Neutral300 = Color(0xFFE0E0E0)  // Medium light gray
    val Neutral400 = Color(0xFFBDBDBD)  // Medium gray
    val Neutral500 = Color(0xFF9E9E9E)  // Medium gray
    val Neutral600 = Color(0xFF757575)  // Dark gray
    val Neutral700 = Color(0xFF616161)  // Darker gray
    val Neutral800 = Color(0xFF424242)  // Very dark gray
    val Neutral900 = Color(0xFF212121)  // Almost black
    val Neutral1000 = Color(0xFF000000) // Black

    // Primary Colors
    val Primary50 = Color(0xFFE3F2FD)
    val Primary100 = Color(0xFFBBDEFB)
    val Primary200 = Color(0xFF90CAF9)
    val Primary300 = Color(0xFF64B5F6)
    val Primary400 = Color(0xFF42A5F5)
    val Primary500 = Color(0xFF2196F3)  // Primary blue
    val Primary600 = Color(0xFF1E88E5)
    val Primary700 = Color(0xFF1976D2)
    val Primary800 = Color(0xFF1565C0)
    val Primary900 = Color(0xFF0D47A1)

    // Secondary Colors
    val Secondary50 = Color(0xFFF3E5F5)
    val Secondary100 = Color(0xFFE1BEE7)
    val Secondary200 = Color(0xFFCE93D8)
    val Secondary300 = Color(0xFFBA68C8)
    val Secondary400 = Color(0xFFAB47BC)
    val Secondary500 = Color(0xFF9C27B0)  // Secondary purple
    val Secondary600 = Color(0xFF8E24AA)
    val Secondary700 = Color(0xFF7B1FA2)
    val Secondary800 = Color(0xFF6A1B9A)
    val Secondary900 = Color(0xFF4A148C)

    // Success Colors
    val Success50 = Color(0xFFE8F5E9)
    val Success100 = Color(0xFFC8E6C9)
    val Success200 = Color(0xFFA5D6A7)
    val Success300 = Color(0xFF81C784)
    val Success400 = Color(0xFF66BB6A)
    val Success500 = Color(0xFF4CAF50)  // Success green
    val Success600 = Color(0xFF43A047)
    val Success700 = Color(0xFF388E3C)
    val Success800 = Color(0xFF2E7D32)
    val Success900 = Color(0xFF1B5E20)

    // Warning Colors
    val Warning50 = Color(0xFFFFF3E0)
    val Warning100 = Color(0xFFFFE0B2)
    val Warning200 = Color(0xFFFFD54F)
    val Warning300 = Color(0xFFFFCA28)
    val Warning400 = Color(0xFFFBC02D)
    val Warning500 = Color(0xFFFBC02D)  // Warning amber
    val Warning600 = Color(0xFFF9A825)
    val Warning700 = Color(0xFFF57F17)
    val Warning800 = Color(0xFFF57C00)
    val Warning900 = Color(0xFFE65100)

    // Error Colors
    val Error50 = Color(0xFFFFEBEE)
    val Error100 = Color(0xFFFFCDD2)
    val Error200 = Color(0xFFEF9A9A)
    val Error300 = Color(0xFFE57373)
    val Error400 = Color(0xFFEF5350)
    val Error500 = Color(0xFFF44336)  // Error red
    val Error600 = Color(0xFFE53935)
    val Error700 = Color(0xFFD32F2F)
    val Error800 = Color(0xFFC62828)
    val Error900 = Color(0xFFB71C1C)

    // Info Colors
    val Info50 = Color(0xFFE0F2F1)
    val Info100 = Color(0xFFB2DFDB)
    val Info200 = Color(0xFF80DEEA)
    val Info300 = Color(0xFF4DD0E1)
    val Info400 = Color(0xFF26C6DA)
    val Info500 = Color(0xFF00BCD4)  // Info cyan
    val Info600 = Color(0xFF00ACC1)
    val Info700 = Color(0xFF0097A7)
    val Info800 = Color(0xFF00838F)
    val Info900 = Color(0xFF006064)
}

/**
 * Semantic Colors
 * High-level color tokens that represent the semantic meaning
 */
object SemanticColors {
    // Surface Colors
    val SurfacePrimary = PrimitiveColors.Neutral0      // Main surface
    val SurfaceSecondary = PrimitiveColors.Neutral50   // Secondary surface
    val SurfaceTertiary = PrimitiveColors.Neutral100   // Tertiary surface
    val SurfaceInverse = PrimitiveColors.Neutral900    // Inverse surface

    // Text Colors
    val TextPrimary = PrimitiveColors.Neutral900       // Primary text
    val TextSecondary = PrimitiveColors.Neutral600     // Secondary text
    val TextTertiary = PrimitiveColors.Neutral500      // Tertiary text
    val TextDisabled = PrimitiveColors.Neutral400      // Disabled text
    val TextInverse = PrimitiveColors.Neutral0         // Inverse text

    // Border Colors
    val BorderPrimary = PrimitiveColors.Neutral300     // Primary border
    val BorderSecondary = PrimitiveColors.Neutral200   // Secondary border
    val BorderDisabled = PrimitiveColors.Neutral200    // Disabled border

    // Interactive Colors
    val InteractivePrimary = PrimitiveColors.Primary500        // Primary action
    val InteractivePrimaryHover = PrimitiveColors.Primary600    // Primary hover state
    val InteractivePrimaryActive = PrimitiveColors.Primary700   // Primary active state
    val InteractivePrimaryDisabled = PrimitiveColors.Neutral300 // Primary disabled

    val InteractiveSecondary = PrimitiveColors.Secondary500        // Secondary action
    val InteractiveSecondaryHover = PrimitiveColors.Secondary600   // Secondary hover state
    val InteractiveSecondaryActive = PrimitiveColors.Secondary700  // Secondary active state
    val InteractiveSecondaryDisabled = PrimitiveColors.Neutral300  // Secondary disabled

    // Feedback Colors - Success
    val FeedbackSuccessBackground = PrimitiveColors.Success50      // Success background
    val FeedbackSuccessBorder = PrimitiveColors.Success300         // Success border
    val FeedbackSuccessText = PrimitiveColors.Success700           // Success text

    // Feedback Colors - Warning
    val FeedbackWarningBackground = PrimitiveColors.Warning50      // Warning background
    val FeedbackWarningBorder = PrimitiveColors.Warning300         // Warning border
    val FeedbackWarningText = PrimitiveColors.Warning700           // Warning text

    // Feedback Colors - Error
    val FeedbackErrorBackground = PrimitiveColors.Error50          // Error background
    val FeedbackErrorBorder = PrimitiveColors.Error300             // Error border
    val FeedbackErrorText = PrimitiveColors.Error700               // Error text

    // Feedback Colors - Info
    val FeedbackInfoBackground = PrimitiveColors.Info50            // Info background
    val FeedbackInfoBorder = PrimitiveColors.Info300               // Info border
    val FeedbackInfoText = PrimitiveColors.Info700                 // Info text

    // Overlay Colors
    val OverlayLight = PrimitiveColors.Neutral1000.copy(alpha = 0.3f)  // Light overlay
    val OverlayMedium = PrimitiveColors.Neutral1000.copy(alpha = 0.5f) // Medium overlay
    val OverlayDark = PrimitiveColors.Neutral1000.copy(alpha = 0.7f)   // Dark overlay
    val OverlaySemiOpaque = PrimitiveColors.Neutral1000.copy(alpha = 0.9f) // Semi-opaque overlay

    // Scrim Color
    val Scrim = PrimitiveColors.Neutral1000.copy(alpha = 0.32f)
}

/**
 * Default color palette for light theme
 */
object GlintColorsLight {
    // Surfaces
    val surface = SemanticColors.SurfacePrimary
    val surfaceVariant = SemanticColors.SurfaceSecondary

    // Content colors
    val onSurface = SemanticColors.TextPrimary
    val onSurfaceVariant = SemanticColors.TextSecondary

    // Primary colors
    val primary = SemanticColors.InteractivePrimary
    val onPrimary = PrimitiveColors.Neutral0
    val primaryContainer = PrimitiveColors.Primary100
    val onPrimaryContainer = PrimitiveColors.Primary900

    // Secondary colors
    val secondary = SemanticColors.InteractiveSecondary
    val onSecondary = PrimitiveColors.Neutral0
    val secondaryContainer = PrimitiveColors.Secondary100
    val onSecondaryContainer = PrimitiveColors.Secondary900

    // Tertiary colors (using success for tertiary)
    val tertiary = PrimitiveColors.Success500
    val onTertiary = PrimitiveColors.Neutral0
    val tertiaryContainer = PrimitiveColors.Success100
    val onTertiaryContainer = PrimitiveColors.Success900

    // Error colors
    val error = SemanticColors.FeedbackErrorText
    val onError = PrimitiveColors.Neutral0
    val errorContainer = SemanticColors.FeedbackErrorBackground
    val onErrorContainer = SemanticColors.FeedbackErrorText

    // Outline
    val outline = SemanticColors.BorderPrimary
    val outlineVariant = SemanticColors.BorderSecondary

    // Scrim
    val scrim = SemanticColors.Scrim
}

/**
 * Default color palette for dark theme
 */
object GlintColorsDark {
    // Surfaces
    val surface = PrimitiveColors.Neutral900
    val surfaceVariant = PrimitiveColors.Neutral800

    // Content colors
    val onSurface = PrimitiveColors.Neutral100
    val onSurfaceVariant = PrimitiveColors.Neutral300

    // Primary colors
    val primary = PrimitiveColors.Primary400
    val onPrimary = PrimitiveColors.Primary900
    val primaryContainer = PrimitiveColors.Primary700
    val onPrimaryContainer = PrimitiveColors.Primary100

    // Secondary colors
    val secondary = PrimitiveColors.Secondary400
    val onSecondary = PrimitiveColors.Secondary900
    val secondaryContainer = PrimitiveColors.Secondary700
    val onSecondaryContainer = PrimitiveColors.Secondary100

    // Tertiary colors (using success for tertiary)
    val tertiary = PrimitiveColors.Success400
    val onTertiary = PrimitiveColors.Success900
    val tertiaryContainer = PrimitiveColors.Success700
    val onTertiaryContainer = PrimitiveColors.Success100

    // Error colors
    val error = PrimitiveColors.Error400
    val onError = PrimitiveColors.Error900
    val errorContainer = PrimitiveColors.Error700
    val onErrorContainer = PrimitiveColors.Error100

    // Outline
    val outline = PrimitiveColors.Neutral400
    val outlineVariant = PrimitiveColors.Neutral600

    // Scrim
    val scrim = SemanticColors.Scrim
}
