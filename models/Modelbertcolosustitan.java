// Made with Blockbench 3.8.0
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelbertcolosustitan extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public Modelbertcolosustitan() {
		textureWidth = 8192;
		textureHeight = 8192;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-512.0F, -4072.0F, -512.0F, 1024.0F, 1024.0F, 1024.0F, 0.0F, false);
		Head.setTextureOffset(4002, 0).addBox(-527.5F, -4087.5F, -527.5F, 1055.0F, 1055.0F, 1055.0F, 0.5F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(2052, 2047).addBox(-512.0F, -3048.0F, -256.0F, 1024.0F, 1536.0F, 512.0F, 0.0F, false);
		Body.setTextureOffset(2021, 4099).addBox(-503.5F, -3039.5F, -263.5F, 1055.0F, 1567.0F, 543.0F, 0.5F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-512.0F, -2920.0F, 0.0F);
		RightArm.setTextureOffset(0, 2039).addBox(-512.0F, -128.0F, -256.0F, 512.0F, 1536.0F, 512.0F, 0.0F, false);
		RightArm.setTextureOffset(0, 6004).addBox(-565.25F, -181.25F, -287.75F, 597.0F, 1621.0F, 597.0F, 0.25F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(512.0F, -2920.0F, 0.0F);
		LeftArm.setTextureOffset(0, 2050).addBox(0.0F, -128.0F, -256.0F, 512.0F, 1536.0F, 512.0F, 0.0F, false);
		LeftArm.setTextureOffset(0, 6112).addBox(-23.5F, -119.5F, -263.5F, 543.0F, 1567.0F, 543.0F, 0.5F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-256.0F, -1512.0F, 0.0F);
		RightLeg.setTextureOffset(3835, 6147).addBox(-243.2F, 0.0F, -256.0F, 512.0F, 1536.0F, 512.0F, 0.0F, false);
		RightLeg.setTextureOffset(6090, 6132).addBox(-264.45F, 10.75F, -271.75F, 533.0F, 1557.0F, 533.0F, 0.25F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(256.0F, -1612.0F, 0.0F);
		LeftLeg.setTextureOffset(2046, 6147).addBox(-268.8F, 100.0F, -256.0F, 512.0F, 1536.0F, 512.0F, 0.0F, false);
		LeftLeg.setTextureOffset(4957, 4064).addBox(-258.05F, 110.75F, -263.75F, 533.0F, 1557.0F, 533.0F, 0.25F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}