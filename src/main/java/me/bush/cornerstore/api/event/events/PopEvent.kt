package me.bush.cornerstore.api.event.events

import me.bush.eventbuskotlin.Event
import net.minecraft.entity.Entity

/**
 * @author bush
 * @since 2/6/2022
 */
class PopEvent(val entity: Entity) : Event() {
    override val cancellable = false
}
