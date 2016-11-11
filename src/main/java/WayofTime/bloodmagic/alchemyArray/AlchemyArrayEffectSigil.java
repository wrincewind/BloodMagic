package WayofTime.bloodmagic.alchemyArray;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import WayofTime.bloodmagic.api.alchemyCrafting.AlchemyArrayEffect;
import WayofTime.bloodmagic.api.iface.ISigil;

public class AlchemyArrayEffectSigil extends AlchemyArrayEffect
{
    private final ISigil sigil;

    public AlchemyArrayEffectSigil(String key, ISigil sigil)
    {
        super(key);
        this.sigil = sigil;
    }

    @Override
    public boolean update(TileEntity tile, int ticksActive)
    {
        //TODO: Need particles.
        if (sigil.hasArrayEffect())
        {
            sigil.performArrayEffect(tile.getWorld(), tile.getPos());
        }

        return false;
    }

    @Override
    public void writeToNBT(NBTTagCompound tag)
    {

    }

    @Override
    public void readFromNBT(NBTTagCompound tag)
    {

    }

    @Override
    public AlchemyArrayEffect getNewCopy()
    {
        return new AlchemyArrayEffectSigil(key, sigil);
    }
}