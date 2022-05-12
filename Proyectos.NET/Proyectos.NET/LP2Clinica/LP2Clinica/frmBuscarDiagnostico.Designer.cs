namespace LP2Clinica
{
    partial class frmBuscarDiagnostico
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.lblTitulo = new System.Windows.Forms.Label();
            this.btnBuscar = new System.Windows.Forms.Button();
            this.txtIngresoCodigo = new System.Windows.Forms.TextBox();
            this.lblCodigoCita = new System.Windows.Forms.Label();
            this.dtgCitas = new System.Windows.Forms.DataGridView();
            this.btnSeleccionar = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.dtgCitas)).BeginInit();
            this.SuspendLayout();
            // 
            // lblTitulo
            // 
            this.lblTitulo.AutoSize = true;
            this.lblTitulo.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(4)))), ((int)(((byte)(37)))), ((int)(((byte)(91)))));
            this.lblTitulo.Font = new System.Drawing.Font("Tw Cen MT Condensed Extra Bold", 26.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTitulo.ForeColor = System.Drawing.Color.White;
            this.lblTitulo.Location = new System.Drawing.Point(12, 20);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(415, 41);
            this.lblTitulo.TabIndex = 61;
            this.lblTitulo.Text = "BUSQUEDA DE DIAGNÓSTICOS";
            // 
            // btnBuscar
            // 
            this.btnBuscar.BackColor = System.Drawing.Color.MediumSeaGreen;
            this.btnBuscar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnBuscar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnBuscar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnBuscar.ForeColor = System.Drawing.Color.White;
            this.btnBuscar.Location = new System.Drawing.Point(485, 81);
            this.btnBuscar.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.btnBuscar.Name = "btnBuscar";
            this.btnBuscar.Size = new System.Drawing.Size(88, 29);
            this.btnBuscar.TabIndex = 93;
            this.btnBuscar.Text = "Buscar";
            this.btnBuscar.UseVisualStyleBackColor = false;
            // 
            // txtIngresoCodigo
            // 
            this.txtIngresoCodigo.Location = new System.Drawing.Point(19, 87);
            this.txtIngresoCodigo.Name = "txtIngresoCodigo";
            this.txtIngresoCodigo.Size = new System.Drawing.Size(374, 20);
            this.txtIngresoCodigo.TabIndex = 92;
            // 
            // lblCodigoCita
            // 
            this.lblCodigoCita.AutoSize = true;
            this.lblCodigoCita.BackColor = System.Drawing.Color.Transparent;
            this.lblCodigoCita.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCodigoCita.ForeColor = System.Drawing.Color.White;
            this.lblCodigoCita.Location = new System.Drawing.Point(15, 62);
            this.lblCodigoCita.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblCodigoCita.Name = "lblCodigoCita";
            this.lblCodigoCita.Size = new System.Drawing.Size(218, 22);
            this.lblCodigoCita.TabIndex = 91;
            this.lblCodigoCita.Text = "Ingresa el código de la cita:";
            // 
            // dtgCitas
            // 
            this.dtgCitas.AllowUserToAddRows = false;
            this.dtgCitas.BackgroundColor = System.Drawing.Color.LightSteelBlue;
            this.dtgCitas.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dtgCitas.GridColor = System.Drawing.Color.DarkTurquoise;
            this.dtgCitas.Location = new System.Drawing.Point(19, 117);
            this.dtgCitas.Name = "dtgCitas";
            this.dtgCitas.RowHeadersWidth = 51;
            this.dtgCitas.Size = new System.Drawing.Size(554, 318);
            this.dtgCitas.TabIndex = 90;
            // 
            // btnSeleccionar
            // 
            this.btnSeleccionar.BackColor = System.Drawing.Color.MediumSeaGreen;
            this.btnSeleccionar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnSeleccionar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnSeleccionar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSeleccionar.ForeColor = System.Drawing.Color.White;
            this.btnSeleccionar.Location = new System.Drawing.Point(353, 460);
            this.btnSeleccionar.Margin = new System.Windows.Forms.Padding(4, 4, 4, 4);
            this.btnSeleccionar.Name = "btnSeleccionar";
            this.btnSeleccionar.Size = new System.Drawing.Size(220, 29);
            this.btnSeleccionar.TabIndex = 89;
            this.btnSeleccionar.Text = "Seleccionar";
            this.btnSeleccionar.UseVisualStyleBackColor = false;
            // 
            // frmBuscarDiagnostico
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = global::LP2Clinica.Properties.Resources.PANTALLA_4;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(611, 531);
            this.Controls.Add(this.btnBuscar);
            this.Controls.Add(this.txtIngresoCodigo);
            this.Controls.Add(this.lblCodigoCita);
            this.Controls.Add(this.dtgCitas);
            this.Controls.Add(this.btnSeleccionar);
            this.Controls.Add(this.lblTitulo);
            this.DoubleBuffered = true;
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "frmBuscarDiagnostico";
            this.Text = "Busqueda de Diagnostico";
            ((System.ComponentModel.ISupportInitialize)(this.dtgCitas)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label lblTitulo;
        private System.Windows.Forms.Button btnBuscar;
        private System.Windows.Forms.TextBox txtIngresoCodigo;
        private System.Windows.Forms.Label lblCodigoCita;
        private System.Windows.Forms.DataGridView dtgCitas;
        private System.Windows.Forms.Button btnSeleccionar;
    }
}