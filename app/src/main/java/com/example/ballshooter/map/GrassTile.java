package com.example.ballshooter.map;

import android.graphics.Canvas;
import android.graphics.Rect;

import com.example.ballshooter.graphics.Sprite;
import com.example.ballshooter.graphics.SpriteSheet;

public class GrassTile extends Tile {

    private final Sprite sprite;

    public GrassTile(SpriteSheet spriteSheet, Rect mapLocationRect) {
        super(mapLocationRect);
        sprite = spriteSheet.getGrassSprite();
    }

    @Override
    public void draw(Canvas canvas) {
        sprite.draw(canvas, mapLocationRect.left, mapLocationRect.top);
    }
}
