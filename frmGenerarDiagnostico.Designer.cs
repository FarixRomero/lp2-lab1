namespace LP2Clinica
{
    partial class frmGenerarDiagnostico
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
            this.lblResultado = new System.Windows.Forms.Label();
            this.txtResultado = new System.Windows.Forms.TextBox();
            this.lblObservacion = new System.Windows.Forms.Label();
            this.txtObservacion = new System.Windows.Forms.TextBox();
            this.btnEditar = new System.Windows.Forms.Button();
            this.btnEliminar = new System.Windows.Forms.Button();
            this.btnNuevo = new System.Windows.Forms.Button();
            this.btnSeleccionar = new System.Windows.Forms.Button();
            this.gpPaciente = new System.Windows.Forms.GroupBox();
            this.lblEstadoDiagnostico = new System.Windows.Forms.Label();
            this.lblEstado = new System.Windows.Forms.Label();
            this.lblFechaCita = new System.Windows.Forms.Label();
            this.lblFecha = new System.Windows.Forms.Label();
            this.lblIDCita = new System.Windows.Forms.Label();
            this.lblNombrePaciente = new System.Windows.Forms.Label();
            this.lblCita = new System.Windows.Forms.Label();
            this.lblPaciente = new System.Windows.Forms.Label();
            this.dtgReceta = new System.Windows.Forms.DataGridView();
            this.bnCancelar = new System.Windows.Forms.Button();
            this.btnRegistrar = new System.Windows.Forms.Button();
            this.lblLineasReceta = new System.Windows.Forms.Label();
            this.txtSeleccionar = new System.Windows.Forms.TextBox();
            this.btnBuscar = new System.Windows.Forms.Button();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.gpPaciente.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dtgReceta)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // lblTitulo
            // 
            this.lblTitulo.AutoSize = true;
            this.lblTitulo.BackColor = System.Drawing.Color.Transparent;
            this.lblTitulo.Font = new System.Drawing.Font("Tw Cen MT Condensed Extra Bold", 26.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTitulo.ForeColor = System.Drawing.Color.White;
            this.lblTitulo.Location = new System.Drawing.Point(41, 47);
            this.lblTitulo.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblTitulo.Name = "lblTitulo";
            this.lblTitulo.Size = new System.Drawing.Size(251, 51);
            this.lblTitulo.TabIndex = 73;
            this.lblTitulo.Text = "DIAGNÓSTICO";
            // 
            // lblResultado
            // 
            this.lblResultado.AutoSize = true;
            this.lblResultado.BackColor = System.Drawing.Color.Transparent;
            this.lblResultado.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblResultado.ForeColor = System.Drawing.Color.White;
            this.lblResultado.Location = new System.Drawing.Point(35, 223);
            this.lblResultado.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblResultado.Name = "lblResultado";
            this.lblResultado.Size = new System.Drawing.Size(272, 28);
            this.lblResultado.TabIndex = 74;
            this.lblResultado.Text = "Resultados del Diagnóstico:";
            // 
            // txtResultado
            // 
            this.txtResultado.Font = new System.Drawing.Font("Tw Cen MT Condensed Extra Bold", 36F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtResultado.Location = new System.Drawing.Point(36, 249);
            this.txtResultado.Margin = new System.Windows.Forms.Padding(4);
            this.txtResultado.Name = "txtResultado";
            this.txtResultado.Size = new System.Drawing.Size(689, 72);
            this.txtResultado.TabIndex = 75;
            // 
            // lblObservacion
            // 
            this.lblObservacion.AutoSize = true;
            this.lblObservacion.BackColor = System.Drawing.Color.Transparent;
            this.lblObservacion.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblObservacion.ForeColor = System.Drawing.Color.White;
            this.lblObservacion.Location = new System.Drawing.Point(35, 322);
            this.lblObservacion.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblObservacion.Name = "lblObservacion";
            this.lblObservacion.Size = new System.Drawing.Size(312, 28);
            this.lblObservacion.TabIndex = 76;
            this.lblObservacion.Text = "Observaciones del Diagnóstico:";
            // 
            // txtObservacion
            // 
            this.txtObservacion.Font = new System.Drawing.Font("Tw Cen MT Condensed Extra Bold", 36F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txtObservacion.Location = new System.Drawing.Point(39, 348);
            this.txtObservacion.Margin = new System.Windows.Forms.Padding(4);
            this.txtObservacion.Name = "txtObservacion";
            this.txtObservacion.Size = new System.Drawing.Size(689, 72);
            this.txtObservacion.TabIndex = 77;
            // 
            // btnEditar
            // 
            this.btnEditar.BackColor = System.Drawing.Color.Teal;
            this.btnEditar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnEditar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnEditar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnEditar.ForeColor = System.Drawing.Color.White;
            this.btnEditar.Location = new System.Drawing.Point(371, 601);
            this.btnEditar.Margin = new System.Windows.Forms.Padding(4);
            this.btnEditar.Name = "btnEditar";
            this.btnEditar.Size = new System.Drawing.Size(117, 29);
            this.btnEditar.TabIndex = 81;
            this.btnEditar.Text = "Editar";
            this.btnEditar.UseVisualStyleBackColor = false;
            // 
            // btnEliminar
            // 
            this.btnEliminar.BackColor = System.Drawing.Color.Teal;
            this.btnEliminar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnEliminar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnEliminar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnEliminar.ForeColor = System.Drawing.Color.White;
            this.btnEliminar.Location = new System.Drawing.Point(131, 601);
            this.btnEliminar.Margin = new System.Windows.Forms.Padding(4);
            this.btnEliminar.Name = "btnEliminar";
            this.btnEliminar.Size = new System.Drawing.Size(107, 29);
            this.btnEliminar.TabIndex = 80;
            this.btnEliminar.Text = "Eliminar";
            this.btnEliminar.UseVisualStyleBackColor = false;
            // 
            // btnNuevo
            // 
            this.btnNuevo.BackColor = System.Drawing.Color.Teal;
            this.btnNuevo.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnNuevo.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnNuevo.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnNuevo.ForeColor = System.Drawing.Color.White;
            this.btnNuevo.Location = new System.Drawing.Point(246, 601);
            this.btnNuevo.Margin = new System.Windows.Forms.Padding(4);
            this.btnNuevo.Name = "btnNuevo";
            this.btnNuevo.Size = new System.Drawing.Size(117, 29);
            this.btnNuevo.TabIndex = 79;
            this.btnNuevo.Text = "Nuevo";
            this.btnNuevo.UseVisualStyleBackColor = false;
            // 
            // btnSeleccionar
            // 
            this.btnSeleccionar.BackColor = System.Drawing.Color.MediumSeaGreen;
            this.btnSeleccionar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnSeleccionar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnSeleccionar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnSeleccionar.ForeColor = System.Drawing.Color.White;
            this.btnSeleccionar.Location = new System.Drawing.Point(508, 601);
            this.btnSeleccionar.Margin = new System.Windows.Forms.Padding(4);
            this.btnSeleccionar.Name = "btnSeleccionar";
            this.btnSeleccionar.Size = new System.Drawing.Size(220, 29);
            this.btnSeleccionar.TabIndex = 78;
            this.btnSeleccionar.Text = "Seleccionar";
            this.btnSeleccionar.UseVisualStyleBackColor = false;
            // 
            // gpPaciente
            // 
            this.gpPaciente.Controls.Add(this.lblEstadoDiagnostico);
            this.gpPaciente.Controls.Add(this.lblEstado);
            this.gpPaciente.Controls.Add(this.lblFechaCita);
            this.gpPaciente.Controls.Add(this.lblFecha);
            this.gpPaciente.Controls.Add(this.lblIDCita);
            this.gpPaciente.Controls.Add(this.lblNombrePaciente);
            this.gpPaciente.Controls.Add(this.lblCita);
            this.gpPaciente.Controls.Add(this.lblPaciente);
            this.gpPaciente.Location = new System.Drawing.Point(39, 122);
            this.gpPaciente.Margin = new System.Windows.Forms.Padding(4);
            this.gpPaciente.Name = "gpPaciente";
            this.gpPaciente.Padding = new System.Windows.Forms.Padding(4);
            this.gpPaciente.Size = new System.Drawing.Size(687, 97);
            this.gpPaciente.TabIndex = 82;
            this.gpPaciente.TabStop = false;
            this.gpPaciente.Text = "Datos del Paciente";
            // 
            // lblEstadoDiagnostico
            // 
            this.lblEstadoDiagnostico.AutoSize = true;
            this.lblEstadoDiagnostico.Font = new System.Drawing.Font("Tw Cen MT", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblEstadoDiagnostico.Location = new System.Drawing.Point(562, 55);
            this.lblEstadoDiagnostico.Name = "lblEstadoDiagnostico";
            this.lblEstadoDiagnostico.Size = new System.Drawing.Size(82, 22);
            this.lblEstadoDiagnostico.TabIndex = 7;
            this.lblEstadoDiagnostico.Text = "Concluida";
            // 
            // lblEstado
            // 
            this.lblEstado.AutoSize = true;
            this.lblEstado.Location = new System.Drawing.Point(447, 55);
            this.lblEstado.Name = "lblEstado";
            this.lblEstado.Size = new System.Drawing.Size(67, 22);
            this.lblEstado.TabIndex = 6;
            this.lblEstado.Text = "Estado:";
            // 
            // lblFechaCita
            // 
            this.lblFechaCita.AutoSize = true;
            this.lblFechaCita.Font = new System.Drawing.Font("Tw Cen MT", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblFechaCita.Location = new System.Drawing.Point(562, 26);
            this.lblFechaCita.Name = "lblFechaCita";
            this.lblFechaCita.Size = new System.Drawing.Size(66, 22);
            this.lblFechaCita.TabIndex = 5;
            this.lblFechaCita.Text = "--/--/--";
            // 
            // lblFecha
            // 
            this.lblFecha.AutoSize = true;
            this.lblFecha.Location = new System.Drawing.Point(447, 26);
            this.lblFecha.Name = "lblFecha";
            this.lblFecha.Size = new System.Drawing.Size(138, 22);
            this.lblFecha.TabIndex = 4;
            this.lblFecha.Text = "Fecha de la cita:";
            // 
            // lblIDCita
            // 
            this.lblIDCita.AutoSize = true;
            this.lblIDCita.Font = new System.Drawing.Font("Tw Cen MT", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblIDCita.Location = new System.Drawing.Point(154, 55);
            this.lblIDCita.Name = "lblIDCita";
            this.lblIDCita.Size = new System.Drawing.Size(64, 22);
            this.lblIDCita.TabIndex = 3;
            this.lblIDCita.Text = "ID CITA";
            // 
            // lblNombrePaciente
            // 
            this.lblNombrePaciente.AutoSize = true;
            this.lblNombrePaciente.Font = new System.Drawing.Font("Tw Cen MT", 11.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblNombrePaciente.Location = new System.Drawing.Point(154, 26);
            this.lblNombrePaciente.Name = "lblNombrePaciente";
            this.lblNombrePaciente.Size = new System.Drawing.Size(170, 22);
            this.lblNombrePaciente.TabIndex = 2;
            this.lblNombrePaciente.Text = "Nombre del Paciente";
            // 
            // lblCita
            // 
            this.lblCita.AutoSize = true;
            this.lblCita.Location = new System.Drawing.Point(7, 55);
            this.lblCita.Name = "lblCita";
            this.lblCita.Size = new System.Drawing.Size(112, 22);
            this.lblCita.TabIndex = 1;
            this.lblCita.Text = "ID de la Cita:";
            // 
            // lblPaciente
            // 
            this.lblPaciente.AutoSize = true;
            this.lblPaciente.Location = new System.Drawing.Point(7, 26);
            this.lblPaciente.Name = "lblPaciente";
            this.lblPaciente.Size = new System.Drawing.Size(178, 22);
            this.lblPaciente.TabIndex = 0;
            this.lblPaciente.Text = "Nombre del Paciente:";
            // 
            // dtgReceta
            // 
            this.dtgReceta.AllowUserToAddRows = false;
            this.dtgReceta.BackgroundColor = System.Drawing.Color.LightSteelBlue;
            this.dtgReceta.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dtgReceta.GridColor = System.Drawing.Color.DarkTurquoise;
            this.dtgReceta.Location = new System.Drawing.Point(39, 444);
            this.dtgReceta.Name = "dtgReceta";
            this.dtgReceta.RowHeadersWidth = 51;
            this.dtgReceta.Size = new System.Drawing.Size(686, 150);
            this.dtgReceta.TabIndex = 83;
            // 
            // bnCancelar
            // 
            this.bnCancelar.BackColor = System.Drawing.Color.LightSeaGreen;
            this.bnCancelar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.bnCancelar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.bnCancelar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.bnCancelar.ForeColor = System.Drawing.Color.White;
            this.bnCancelar.Location = new System.Drawing.Point(39, 637);
            this.bnCancelar.Name = "bnCancelar";
            this.bnCancelar.Size = new System.Drawing.Size(158, 33);
            this.bnCancelar.TabIndex = 84;
            this.bnCancelar.Text = "Cancelar";
            this.bnCancelar.UseVisualStyleBackColor = false;
            this.bnCancelar.Click += new System.EventHandler(this.bnCancelar_Click);
            // 
            // btnRegistrar
            // 
            this.btnRegistrar.BackColor = System.Drawing.Color.LightSeaGreen;
            this.btnRegistrar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnRegistrar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnRegistrar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnRegistrar.ForeColor = System.Drawing.Color.White;
            this.btnRegistrar.Location = new System.Drawing.Point(568, 637);
            this.btnRegistrar.Name = "btnRegistrar";
            this.btnRegistrar.Size = new System.Drawing.Size(158, 33);
            this.btnRegistrar.TabIndex = 85;
            this.btnRegistrar.Text = "Registrar";
            this.btnRegistrar.UseVisualStyleBackColor = false;
            // 
            // lblLineasReceta
            // 
            this.lblLineasReceta.AutoSize = true;
            this.lblLineasReceta.BackColor = System.Drawing.Color.Transparent;
            this.lblLineasReceta.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblLineasReceta.ForeColor = System.Drawing.Color.White;
            this.lblLineasReceta.Location = new System.Drawing.Point(35, 416);
            this.lblLineasReceta.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.lblLineasReceta.Name = "lblLineasReceta";
            this.lblLineasReceta.Size = new System.Drawing.Size(197, 28);
            this.lblLineasReceta.TabIndex = 86;
            this.lblLineasReceta.Text = "Seleccionar Receta:";
            // 
            // txtSeleccionar
            // 
            this.txtSeleccionar.Location = new System.Drawing.Point(256, 417);
            this.txtSeleccionar.Name = "txtSeleccionar";
            this.txtSeleccionar.Size = new System.Drawing.Size(374, 28);
            this.txtSeleccionar.TabIndex = 87;
            // 
            // btnBuscar
            // 
            this.btnBuscar.BackColor = System.Drawing.Color.MediumSeaGreen;
            this.btnBuscar.FlatAppearance.BorderColor = System.Drawing.Color.Silver;
            this.btnBuscar.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.btnBuscar.Font = new System.Drawing.Font("Tw Cen MT", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnBuscar.ForeColor = System.Drawing.Color.White;
            this.btnBuscar.Location = new System.Drawing.Point(637, 412);
            this.btnBuscar.Margin = new System.Windows.Forms.Padding(4);
            this.btnBuscar.Name = "btnBuscar";
            this.btnBuscar.Size = new System.Drawing.Size(88, 29);
            this.btnBuscar.TabIndex = 88;
            this.btnBuscar.Text = "Buscar";
            this.btnBuscar.UseVisualStyleBackColor = false;
            // 
            // pictureBox1
            // 
            this.pictureBox1.BackColor = System.Drawing.Color.Transparent;
            this.pictureBox1.Image = global::LP2Clinica.Properties.Resources._1786559;
            this.pictureBox1.Location = new System.Drawing.Point(438, 33);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(81, 75);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 89;
            this.pictureBox1.TabStop = false;
            // 
            // frmGenerarDiagnostico
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(10F, 22F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackgroundImage = global::LP2Clinica.Properties.Resources.PANTALLA_3;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.ClientSize = new System.Drawing.Size(786, 675);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.btnBuscar);
            this.Controls.Add(this.txtSeleccionar);
            this.Controls.Add(this.lblLineasReceta);
            this.Controls.Add(this.btnRegistrar);
            this.Controls.Add(this.bnCancelar);
            this.Controls.Add(this.dtgReceta);
            this.Controls.Add(this.gpPaciente);
            this.Controls.Add(this.btnEditar);
            this.Controls.Add(this.btnEliminar);
            this.Controls.Add(this.btnNuevo);
            this.Controls.Add(this.btnSeleccionar);
            this.Controls.Add(this.txtObservacion);
            this.Controls.Add(this.lblObservacion);
            this.Controls.Add(this.txtResultado);
            this.Controls.Add(this.lblResultado);
            this.Controls.Add(this.lblTitulo);
            this.DoubleBuffered = true;
            this.Font = new System.Drawing.Font("Tw Cen MT", 11.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Margin = new System.Windows.Forms.Padding(4);
            this.Name = "frmGenerarDiagnostico";
            this.Text = "Generar Diagnóstico";
            this.gpPaciente.ResumeLayout(false);
            this.gpPaciente.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dtgReceta)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label lblTitulo;
        private System.Windows.Forms.Label lblResultado;
        private System.Windows.Forms.TextBox txtResultado;
        private System.Windows.Forms.Label lblObservacion;
        private System.Windows.Forms.TextBox txtObservacion;
        private System.Windows.Forms.Button btnEditar;
        private System.Windows.Forms.Button btnEliminar;
        private System.Windows.Forms.Button btnNuevo;
        private System.Windows.Forms.Button btnSeleccionar;
        private System.Windows.Forms.GroupBox gpPaciente;
        private System.Windows.Forms.DataGridView dtgReceta;
        private System.Windows.Forms.Button bnCancelar;
        private System.Windows.Forms.Button btnRegistrar;
        private System.Windows.Forms.Label lblLineasReceta;
        private System.Windows.Forms.TextBox txtSeleccionar;
        private System.Windows.Forms.Button btnBuscar;
        private System.Windows.Forms.Label lblEstadoDiagnostico;
        private System.Windows.Forms.Label lblEstado;
        private System.Windows.Forms.Label lblFechaCita;
        private System.Windows.Forms.Label lblFecha;
        private System.Windows.Forms.Label lblIDCita;
        private System.Windows.Forms.Label lblNombrePaciente;
        private System.Windows.Forms.Label lblCita;
        private System.Windows.Forms.Label lblPaciente;
        private System.Windows.Forms.PictureBox pictureBox1;
    }
}